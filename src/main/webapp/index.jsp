<%@ page import="sho.dbtest.ShotAudit" %>

<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.Statement" %>

<%@ page import="sho.dbtest.GenericService" %>

<%@ page import="java.net.InetAddress" %>

<%@ page import="javax.naming.InitialContext"%>
<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>
			The project has been updated!
        </p>
    </body>
</html>

<%
GenericService gs = (GenericService) new InitialContext().lookup("java:global/dbtest/GenericService");
final String remoteIPAddress =
	request.getHeader("X-Forwarded-For") != null ?
	request.getHeader("X-Forwarded-For") : request.getRemoteAddr();

ShotAudit sessionLog = new ShotAudit();
sessionLog.setDsid(session.getId());
sessionLog.setViewId(request.getRequestURI());
sessionLog.setViewDate(new Date());
sessionLog.setServerHostname(InetAddress.getLocalHost().getHostName());
sessionLog.setClientIp(remoteIPAddress);

gs.create(sessionLog);
%>