package com.example.springboot.controller;


import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.common.SolrDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class TestController {

    @Autowired
    private SolrClient client;

    @RequestMapping (value = "/test")
    public String testSolr() throws IOException, SolrServerException
    {
        SolrDocument document = client
                .getById("test", "fe7a5124-d75b-40b2-93fe-5555512ea6d2");
        System.out.println("document=======" + document);
        return document.toString();
    }
}
