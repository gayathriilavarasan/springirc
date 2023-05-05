package com.example.hospital.Model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;




@Entity
public class QModel {
	@Id
	private int quesno;
	private String ques;
	@OneToMany(cascade =CascadeType.ALL)
	@JoinColumn
	private List<AModel> ans;
	public int getQuesno() {
		return quesno;
	}
	public void setQuesno(int quesno)
	{
		this.quesno=quesno;
	}
	public String getQues()
	{
		return ques;
	}
	public void setQues(String ques)
	{
		this.ques=ques;
	}
	public List<AModel> getAns()
	{
		return ans;
	}
	public void setAns(List<AModel> ans) {
		this.ans=ans;
		
}

	
	
	
	
	

}
