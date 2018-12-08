package com.mycolections.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class abc {
	public static void main(String[] args) {
		String s[] = new String[3];
		s[0] = "aa";
		s[1] = "bb";
		s[2] = "cc";
		List<String> c = Arrays.asList(s);
		c.add("dd");
		c.add("ee");
		System.out.println(c);
		/*
		 * ArrayList <String> al=new ArrayList(); al.add("a"); al.add("b");
		 * Iterator i=al.iterator(); while (i.hasNext()) { i.remove();
		 * System.out.println(al);
		 */
	}

}
