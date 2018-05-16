package com.java.htttp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Map;

public class HttpConnectionImplementation implements HTTPConnection {

	@Override
	public String getRequest(RequestNeeds needs) {
String response = null;
		try {
			return makeConnection(needs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
	}

	private HttpURLConnection setHeaders(HttpURLConnection con, Map<String, String> requestHeaders) {

		for (Map.Entry<String, String> entry : requestHeaders.entrySet()) {

			con.setRequestProperty(entry.getKey(), entry.getValue());

		}

		return con;
	}

	@Override
	public String postRequest(RequestNeeds needs)  {
		String response = null;
		try {
			return makeConnection(needs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public String putRequest(RequestNeeds needs){String response = null;
	try {
		return makeConnection(needs);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return response;}

	@Override
	public String deleteRequest(RequestNeeds needs) {String response = null;
	try {
		return makeConnection(needs);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return response;}

	public String makeConnection(RequestNeeds needs) throws IOException {

		URL obj = null;
		try {
			obj = new URL(needs.host + needs.path);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		try {
			con.setRequestMethod(needs.method);
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		con = setHeaders(con, needs.getRequestHeaders());

		con.setDoOutput(true);
		if (needs.payLoad != null)
			con.getOutputStream().write(needs.payLoad.getBytes());

		int responseCode = con.getResponseCode();
		System.out.println("Response Code : " + responseCode);
		StringBuffer response = new StringBuffer();

		try{
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		}catch(Exception e){
			e.printStackTrace();

		}
		return response.toString();

	}

}
