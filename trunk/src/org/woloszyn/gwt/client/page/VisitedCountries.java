package org.woloszyn.gwt.client.page;

import org.woloszyn.gwt.client.gadget.Page;
import org.woloszyn.gwt.client.gadget.PageInfo;

import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;

public class VisitedCountries extends Page {

	public static PageInfo init() {
		return new PageInfo("Visited Countries", "Countries visited by me so far. Still pleanty to go.") {
			public Page createInstance() {
				return new VisitedCountries();
			}
		};
	}

	private VisitedCountries() {
	}

	public Widget getContent() {
		Image image = new Image("http://www.world66.com/myworld66/visitedCountries/worldmap?visited=BECZFRDEHUITMCNLPLSKCHUK");
		image.setTitle("Visited Countries");
		return image;
	}
}
