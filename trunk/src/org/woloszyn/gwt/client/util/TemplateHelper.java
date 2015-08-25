package org.woloszyn.gwt.client.util;

public class TemplateHelper {

	private static final String DEFAULT_TAG = "@CONTENT@";
	private TemplateHelper() {
	}

	public static String replaceToken(String template, String replacement) {
		return replaceToken(template, DEFAULT_TAG, replacement);
	}
	
	public static String replaceToken(String template, String tokenName,
			String replacement) {
		if (template == null)
			return null;
		if (tokenName == null)
			return template;
		if ("".equals(tokenName))
			return template;
		if (replacement == null)
			replacement = "";

		final StringBuffer result = new StringBuffer();
		int startIdx = 0;
		int idxOld = 0;
		while ((idxOld = template.indexOf(tokenName, startIdx)) >= 0) {
			result.append(template.substring(startIdx, idxOld));
			result.append(replacement);
			startIdx = idxOld + tokenName.length();
		}
		result.append(template.substring(startIdx));
		return result.toString();
	}
}
