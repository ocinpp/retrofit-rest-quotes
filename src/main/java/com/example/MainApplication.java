package com.example;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.service.QuoteService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainApplication {

	private static final Logger log = LoggerFactory.getLogger(MainApplication.class);

	public void getQuote() throws IOException {
		Retrofit retrofit = new Retrofit.Builder()
							.baseUrl("http://gturnquist-quoters.cfapps.io")							
							.addConverterFactory(GsonConverterFactory.create())
							.build();
		
		QuoteService service = retrofit.create(QuoteService.class);
		
		service.getQuote().enqueue(new Callback<Quote>() {
			public void onResponse(Call<Quote> call, Response<Quote> response) {
				if (response.isSuccessful()) {
					log.info(response.body().getValue().getSentence());		        	
				} else {
					log.error(response.errorBody().toString());
				}
			}
	        	       
			public void onFailure(Call<Quote> call, Throwable t) {
	    	  log.error(t.getMessage());
	        }
		});	
	}
	
	public static void main(String[] args) throws IOException {
		MainApplication m = new MainApplication();
		m.getQuote();
	}

}
