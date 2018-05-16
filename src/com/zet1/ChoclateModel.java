package com.zet1;

public class ChoclateModel {
	
	private int money;
	private int price;
	private int wrap;
	private int wrapperchoclate;
	private int choclates;
	private int wrapInHand;
	private int totChoclate;
	private int maxVisit;
	
	
	public ChoclateModel(int money, int price) {
		this.money = money;
		this.price = price;
		this.choclates = money/price;	
		this.wrapInHand=choclates;
		this.totChoclate = choclates;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getWrap() {
		return wrap;
	}
	public void setWrap(int wrap) {
		this.wrap = wrap;
	}
	public int getWrapperchoclate() {
		return wrapperchoclate;
	}
	public void setWrapperchoclate(int wrapperchoclate) {
		this.wrapperchoclate = wrapperchoclate;
	}
	public int getChoclates() {
		return choclates;
	}
	public void setChoclates(int choclates) {
		this.choclates = choclates;
	}
	public int getWrapInHand() {
		return wrapInHand;
	}
	public void setWrapInHand(int wrapInHand) {
		this.wrapInHand = wrapInHand;
	}
	public int getTotChoclate() {
		return totChoclate;
	}
	public void setTotChoclate(int totChoclate) {
		this.totChoclate = totChoclate;
	}
	
	public int getMaxVisit() {
		return maxVisit;
	}
	public void setMaxVisit(int maxVisit) {
		this.maxVisit = maxVisit;
	}
	
	

}
