package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public enum ExperienceSal {
	Fresher(10000), Experienced(25000);
	
	private int value;
//	   private static Map map = new HashMap<>();

	private ExperienceSal(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	/* static {
	        for (ExperienceSal brandNameAndPrice : ExperienceSal.values()) {
	            map.put(brandNameAndPrice.value, brandNameAndPrice);
	        }
	    }

	    public static ExperienceSal valueOf(int ExperienceSal) {
	        return (ExperienceSal) map.get(ExperienceSal);
	    }*/
}
