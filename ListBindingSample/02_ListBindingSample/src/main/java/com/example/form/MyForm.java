package com.example.form;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class MyForm {
	private final Company company;
	private final List<FormA> listA;

	public MyForm() {
		this.company=new Company();
		this.listA = new ArrayList<>();
		for(int i=0;i<10;i++) {
			this.listA.add(new FormA());
		}
	}
    
}
