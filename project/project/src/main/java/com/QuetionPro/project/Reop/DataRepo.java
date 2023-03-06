package com.QuetionPro.project.Reop;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.QuetionPro.project.model.DataId;

@Repository
public interface DataRepo extends CrudRepository<DataId, String> {
	

	@Query(value ="SELECT TOP 10  * from DATA    WHERE  IS_DELETE= FALSE  AND created_At> now()-interval '15' minute ORDER BY score DESC ", nativeQuery = true)
	 public ArrayList<DataId> findlast15min();
	
	@Query(value ="SELECT  * from DATA ORDER BY created_At AESC", nativeQuery = true)
	 public ArrayList<DataId> findall();
	
	@Query(value ="SELECT  * from DATA  WHERE  IS_DELETE= FALSE", nativeQuery = true)
	 public ArrayList<DataId> showNotDeleted();

}
