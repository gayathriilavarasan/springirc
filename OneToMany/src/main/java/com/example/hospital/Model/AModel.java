package com.example.hospital.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import com.example.hospital.Model.AModel;

@Entity
public class AModel {
	@Id
	private int ansno;
	private String answer;
	public int getAnsno() {
		return ansno;
	}
	public void setAnsno(int ansno)
	{
		this.ansno=ansno;
	}
	public String getAnswer()
	{
		return answer;
	}
	public void setAnswer(String answer)
	{
		this.answer=answer;
	}

}
