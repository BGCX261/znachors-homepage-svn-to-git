package org.woloszyn.gwt.client.page;

import org.woloszyn.gwt.client.gadget.Page;
import org.woloszyn.gwt.client.gadget.PageInfo;

import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class Work extends Page {

	public static PageInfo init() {
		return new PageInfo("Work", "Information about my work experience") {
			public Page createInstance() {
				return new Work();
			}
		};
	}

	private Work() {
		super();
	}

	public Widget getContent() {
		VerticalPanel panel = new VerticalPanel();
		Grid grid = new Grid(5, 2);
		grid.setCellSpacing(10);

		Image logoBt = new Image("images/bt.jpg");
		Image logoSCC = new Image("images/scc.jpg");
		Image logoCern = new Image("images/cern.gif");
		Image logoOrange = new Image("images/orange.gif");
		Image logoAvantis = new Image("images/avantis.jpg");		
		
		String contentScc = "The <a href=\"http://www.supplychainconnect.com\">Supply Chain Connect</a> Hub and connectivity platform enables supply chain partners to share critical order, demand and inventory information in real-time to reduce administration costs and lower inventory levels. Tasks included server-side, Java/J2EE development: porting an existing system based on Tibco to message oriented architecture based on JBoss application server, creating content management and administration tools, integration with external clients. Cutting-edge, open source technologies used widely in the project (JBoss, Spring, Hibernate). Test driven development and continuous integration approach applied.";
		String contentCern = "Software engineer (Technical Student) at <a href=\"http://www.cern.ch\">CERN</a>, the European Organization for Nuclear Research, based in Geneva, Switzerland. Member of a team responsible for LASER, an alarm, monitoring system for the Large Hadron Collider (LHC) accelerator. Design and development of distributed, three tier system based on J2EE platform (OC4J with Soniq MQ as a messaging middleware). In particular development of system client console and API for communication of the console with core of the system.";
		String contentOrange = "Responsible for BENEFIT, internal system of the leading Polish <a href=\"http://www.orange.pl\">mobile operator</a>, loyalty-supporting system for the services retailers. Applets as user interface and stored procedures as business logic. Includes a promotion wizard, a calculation, e-shop modules, orders subsystem and an administration panel. Challenging integration with the internal data feeds.";
		String contentAvantis = "Designer and developer of the e-commerce, m-commerce, location-based systems in <a href=\"http://www.avantis.pl\">Avantis Mobile Media Group</a> which use modern communication channels like SMS, MMS, IVR, WAP, WWW. Examples of projects: SMS Premium Processing System, Pizza Hut Delivery website, Report System with data warehouse, WAP Premium System, Mobile Content (rings, middlets, screensavers, wallpapers...) distribution system using wap-push technology.";
		
		Image descBt = new Image("images/confidential.jpg");
		descBt.setSize("64", "18");
		HTML descScc = new HTML(contentScc);
		HTML descCern = new HTML(contentCern);
		HTML descOrange = new HTML(contentOrange);
		HTML descAvantis = new HTML(contentAvantis);
		
		grid.setWidget(0, 0, logoBt);
		grid.setWidget(0, 1, descBt);
		grid.setWidget(1, 0, logoSCC);
		grid.setWidget(1, 1, descScc);
		grid.setWidget(2, 0, logoCern);
		grid.setWidget(2, 1, descCern);
		grid.setWidget(3, 0, logoOrange);
		grid.setWidget(3, 1, descOrange);
		grid.setWidget(4, 0, logoAvantis);
		grid.setWidget(4, 1, descAvantis);
		
		String linkedinHtml = "For more information <a href=\"http://www.linkedin.com/in/woloszyn\">" +
				"<img src=\"http://www.linkedin.com/img/webpromo/btn_viewmy_160x25.gif\" " +
				"width=\"160\" height=\"25\" border=\"0\" alt=\"View Piotr Woloszyn's " +
				"profile on LinkedIn\"></a>"; 
		
		HTML linkedInButton = new HTML(linkedinHtml, true);		
		
		panel.add(grid);
		panel.add(linkedInButton);
		
		return panel;
	}
}
