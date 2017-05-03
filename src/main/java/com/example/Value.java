package com.example;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Value {

	private Integer id;
	
	@SerializedName("quote")
	private String sentence;

}
