[![Known Vulnerabilities](https://snyk.io/test/github/ocinpp/retrofit-rest-quotes/badge.svg?targetFile=pom.xml)](https://snyk.io/test/github/ocinpp/retrofit-rest-quotes?targetFile=pom.xml)[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2Focinpp%2Fretrofit-rest-quotes.svg?type=shield)](https://app.fossa.io/projects/git%2Bgithub.com%2Focinpp%2Fretrofit-rest-quotes?ref=badge_shield)


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


## License
[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2Focinpp%2Fretrofit-rest-quotes.svg?type=large)](https://app.fossa.io/projects/git%2Bgithub.com%2Focinpp%2Fretrofit-rest-quotes?ref=badge_large)