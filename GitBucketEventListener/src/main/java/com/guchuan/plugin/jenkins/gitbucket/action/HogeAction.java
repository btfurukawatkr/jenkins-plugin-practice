package com.guchuan.plugin.jenkins.gitbucket.action;

//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;

//import org.apache.http.Header;
//import org.apache.http.HttpResponse;
//import org.apache.http.NameValuePair;
//import org.apache.http.client.ClientProtocolException;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.entity.UrlEncodedFormEntity;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.impl.client.HttpClientBuilder;
//import org.apache.http.message.BasicHeader;
//import org.apache.http.message.BasicNameValuePair;
//import org.kohsuke.stapler.StaplerRequest;

import hudson.Extension;
import hudson.model.UnprotectedRootAction;
//import net.sf.json.JSONObject;

@Extension
public class HogeAction implements UnprotectedRootAction {

//	public void doIndex(StaplerRequest req) throws ClientProtocolException, IOException {
//        String payload = req.getParameter("payload");
//        if (payload == null) {
//            return;
//        }
//
//        JSONObject jObj = JSONObject.fromObject(payload);
//
//        if (jObj.containsKey("pull_request")) {
//            // action:opened/closed
//            String action = jObj.getString("action");
//            if (action != null && action.startsWith("open")) {
//                // information of pull-request
//                JSONObject pr = jObj.getJSONObject("pull_request");
//                // pull-request number
//                String prNum = pr.getString("number");
//
//                // status url
//                String statusesUrl = pr.getString("statuses_url");
//
//                // send http request // TODO move this to a utility class
//                List<Header> defaultHeaders = new ArrayList<>();
//                defaultHeaders.add(new BasicHeader("Authorization", "")); // TODO set Authorization token for git
//                HttpClient client = HttpClientBuilder.create().setDefaultHeaders(defaultHeaders).build();
//                HttpPost post = new HttpPost(statusesUrl);
//                List<NameValuePair> params = new ArrayList<>();
//                params.add(new BasicNameValuePair("state", "pending")); // TODO create status entity
//                params.add(new BasicNameValuePair("target_url", "jenkins job url"));
//                params.add(new BasicNameValuePair("description", "building pull-request"));
//                params.add(new BasicNameValuePair("context", "GitBucketPullRequestBuilder"));
//                post.setEntity(new UrlEncodedFormEntity(params));
//                HttpResponse res = client.execute(post);
//                System.out.println(res.getStatusLine().getStatusCode());
//
//                // TODO run jenkins job after changint pull-request status to PENDING
//            }
//        }
//
//    }

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
