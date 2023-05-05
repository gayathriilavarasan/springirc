package com.example.hospital.HospRepo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.hospital.HospModel.HospModel;

import jakarta.transaction.Transactional;

@Repository
public interface HospRepo extends JpaRepository<HospModel,Integer>{
	
	
	@Query(value="Select * from entry",nativeQuery=true)
	public List<HospModel> getAllData();
	
	@Query(value="Select * from entry where pid=:id",nativeQuery=true)
	public List<HospModel>bypname(@Param("id")int pid);
	

	@Query(value="Select * from entry where pid between ?1 and ?2",nativeQuery=true)
	public List<HospModel> startEnd( int start, int end);
	
	
	
    @Modifying
    @Transactional
    @Query(value="delete from entry where pid=?1 and pname=?2",nativeQuery=true)
    Integer deleteId(@Param("id")int pid,@Param("name")String pname);
    
    
    @Modifying
    @Transactional
    @Query(value="update entry set pid=:id where pname=:name",nativeQuery=true)
	public void updateByQuery(@Param("id")int id,@Param("name") String name);
    
    
    @Query("select g from HospModel g where pname=?1")
	public List<HospModel> getjpqlname(String name);
    
    
    @Query("select g from HospModel g where id between ?1 and ?2")
	public List<HospModel> getbtw(int start, int end);
    
    
    @Modifying
    @Transactional
    @Query("delete from HospModel where id=?1")
	public void deletejpqlid(int id);
    
    
    @Modifying
    @Transactional
    @Query("update HospModel set disease=?1 where id=?2")
	public void updatejpql(String a, int b);
	
	
	
	

}
