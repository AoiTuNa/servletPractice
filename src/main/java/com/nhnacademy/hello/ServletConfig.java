package com.nhnacademy.hello;

import javax.servlet.ServletContext;
import java.util.Enumeration;

public interface ServletConfig {
    public String getServletName();

    public String getInitParameter(String name);

    public Enumeration<String> getInitParameterNames();

    public ServletContext getServletContest();
}
