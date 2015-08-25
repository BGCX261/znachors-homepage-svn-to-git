package org.woloszyn.gwt.client.gadget.composite.header;

import org.woloszyn.gwt.client.util.TemplateHelper;

import com.google.gwt.user.client.ui.HTML;

public class PageTitle extends HTML {
	private String pageTitle;
	
	private static final String tokenName = "@TITLE@";
	
	private static final String htmlTemplate = "<h2 class=\"posttitle\"><a href=\"\">@TITLE@</a></h2>";
	
	public PageTitle(String pageTitle) {
		super(TemplateHelper.replaceToken(htmlTemplate, tokenName, pageTitle));
		this.pageTitle = pageTitle;
	}

	public String getPageTitle() {
		return pageTitle;
	}

	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
		setHTML(TemplateHelper.replaceToken(htmlTemplate, tokenName, pageTitle));
	}
	
	
}
