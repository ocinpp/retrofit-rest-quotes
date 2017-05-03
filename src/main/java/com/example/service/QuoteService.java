package com.example.service;

import com.example.Quote;

import retrofit2.Call;
import retrofit2.http.GET;

public interface QuoteService {

	@GET("/api/random")
	Call<Quote> getQuote();
	
}
