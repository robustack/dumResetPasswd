package com.small.resetpasswd.account;

import java.util.Hashtable;

public class ReturnSet {
	
	public int returnCode;
	public String errMsg;
	public String returnStr;
	public Object returnObj;
	
	private Hashtable<String, String> id_table = new Hashtable<String, String>();
	
	public ReturnSet() {

	}
	
	public void idAdd (String id, String name) {
		
		id_table.put(id, name);
		
	}
	
	public void setErrMsg(String org_msg) {


		if ( org_msg != null) {
			
			String temp_str = new String(org_msg);
			
			for ( String key : id_table.keySet() ) {
				temp_str = new String(temp_str.replace(key, id_table.get(key)));
			}
			
			errMsg = temp_str;
			
		} else {
			errMsg = new String("");
		}
		
		
		
		
	}
	


}
