package org.woloszyn.gwt.client.gadget.composite.header;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;

public class PageHeader extends Composite {

	private PageTitle pageTitle;

	private PageMeta pageDescription;

	public PageHeader(String pageTitle, String pageDescription) {
		this.pageTitle = new PageTitle(pageTitle);
		this.pageDescription = new PageMeta(pageDescription);

		VerticalPanel panel = new VerticalPanel();
		panel.add(this.pageTitle);
		panel.add(this.pageDescription);
		panel.setWidth("500px");
		panel.setCellWidth(this.pageTitle, "100%");
		panel.setCellWidth(this.pageDescription, "100%");

		// All composites must call setWidget() in their constructors.
		initWidget(panel);
	}
	
	public void setPageTitle(String pageTitle) {
		this.pageTitle.setPageTitle(pageTitle);
	}
	
	public void setPageDescription(String pageDescription) {
		this.pageDescription.setPageMeta(pageDescription);
	}
}
