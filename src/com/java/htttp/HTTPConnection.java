package com.java.htttp;

import java.io.IOException;

public interface HTTPConnection {
	
	public String getRequest(RequestNeeds req);
	public String postRequest(RequestNeeds req);
	public String putRequest(RequestNeeds req);
	public String deleteRequest(RequestNeeds req);


}
