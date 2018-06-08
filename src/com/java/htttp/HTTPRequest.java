package com.java.htttp;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.java.Constants;

public class HTTPRequest {

	public static void main(String[] args) throws Exception {

		String payload = getData();

		System.out.println(payload);

		JSONArray jsonArray = new JSONArray(payload);

		// int count = stage2(jsonObject);

		// JSONObject jsonObject2 = new JSONObject();
		// jsonObject2.put("count", count);

		// stage3

		// JSONObject jsonObject2 = stage3(jsonArray);
		//
		// System.out.println(jsonObject2);

		// stage 4

		int count = stage4(jsonArray);

		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("totalValue", count);

		postData(jsonObject2);

		// System.out.println(method());

	}

	private static int stage4(JSONArray jsonArray) throws ParseException, JSONException {
		int sum = 0;

		for (int i = 0; i < jsonArray.length(); i++) {

			JSONObject jsObject = (JSONObject) jsonArray.get(i);

			String endDateStr = jsObject.get("endDate") + "";

			System.out.println(endDateStr);

			Date startDate = convertStringToDate(jsObject.get("startDate") + "", ConstantsHttp.DATE_FORMAT);

			DateFormat dateFormat = new SimpleDateFormat(ConstantsHttp.DATE_FORMAT);
			Date date = new Date();

			Date currDate = convertStringToDate(dateFormat.format(date) + "", ConstantsHttp.DATE_FORMAT);
			int price = (int) jsObject.get("price");
			System.out.println(currDate + "curr date");
			System.out.println(startDate + "startDate");
			System.out.println(price);

			boolean isCheck = true;

			if (endDateStr.equalsIgnoreCase("null") && currDate.compareTo(startDate) >= 1) {

				sum = sum + price;

			}

			if (endDateStr.equalsIgnoreCase("null"))
				continue;

			if (isCheck) {
				Date endDate = convertStringToDate(endDateStr, ConstantsHttp.DATE_FORMAT);

				System.out.println(endDate);

				if (currDate.compareTo(startDate) >= 0 && currDate.compareTo(endDate) <= 0) {
					sum = sum + price;

				}
			}

		}

		return sum;
	}

	private static JSONObject stage3(JSONArray jsonArray) throws JSONException, ParseException {

		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < jsonArray.length(); i++) {

			JSONObject jsObject = (JSONObject) jsonArray.get(i);

			String endDateStr = jsObject.get("endDate") + "";

			System.out.println(endDateStr);

			Date startDate = convertStringToDate(jsObject.get("startDate") + "", ConstantsHttp.DATE_FORMAT);

			DateFormat dateFormat = new SimpleDateFormat(ConstantsHttp.DATE_FORMAT);
			Date date = new Date();

			Date currDate = convertStringToDate(dateFormat.format(date) + "", ConstantsHttp.DATE_FORMAT);
			String category = jsObject.getString("category");
			System.out.println(currDate + "curr date");
			System.out.println(startDate + "startDate");
			System.out.println(currDate.compareTo(startDate));
			System.out.println(currDate.compareTo(startDate) >= 0);

			boolean isCheck = true;

			if (endDateStr.equalsIgnoreCase("null") && currDate.compareTo(startDate) >= 1) {

				if (map.containsKey(category))
					map.put(category, map.get(category) + 1);
				else
					map.put(category, 1);
				isCheck = false;
				continue;

			}

			if (endDateStr.equalsIgnoreCase("null"))
				continue;

			if (isCheck) {
				Date endDate = convertStringToDate(endDateStr, ConstantsHttp.DATE_FORMAT);

				System.out.println(endDate);

				if (currDate.compareTo(startDate) >= 0 && currDate.compareTo(endDate) <= 0) {
					if (map.containsKey(category))
						map.put(category, map.get(category) + 1);
					else
						map.put(category, 1);
				}
			}

		}
		JSONObject jsonObject2 = new JSONObject();

		map.forEach((k, v) -> {

			try {
				jsonObject2.put(k, v);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		return jsonObject2;
	}

	public static Date convertStringToDate(String date, String format) throws ParseException {
		SimpleDateFormat cDate = new SimpleDateFormat(format);
		Date d = new Date(cDate.parse(date).getTime());
		return cDate.parse(cDate.format(d));
	}

	private static int stage2(JSONArray jsonObject) throws JSONException, ParseException {
		int count = 0;

		for (int i = 0; i < jsonObject.length(); i++) {

			JSONObject jsObject = (JSONObject) jsonObject.get(i);

			String endDateStr = jsObject.get("endDate") + "";

			System.out.println(endDateStr);

			if (endDateStr.equalsIgnoreCase("null")) {
				count++;
				continue;
			}

			Date startDate = convertStringToDate(jsObject.get("startDate") + "", ConstantsHttp.DATE_FORMAT);

			Date endDate = convertStringToDate(endDateStr, ConstantsHttp.DATE_FORMAT);

			DateFormat dateFormat = new SimpleDateFormat(ConstantsHttp.DATE_FORMAT);
			Date date = new Date();

			Date currDate = convertStringToDate(dateFormat.format(date) + "", ConstantsHttp.DATE_FORMAT);

			if (currDate.compareTo(startDate) >= 0 && currDate.compareTo(endDate) <= 0)
				count++;

		}

		return count;
	}

	private static void postData(JSONObject jsonObject2) {

		RequestNeeds needsP = new RequestNeeds();
		needsP.setHost(ConstantsHttp.HUNT);

		needsP.setPath("/challenge/output");
		needsP.setMethod(ConstantsHttp.POST);
		needsP.setPayLoad(jsonObject2.toString());

		Map<String, String> map = new HashMap<String, String>();
		map.put(ConstantsHttp.USERID, ConstantsHttp.USERID_VALUE);
		map.put(ConstantsHttp.CONTENT_TYPE, ConstantsHttp.CONTENT_TYPE_VALUE);

		needsP.setRequestHeaders(map);

		HTTPConnection connection = new HttpConnectionImplementation();
		System.out.println(connection.postRequest(needsP));

	}

	private static String getData() {

		RequestNeeds needs = new RequestNeeds();
		needs.setHost(ConstantsHttp.HUNT);
		needs.setPath("/challenge/input");
		needs.setMethod(ConstantsHttp.GET);

		Map<String, String> map = new HashMap<String, String>();
		map.put(ConstantsHttp.USERID, ConstantsHttp.USERID_VALUE);
		map.put(ConstantsHttp.CONTENT_TYPE, ConstantsHttp.CONTENT_TYPE_VALUE);

		needs.setRequestHeaders(map);

		HTTPConnection connection = new HttpConnectionImplementation();

		String payload = connection.getRequest(needs);

		return payload;
	}

}
