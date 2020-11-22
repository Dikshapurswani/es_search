package com.example.DemoElasticSearch.DemoElasticSearch.service;

import java.io.IOException;
import java.util.List;

import org.springframework.http.HttpStatus;

import com.example.DemoElasticSearch.DemoElasticSearch.dto.Employee;

public interface BulkInsert {
	 HttpStatus ingestdata(List<Employee> employee) throws InterruptedException, IOException;
}
