package org.woloszyn.gwt.client.gadget;

public abstract class PageInfo {
	private Page instance;

	private String name, description;

	public PageInfo(String name, String desciption) {
		this.name = name;
		this.description = desciption;
	}

	public abstract Page createInstance();

	public String getDescription() {
		return description;
	}

	public final Page getInstance() {
		if (instance != null)
			return instance;
		return (instance = createInstance());
	}

	public String getName() {
		return name;
	}
}
