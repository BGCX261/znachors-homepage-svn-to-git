package org.woloszyn.gwt.client.util;

import org.woloszyn.gwt.client.util.TemplateHelper;

import junit.framework.TestCase;

public class TemplateHelperTest extends TestCase {

	String template = "one@ONE@two@TWO@three";

	public void testReplaceToken() throws Exception {
		String result = TemplateHelper.replaceToken(template, "@ONE@", "1");
		assertEquals("one1two@TWO@three", result);
	}
	
	public void testReplaceTwoTokens() throws Exception {
		String firstResult = TemplateHelper.replaceToken(template, "@ONE@", "1");
		String secondResult = TemplateHelper.replaceToken(firstResult, "@TWO@", "2");
		assertEquals("one1two2three", secondResult);
	}
	
	public void testReplaceTokenNullTemplate() throws Exception {
		String result = TemplateHelper.replaceToken(null, "@TOKEN@", "replacement");
		assertEquals(null, result);
	}
	
	public void testReplaceTokenEmptyTemplate() throws Exception {
		String result = TemplateHelper.replaceToken("", "@TOKEN@", "replacement");
		assertEquals("", result);
	}
	
	public void testReplaceTokenNullToken() throws Exception {
		String result = TemplateHelper.replaceToken(template, null, "replacement");
		assertEquals(template, result);
	}
	
	public void testReplaceTokenEmptyToken() throws Exception {
		String result = TemplateHelper.replaceToken(template, "", "replacement");
		assertEquals(template, result);
	}
	
	public void testReplaceTokenNullReplacement() throws Exception {
		String result = TemplateHelper.replaceToken(template, "@ONE@", null);
		assertEquals("onetwo@TWO@three", result);
	}	

	public void testReplaceTokenEmptyReplacement() throws Exception {
		String result = TemplateHelper.replaceToken(template, "@ONE@", "");
		assertEquals("onetwo@TWO@three", result);
	}	
	
}
