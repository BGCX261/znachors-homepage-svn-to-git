package org.woloszyn.gwt.client.gadget.composite.menu;

import java.util.ArrayList;

import org.woloszyn.gwt.client.gadget.PageInfo;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class SideBar extends Composite {
	private VerticalPanel vp = new VerticalPanel();

//	private int selectedPage = -1;

	private ArrayList pageInfos = new ArrayList();
	
	private Menu menu = new Menu("Menu");

	private Navbar navbar = new Navbar("External sites");
	
	public SideBar() {
		vp.add(menu);		
		vp.add(navbar);
		initWidget(vp);
	}

	public void addMenuElement(final PageInfo pageInfo) {
		String name = pageInfo.getName();
		Hyperlink hyperlink = new Hyperlink(name, name);
		menu.addWidget(hyperlink);
		pageInfos.add(pageInfo);
	}

	public PageInfo find(String pageName) {
		for (int i = 0; i < pageInfos.size(); ++i) {
			PageInfo info = (PageInfo) pageInfos.get(i);
			if (info.getName().equals(pageName))
				return info;
		}

		return null;
	}

	public void setPageSelection(String name) {
//		if (selectedPage != -1)
//			menu.getWidget(selectedPage).setVisible(true);
//
//		for (int i = 0; i < pageInfos.size(); ++i) {
//			PageInfo info = (PageInfo) pageInfos.get(i);
//			if (info.getName().equals(name)) {
//				selectedPage = i;
//				menu.getWidget(selectedPage).setVisible(false);
//				return;
//			}
//		}
	}
	
	public void addNavbarWidget(Widget widget) {
		navbar.addWidget(widget);
	}
}
