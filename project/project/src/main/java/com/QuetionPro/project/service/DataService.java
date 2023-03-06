package com.QuetionPro.project.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.QuetionPro.project.Reop.DataRepo;
import com.QuetionPro.project.model.DataId;

@Service
public class DataService {

	@Autowired
	DataRepo dataRepo;
	
	public void addData(DataId dataId) {
	    dataRepo.save(dataId);
		
	}
	public ArrayList<DataId> dataOF15min() {
		ArrayList<DataId> dataId= new ArrayList<>();
		dataRepo.findlast15min().forEach(dataId1-> dataId.add(dataId1));
		return dataId;
	}
	public ArrayList<DataId> showData() {
		ArrayList<DataId> dataId= new ArrayList<>();
		dataRepo.findAll().forEach(dataId1->dataId.add(dataId1));
		return dataId;
	}
	public void deleData(DataId dataId, String id) {
		 dataId.setDelete(true);
		 dataRepo.save(dataId);	
	}

	public ArrayList<DataId> showDataID() {
		ArrayList<DataId> dataId= new ArrayList<>();
		dataRepo.showNotDeleted().forEach(t -> dataId.add(t));
		return dataId;
	}

}
