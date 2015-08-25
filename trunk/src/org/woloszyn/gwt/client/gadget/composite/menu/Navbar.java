package org.woloszyn.gwt.client.gadget.composite.menu;

import java.util.Iterator;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.WidgetCollection;

public class Navbar extends Panel {
	private WidgetCollection menuItems = new WidgetCollection(this);
	private Element outerUL;
	private Element outerLI;
	private Element title;
	
	public Navbar(String menuTitle) {
		outerUL = DOM.createElement("ul");
		outerLI = DOM.createElement("li");
		title = DOM.createElement("h2");
		DOM.setInnerText(title, menuTitle);
		
		DOM.appendChild(outerLI, title);
		DOM.appendChild(outerUL, outerLI);
		setElement(outerUL);
	}
	
	public void addWidget(Widget widget) {
		menuItems.add(widget);
		adopt(widget, getElement());
		DOM.appendChild(outerLI, widget.getElement());
	}
	
	public Widget getWidget(int idx) {
		return menuItems.get(idx);
	}

	public Iterator iterator() {
		return menuItems.iterator();
	}

	public boolean remove(Widget w) {
		menuItems.remove(w);
		return true;
	}
}
