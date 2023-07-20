package com.bookstore.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class USConstants {
	
	public final static String US = "US";
	
	public final static Map<String, String> mapOfUSStates = new HashMap<String, String>() {
		{
			put("AP", "Andhra Pradesh");
			put("AR", "Arunachal Pradesh");
			put("AS", "Assam");
            put("BR", "Bihar");
            put("CG", "Chhattisgarh");
            put("GA", "Goa");
            put("GJ", "Gujarat");
            put("HR", "Haryana");
            put("HP", "Himachal Pradesh");
            put("JK", "Jammu and Kashmir");
            put("JH", "Jharkhand");
            put("KA", "Karnataka");
            put("KL", "Kerala");
            put("MP", "Madhya Pradesh");
            put("MH", "Maharashtra");
            put("MN", "Manipur");
            put("ML", "Meghalaya");
            put("MZ", "Mizoram");
            put("NL", "Nagaland");
            put("OR", "Orissa");
            put("PB", "Punjab");
            put("RJ", "Rajasthan");
            put("SK", "Sikkim");
            put("TN", "Tamil Nadu");
            put("TR", "Tripura");
            put("UK", "Uttarakhand");
            put("UP", "Uttar Pradesh");
            put("WB", "West Bengal");
            put("TN", "Tamil Nadu");
            put("TR", "Tripura");
            put("AN", "Andaman and Nicobar Islands");
            put("CH", "Chandigarh");
            put("DH", "Dadra and Nagar Haveli");
            put("DD", "Daman and Diu");
            put("DL", "Delhi");
            put("LD", "Lakshadweep");
            put("PY", "Pondicherry");
           
		}
	};
	
	public final static List<String> listOfUSStatesCode = new ArrayList<>(mapOfUSStates.keySet());
	public final static List<String> listOfUSStatesName = new ArrayList<>(mapOfUSStates.values());

}
