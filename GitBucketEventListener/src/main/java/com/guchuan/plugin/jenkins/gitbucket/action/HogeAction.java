package com.guchuan.plugin.jenkins.gitbucket.action;

import org.kohsuke.stapler.StaplerRequest;

import hudson.Extension;
import hudson.model.UnprotectedRootAction;
import net.sf.json.JSONObject;

@Extension
public class HogeAction implements UnprotectedRootAction {

    @SuppressWarnings("rawtypes")
    public void doHooks(StaplerRequest req) {
        String payload = req.getParameter("payload");
        if (payload == null) {
            return;
        }

        JSONObject jObj = JSONObject.fromObject(payload);

        JSONObject repository = jObj.getJSONObject("repository");

        /*
         * pull-request
         */
        String action = jObj.getString("action");

        // pull-request number
        String prNum = jObj.getString("number");

        // information of pull-request
        JSONObject pr = jObj.getJSONObject("pull_request");

        /*
         * push
         */
        JSONObject commits = jObj.getJSONObject("commits");
    }

    @Override
    public String getIconFileName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getDisplayName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getUrlName() {
        // TODO Auto-generated method stub
        return "GitBucketEventListener";
    }

}
