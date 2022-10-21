package qedge.aug30;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// store collection of flowers
		ArrayList<String>flow=new ArrayList<String>();
		flow.add("ROSE");
		flow.add("MARIGOLD");
		flow.add("JASMINE");
		flow.add("TULIP");
		flow.add("LOTUS");
		//print size of ArrayList
		System.out.println(flow.size());
		//print fourth position value in ArrayList
		System.out.println(flow.get(3));
		//iterate all values in collection
		for (int i = 0; i < flow.size(); i++) {
			System.out.println(flow.get(i));
		}
		
		}
				
	}

