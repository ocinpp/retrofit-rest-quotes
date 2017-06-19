## Description

A demo project to show how to get random quotes from a REST API [http://gturnquist-quoters.cfapps.io](http://gturnquist-quoters.cfapps.io) using Retrofit

Reference: 
[https://spring.io/guides/gs/consuming-rest/](https://spring.io/guides/gs/consuming-rest/)

### External Libraries

#### Retrofit 

For consuming REST APIs

[http://square.github.io/retrofit/](http://square.github.io/retrofit/)

#### Lombok 

For auto-generating getters and setters

[https://projectlombok.org/](https://projectlombok.org/)

#### GSON

 To unserialize dates from JSON in a particular format (e.g. dd-MM-yyyy HH:mm:ss), create a Gson object by specifying the date format  
 
	Gson gson = new GsonBuilder()
					.setDateFormat("dd-MM-yyyy HH:mm:ss")
					.create();
		
 Use the Gson object when creating the GsonConverterFactory	for use in Retrofit
		
	Retrofit retrofit = new Retrofit.Builder()
							.baseUrl("http://localhost:8080/")							
							.addConverterFactory(GsonConverterFactory.create(gson))
							.build();
							
### Extra

#### Jackson

To apply a format to dates when serializing to  JSON using Jackson 

	@JsonFormat(pattern="dd-MM-yyyy HH:mm:ss", timezone="Asia/Hong_Kong")
	private java.util.Date myDate;							