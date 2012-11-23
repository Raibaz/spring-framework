package org.springframework.mock.staticmock;


public class Any {
	
	public static interface AnyMarker {
		public static class AnyDate extends java.util.Date implements AnyMarker{}
	}
	
	public static AnyMarker.AnyDate Date() {
		return new AnyMarker.AnyDate();
	}
	
}
