package org.woloszyn.gwt.client.gadget;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public abstract class Page extends Composite {
	
	protected Page() {
		initWidget(getContent());
	}
	
	public void onHide() {
	}

	public void onShow() {
	}
	
	public abstract Widget getContent();
}
