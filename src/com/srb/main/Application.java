package com.srb.main;

import java.util.ArrayList;
import java.util.List;

import com.srb.main.process.CustomIterator;

public class Application {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		CustomIterator<String> ci = new CustomIterator<String>(list);
		while (ci.hasNext()) {
			System.out.println(ci.next());
		}
	}
}
