package com.guchuan.plugin.jenkins.gitbucket.plugin;

import hudson.model.AbstractProject;
import hudson.model.Item;
import hudson.triggers.Trigger;
import hudson.triggers.TriggerDescriptor;

public class SampleTrigger extends Trigger<AbstractProject<?, ?>> {

	public static class DescriptorImpl extends TriggerDescriptor {

		@Override
		public boolean isApplicable(Item item) {
			// TODO Auto-generated method stub
			return true;
		}

		@Override
		public String getDisplayName() {
			// TODO Auto-generated method stub
			return "Build when new pull-trigger is made";
		}
		
	}
}
