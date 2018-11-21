package com.example.springboot.controller;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.*;

/**
 * test
 *
 * @author Administrator
 * @auterAdministratorharryleng
 * @Date:2018/5/14
 */
@RestController
public class HttpClientController
{
    public  static final String TEST_URL="http://117.48.215.120:8060/api/unBindAgentTerminal";

    @RequestMapping (value = "/api/httpc")
    public String doTestHttp()
    {
        Map<String,Object> params=new HashMap<String,Object>();
        params.put("shopUserId","1");
        params.put("token","5012c4f2afcd138e5a4c4f713b2eb957");
        params.put("serialNumber","f768f3dcdcdc816b");
        params.put("terminalId","10042");
        params.put("agentId","85");
        doPost(TEST_URL,params);
        return "SUCCESS";
    }

    public static String doPost(String url, Map params)
    {
        BufferedReader in = null;
        try
        {
            // 定义HttpClient
            HttpClient client = new DefaultHttpClient();
            // 实例化HTTP方法
            HttpPost request = new HttpPost();
            request.setURI(new URI(url));
            //设置参数
            List<NameValuePair> nvps = new ArrayList<NameValuePair>();
            for (Iterator iter = params.keySet().iterator(); iter.hasNext(); )
            {
                String name = (String) iter.next();
                String value = String.valueOf(params.get(name));
                nvps.add(new BasicNameValuePair(name, value));
            }
            request.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));

            HttpResponse response = client.execute(request);
            int code = response.getStatusLine().getStatusCode();
            if (code == 200)
            {    //请求成功
                in = new BufferedReader(
                        new InputStreamReader(response.getEntity().getContent(),
                                "utf-8"));
                StringBuffer sb = new StringBuffer("");
                String line = "";
                String NL = System.getProperty("line.separator");
                while ((line = in.readLine()) != null)
                {
                    sb.append(line + NL);
                }

                in.close();
                return sb.toString();
            }
            else
            {   //
                System.out.println("状态码：" + code);
                return null;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();

            return null;
        }
    }
    }
