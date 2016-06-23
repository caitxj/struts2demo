package com.cai.convert;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.cai.model.Circle;
import com.opensymphony.xwork2.conversion.TypeConversionException;

public class CircleTypeConverter extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map arg0, String[] values, Class arg2) {
		String userString = values[0];
		Circle newCircle = parseCircle ( userString );
		return newCircle;
	}

	@Override
	public String convertToString(Map arg0, Object o) {
		Circle circle = (Circle) o;
		String userString = "C:r" + circle.getRadius();
		return userString;
	}
	
	private Circle parseCircle( String userString )
			throws TypeConversionException
			{
			Circle circle = null;
		int radiusIndex = userString.indexOf('r') + 1;
			if (!userString.startsWith( "C:r") )
			throw new TypeConversionException ( "Invalid Syntax");
			int radius;
			try {
			radius = Integer.parseInt( userString.substring( radiusIndex ) );
			}catch ( NumberFormatException e ) {
			throw new TypeConversionException ( "Invalid Value for Radius"); }
			circle = new Circle();
			circle.setRadius( radius );
			return circle;
			}

}
