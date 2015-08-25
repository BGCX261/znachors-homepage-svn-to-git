package org.woloszyn.gwt.client.page;

import org.woloszyn.gwt.client.gadget.Page;
import org.woloszyn.gwt.client.gadget.PageInfo;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;

public class MainPage extends Page {
	public static PageInfo init() {
		return new PageInfo("Home", "Piotr Woloszyn - Home Page") {
			public Page createInstance() {
				return new MainPage();
			}
		};
	}

	private MainPage() {
		super();
	}

	public void onShow() {
	}
	
	public Widget getContent() {
		HorizontalPanel panel = new HorizontalPanel();
		panel.setSpacing(10);
		
		Image me = new Image("images/pw.jpg");
		me.setTitle("Me");
		
		String content = "Welcome! This is my personal website which has been created to reassemble my web existence. " +
				"I am a software engineer with particular interest in lightweight enterprise Java, open source, patterns and extreme programming.<br/><br/>" +
				"Currently I work for <a href=\"http://www.bt.com\">British Telecom</a> in London. You can find more details about my professional " +
				"experience on Work and Curriculum Vitae pages.<br/><br/>" +
				"I graduated at <a href=\"http://www.pw.edu.pl\">Warsaw University of Technology</a> where I studied Computer " +
				"Science at the <a href=\"http://www.elka.pw.edu.pl\">Faculty of Electronics and Information Technology</a>.<br/><br/>" +
				"Apart from being a computer freak I enjoy traveling, photography, reading, listening to music and sport (skiing, squash, tenis, basketball).";
		HTML html = new HTML(content, true);
		
		panel.add(me);
		panel.add(html);

		return panel;
	}
}
