package com.guchuan.plugin.jenkins.gitbucket.plugin;

import java.util.logging.Logger;

import org.kohsuke.stapler.DataBoundConstructor;

import hudson.Extension;
import hudson.model.AbstractProject;
import hudson.model.Item;
import hudson.triggers.Trigger;
import hudson.triggers.TriggerDescriptor;

public class SampleTrigger extends Trigger<AbstractProject<?, ?>> {

    private boolean passThroughGitCommit;

    @DataBoundConstructor
    public SampleTrigger(boolean passThroughGitCommit) {
        this.passThroughGitCommit = passThroughGitCommit;
    }

    public boolean isPassThroughGitCommit() {
        return passThroughGitCommit;
    }

    @Override
    public GitBucketPushTriggerDescriptor getDescriptor() {
        return (GitBucketPushTriggerDescriptor) super.getDescriptor();
    }

    @Extension
    public static class GitBucketPushTriggerDescriptor extends TriggerDescriptor {

        @Override
        public boolean isApplicable(Item item) {
            return item instanceof AbstractProject;
        }

        @Override
        public String getDisplayName() {
            return "Build when a PullRequest is created on GitBucket";
        }

    }

    private static final Logger LOGGER = Logger.getLogger(SampleTrigger.class.getName());
}
