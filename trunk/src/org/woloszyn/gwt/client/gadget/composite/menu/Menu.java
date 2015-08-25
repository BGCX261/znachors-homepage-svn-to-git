package org.woloszyn.gwt.client.gadget.composite.menu;

import java.util.Iterator;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.WidgetCollection;

public class Menu extends Panel {
	private WidgetCollection menuItems = new WidgetCollection(this);
	private Element outerUL;
	private Element outerLI;
	private Element title;
	private Element menuUL;
	
	public Menu(String menuTitle) {
		outerUL = DOM.createElement("ul");
		outerLI = DOM.createElement("li");
		title = DOM.createElement("h2");
		DOM.setInnerText(title, menuTitle);
				
		menuUL = DOM.createElement("ul");
		DOM.appendChild(outerLI, title);
		DOM.appendChild(outerLI, menuUL);
		DOM.appendChild(outerUL, outerLI);
		setElement(outerUL);
	}
	
	public void addWidget(Widget widget) {
		menuItems.add(widget);
		adopt(widget, getElement());
		Element item = DOM.createElement("li");
		DOM.appendChild(item, widget.getElement());
		DOM.appendChild(menuUL, item);
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
