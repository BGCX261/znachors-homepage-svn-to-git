package org.woloszyn.gwt.client.gadget.composite.header;

import org.woloszyn.gwt.client.util.TemplateHelper;

import com.google.gwt.user.client.ui.HTML;

public class PageMeta extends HTML {
	private String pageMeta;
	
	private final static String tokenName = "@POST_META@";
	
	private final static String htmlTemplate = "<p class=\"postmeta\">" + tokenName + "</p>";
	
	public PageMeta(String postMeta) {
		super(TemplateHelper.replaceToken(htmlTemplate, tokenName, postMeta));
		this.pageMeta = postMeta;
	}

	public String getPageMeta() {
		return pageMeta;
	}

	public void setPageMeta(String postMeta) {
		this.pageMeta = postMeta;
		setHTML(TemplateHelper.replaceToken(htmlTemplate, tokenName, postMeta));
	}	
	
	
}
