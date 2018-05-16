package com.zet1;

import java.util.Scanner;

public class ChoclateOffer {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ChoclateModel cm = new ChoclateModel(s.nextInt(),s.nextInt());
		cm.setWrap(s.nextInt());
		cm.setWrapperchoclate(s.nextInt());
		cm.setMaxVisit(s.nextInt());
		
		cm = getOffer(cm);
		System.out.println("tot"+cm.getTotChoclate());
		System.out.println("wrap"+cm.getWrapInHand());
		s.close();

	}

	private static ChoclateModel getOffer(ChoclateModel cm) {
	
		cm =getOfferChoclate(cm,0);
	
	
	
	return cm;
		
		
	}

	

	private static ChoclateModel getOfferChoclate(ChoclateModel cm,int visit) {


		
		if( cm.getChoclates() < cm.getWrap()  || cm.getMaxVisit() != 0  && visit == cm.getMaxVisit() )
			return cm;
	
		int choclate = cm.getChoclates() / cm.getWrap()  * cm.getWrapperchoclate();
		
		cm.setWrapInHand(
				cm.getChoclates() % cm.getWrap()+choclate);
		cm.setChoclates(cm.getWrapInHand());
		cm.setTotChoclate(choclate + cm.getTotChoclate());
		
		if(cm.getMaxVisit() >0)
			visit++;
		
		System.out.println(cm.getChoclates());
		System.out.println(cm.getWrapInHand());
		System.out.println(cm.getTotChoclate());

		return getOfferChoclate(cm,visit);
	}

}
