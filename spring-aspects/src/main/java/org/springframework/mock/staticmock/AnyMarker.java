package org.springframework.mock.staticmock;

/**
 * Marks a class as a valid Any type for mocking method expectations.
 * @author raibaz
 *
 */
public interface AnyMarker {

	public class AnyDate extends java.util.Date implements AnyMarker {}
}
