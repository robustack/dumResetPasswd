package com.small.resetpasswd.account;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Op {

	public static boolean isNil(Object member) {
		
		if ( member instanceof String ) {
			if ( member == null || 
				((String) member).length() == 0 ) {
	
				//member.equals("null") || // coming from sb.append(str) str¿Ã null¿œ∂ß
				//member.equals("na") ||
				//member.equals("-")) { // dynamo db
				return true;
			} else {
				return false;
			}		
			
		} else if ( member instanceof Integer ) {
			if ( member == null || 
					((Integer) member).intValue() == 0 ) {
				return true;
			} else {
				return false;
			}
		
		} else if ( member instanceof Long ) {
			if ( member == null || 
					((Long) member).longValue() == 0L ) {
				return true;
			} else {
				return false;
			}
			
		} else if ( member instanceof List<?>) {
			if ( member == null || 
					((List<?>) member).size() == 0 ) {
				return true;
			} else {
				return false;
			}
			
		} else if ( member instanceof Set<?>) {
			if ( member == null || 
					((Set<?>) member).size() == 0 ) {
				return true;
			} else {
				return false;
			}
			
		} else if ( member instanceof String[]) {
			if ( member == null || 
					((String[]) member).length == 0 ) {
				return true;
			} else {
				return false;
			}
			
		} else {
			if ( member == null ) {
				return true;
			} else {
				return false;
			}
		} 
	}
	
	public static String toString(Object member) {
		
		if ( member == null ) return "null";
		
		StringBuilder sb = new StringBuilder();
		
		if ( member instanceof List<?> ) {
			
			@SuppressWarnings("rawtypes")
			Iterator<?> itr = ((List) member).iterator();
			
			while ( itr.hasNext()) {
				sb.append(itr.next().toString());
				if (itr.hasNext()) sb.append(" | ");
			}
			return sb.toString();
			
		} else if ( member instanceof Set<?>) {
			@SuppressWarnings("rawtypes")
			Iterator<?> itr = ((Set) member).iterator();
			
			while ( itr.hasNext()) {
				sb.append(itr.next().toString()); 
				if (itr.hasNext()) sb.append(" | ");
			}
			return sb.toString();
			
		} else if ( member instanceof String[]) {		
			List<String> mem_list 
				= Arrays.asList((String[])member);
			
			Iterator<?> itr = mem_list.iterator();
			
			while ( itr.hasNext()) {
				sb.append(itr.next().toString());
				if (itr.hasNext()) sb.append("'");
			}
			return sb.toString();
				
		} else {
			return member.toString();
		}
	}
	
	
	public static String toNewLineString(Object member) {
		
		if ( member == null ) return "null";
		
		StringBuilder sb = new StringBuilder();
		
		if ( member instanceof List<?> ) {
			
			@SuppressWarnings("rawtypes")
			Iterator<?> itr = ((List) member).iterator();
			
			while ( itr.hasNext()) {
				sb.append(itr.next().toString());
				if (itr.hasNext()) sb.append("\n");
			}
			return sb.toString();
			
		} else if ( member instanceof Set<?>) {
			@SuppressWarnings("rawtypes")
			Iterator<?> itr = ((Set) member).iterator();
			
			while ( itr.hasNext()) {
				sb.append(itr.next().toString()); 
				if (itr.hasNext()) sb.append("\n");
			}
			return sb.toString();
			
		} else if ( member instanceof String[]) {		
			List<String> mem_list 
				= Arrays.asList((String[])member);
			
			Iterator<?> itr = mem_list.iterator();
			
			while ( itr.hasNext()) {
				sb.append(itr.next().toString());
				if (itr.hasNext()) sb.append("\n");
			}
			return sb.toString();
				
		} else {
			return member.toString();
		}
	}
	
	
	public static String trToken( String content, String from, String to ) {
		
		return content.replaceAll(from, to);
	
	}



	
	
}
