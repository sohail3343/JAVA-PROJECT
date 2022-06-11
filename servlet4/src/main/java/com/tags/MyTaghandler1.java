package com.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTaghandler1 extends TagSupport {
@Override
public int doStartTag() throws JspException {
	JspWriter out=pageContext.getOut();
	try {
		out.println("<h1> this is my custom tag</h1>");
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	
	return SKIP_BODY;
	
}
}
