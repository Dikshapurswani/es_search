package com.example.DemoElasticSearch.DemoElasticSearch.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ESConfig {
	
	    @Value("${spring.data.elasticsearch.cluster-nodes}")
	    private String clusterNodes;
	    @Value("${spring.data.elasticsearch.cluster-name}")
	    private String clusterName;
	    private RestHighLevelClient restHighLevelClient;

	    @Bean
	    public RestHighLevelClient createInstance() {
	        return buildClient();
	    }

	    private RestHighLevelClient buildClient() {
	        try {
	            restHighLevelClient = new RestHighLevelClient(
	                    RestClient.builder(
	                            new HttpHost("localhost", 9200, "http"),
	                            new HttpHost("localhost", 9201, "http")));
	        } catch (Exception e) {
	             throw e;
	        }
	        return restHighLevelClient;
	    }

}
