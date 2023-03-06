package com.QuetionPro.project.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.QuetionPro.project.model.DataId;
import com.QuetionPro.project.service.DataService;

@RestController("/")
public class DataController {
	
	@Autowired
	DataService dataService;
	
	@PostMapping("/save")
	public String savedata( @RequestBody DataId dataId) {
		dataService.addData(dataId);
		return dataId.getId();
		
	}
	@GetMapping("/top-stories")
	public ArrayList<DataId> get15data(){
		
		return dataService.dataOF15min();
		
	}
	@GetMapping("/past-stories")
	public  ArrayList<DataId> getAllData(){
		return dataService.showData();
	}
	@PutMapping("/delete")
	public  String deleteData(@RequestBody DataId dataId) {
		dataService.deleData(dataId, dataId.getId());
		return dataId.getId();
	}

	@GetMapping("/view")
	public ArrayList<DataId>showData(){
		return dataService.showDataID();
		
	}


}
