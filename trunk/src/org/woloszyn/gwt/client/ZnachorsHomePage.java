package org.woloszyn.gwt.client;

import org.woloszyn.gwt.client.gadget.Page;
import org.woloszyn.gwt.client.gadget.PageInfo;
import org.woloszyn.gwt.client.gadget.composite.header.PageHeader;
import org.woloszyn.gwt.client.gadget.composite.menu.SideBar;
import org.woloszyn.gwt.client.page.CurriculumVitae;
import org.woloszyn.gwt.client.page.MainPage;
import org.woloszyn.gwt.client.page.VisitedCountries;
import org.woloszyn.gwt.client.page.Work;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.HistoryListener;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ZnachorsHomePage implements EntryPoint, HistoryListener {

	private PageInfo curPageInfo;

	private Page curPage;

	private PageHeader pageHeader = new PageHeader("Title", "desc");

	private VerticalPanel panel = new VerticalPanel();

	private DockPanel pageContainer;
	
	private SideBar menu = new SideBar();

	public void onHistoryChanged(String token) {
		// Find the PageInfo associated with the history context. If one is
		// found, show it (It may not be found, for example, when the user mis-
		// types a URL, or on startup, when the first context will be "").
		PageInfo pageInfo = menu.find(token);
		if (pageInfo == null) {
			showDefaultPage();
			return;
		}
		show(pageInfo, false);
	}

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		RootPanel.get("post").add(panel);
		RootPanel.get("menu").add(menu);

		menu.addNavbarWidget(new HTML("<br/>"));
		menu.addNavbarWidget(new HTML("<a href=\"http://jroller.com/pages/znachor\">Mumbling about software</a>"));
		menu.addNavbarWidget(new HTML("<a href=\"http://znachor.blogspot.com\">Znachor's photoblog</a>"));
		menu.addNavbarWidget(new HTML("<br/>"));
		
		loadPages();
		
	    pageContainer = new DockPanel();

	    panel.add(pageHeader);
	    panel.add(pageContainer);

	    panel.setCellWidth(pageHeader, "100%");
	    panel.setCellWidth(pageContainer, "100%");

	    History.addHistoryListener(this);

	    // Show the initial screen.
	    String initToken = History.getToken();
	    if (initToken.length() > 0)
	      onHistoryChanged(initToken);
	    else
	      showDefaultPage();
	    
	    System.out.println(RootPanel.get());
	}

	private void loadPages() {
		menu.addMenuElement(MainPage.init());
		menu.addMenuElement(Work.init());
//		menu.addMenuElement(CurriculumVitae.init());
		menu.addMenuElement(VisitedCountries.init());
	}

	private void showDefaultPage() {
		show(menu.find("Home"), false);
	}

	public void show(PageInfo pageInfo, boolean affectHistory) {
		if (pageInfo == curPageInfo)
			return;
		curPageInfo = pageInfo;

		// Remove the old page from the display area.
		if (curPage != null) {
			curPage.onHide();
			pageContainer.remove(curPage);
		}

		// Get the new page instance, and display its description in the
		// sink list.
		curPage = pageInfo.getInstance();
		menu.setPageSelection(pageInfo.getName());
		pageHeader.setPageTitle(pageInfo.getName());
		pageHeader.setPageDescription(pageInfo.getDescription());

		// If affectHistory is set, create a new item on the history stack. This
		// will ultimately result in onHistoryChanged() being called. It will call
		// show() again, but nothing will happen because it will request the exact
		// same page we're already showing.
		if (affectHistory)
			History.newItem(pageInfo.getName());

		// Display the new sink.
		pageContainer.add(curPage, DockPanel.CENTER);
		pageContainer.setCellWidth(curPage, "100%");
		pageContainer.setCellHeight(curPage, "100%");
		pageContainer.setCellVerticalAlignment(curPage, DockPanel.ALIGN_TOP);
		curPage.onShow();
	}

}
