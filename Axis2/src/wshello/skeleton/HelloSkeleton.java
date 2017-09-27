/**
 * HelloSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */
package wshello.skeleton;

import wshello.GetHelloTextResponse;

/**
 * HelloSkeleton java skeleton for the axisService
 */
public class HelloSkeleton implements HelloSkeletonInterface {
	/**
	 * Auto generated method signature
	 *
	 * @param getHelloText0
	 * @return getHelloTextResponse1
	 */
	public wshello.GetHelloTextResponse getHelloText(wshello.GetHelloText getHelloText0) {
		// TODO : fill this with the necessary business logic
		// throw new java.lang.UnsupportedOperationException("Please implement " +
		// this.getClass().getName() + "#getHelloText");

		System.out.println("getHelloText called");

		GetHelloTextResponse res = new GetHelloTextResponse();

		res.set_return("Goodbye World");
		return res;
	}
}
