package com.example.springboot.controller;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.PropertyResolver;

/**
 * @auterAdministratorharryleng
 * @Date:2018/4/10
 */
//@Configuration
public class SolrClientConfiguration
{
//    @Autowired
//    private PropertyResolver environment;

//    @Bean
//    public SolrClient solrClient() {
//        System.out.println("自定义配置SolrClient");
//        return new HttpSolrClient(environment.getRequiredProperty("spring.data.solr.host"));
//    }

}
