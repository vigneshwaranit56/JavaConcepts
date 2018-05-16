package com.java.htttp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HTTPRequest {

	public static void main(String[] args) throws Exception {

	
		RequestNeeds needs = new RequestNeeds();
		needs.setHost(ConstantsHttp.HUNT);
		needs.setPath("/challenge/input");
		needs.setMethod(ConstantsHttp.GET);
		
		Map<String,String> map = new HashMap<String,String>();
		map.put(ConstantsHttp.USERID, ConstantsHttp.USERID_VALUE);
		map.put(ConstantsHttp.CONTENT_TYPE, ConstantsHttp.CONTENT_TYPE_VALUE);
		
		needs.setRequestHeaders(map);
		
		HTTPConnection connection = new HttpConnectionImplementation();

		String payload = connection.getRequest(needs);
		
		System.out.println(payload);
		
		RequestNeeds needsP= new RequestNeeds();
		needsP.setHost(ConstantsHttp.HUNT);

		needsP.setPath("/challenge/output");
		needsP.setMethod(ConstantsHttp.POST);
		needsP.setPayLoad(payload);
		
		needsP.setRequestHeaders(map);
		System.out.println(connection.postRequest(needsP));
		
		(new HttpConnectionImplementation(){}).deleteRequest(needs);


//		System.out.println(method());
		
		
	}

			


}
