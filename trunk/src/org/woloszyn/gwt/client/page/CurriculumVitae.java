package org.woloszyn.gwt.client.page;

import org.woloszyn.gwt.client.gadget.Page;
import org.woloszyn.gwt.client.gadget.PageInfo;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;

public class CurriculumVitae extends Page {

	public static PageInfo init() {
		return new PageInfo("Curriculum Vitae", "You can find my resume on this page") {
			public Page createInstance() {
				return new CurriculumVitae();
			}
		};
	}

	private CurriculumVitae() {
		super();
	}

	public Widget getContent() {
		String content = "The CONTENT of CV page.<br/>" +
		"Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Praesent et sem vitae quam dapibus ultricies. Aliquam fringilla. Ut eleifend. Nulla facilisi. Vestibulum luctus est. Morbi vel eros blandit mi adipiscing placerat. Vivamus at nisi. Nulla velit ipsum, rhoncus at, consectetuer ut, tincidunt ut, elit. Nulla lobortis sem ac sem. Proin turpis mi, laoreet vulputate, nonummy quis, pulvinar ut, metus. Suspendisse venenatis elementum libero. Vestibulum suscipit pulvinar dui. Mauris id nulla id erat ornare imperdiet. Aliquam in ipsum quis sem placerat posuere. Mauris adipiscing, nunc non posuere pharetra, libero augue varius justo, vel tincidunt ante ipsum id eros. Sed venenatis tortor nec nulla. Cras porttitor posuere nisi." + 
		"Aliquam at augue id tellus condimentum consectetuer. Vivamus vestibulum pede sed augue. Proin porta varius purus. Donec laoreet, quam at vulputate molestie, justo ligula sollicitudin est, eget fringilla ligula orci eu quam. Quisque vitae velit ut mi pulvinar lacinia. Pellentesque mollis. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Integer quis nulla. Vestibulum justo lorem, bibendum eu, cursus et, fermentum sed, est. Pellentesque eget dui. Mauris fermentum, mauris eu dignissim tempus, ligula purus dignissim libero, et tempor odio neque ut velit. Mauris arcu augue, facilisis a, nonummy id, dapibus vel, nibh. Donec lobortis, lacus nec consequat ultricies, pede odio bibendum neque, vel dapibus nisl nisl quis mauris."; 
		
		return new HTML(content, true);		
	}
}
