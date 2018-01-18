package com.dscfgos.vaadin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dscfgos.vaadin.ui.MainUI;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

@WebServlet(asyncSupported = true, urlPatterns = {"/*"})
@VaadinServletConfiguration(productionMode = true, ui = MainUI.class)
public class MainServlet extends VaadinServlet 
{
	private static final long serialVersionUID = -5961023708163631855L;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		super.service(request, response);
	}
}
