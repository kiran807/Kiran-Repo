package com.Request.Tests;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SpaceX {

	public static void get_Response()
	{
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://api.spacexdata.com/v4/launches";
		RequestSpecification ReqSpechttpRequest = 	RestAssured.given();
		Response res = ReqSpechttpRequest.request(Method.GET,"Latest");
		String ResposeBody = res.getBody().asString();
		System.out.println(ResposeBody);
		int StatusCode = res.statusCode();
		System.out.println(StatusCode);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	SpaceX.get_Response();
	}
	

}
