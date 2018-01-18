package com.dscfgos.vaadin.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@Theme("dstodolisttheme")
public class MainUI extends UI 
{
	private static final long serialVersionUID = -1693665900853702321L;

	@Override
	protected void init(VaadinRequest request) 
	{
		this.setContent(new Label("Login API"));
	}
}
