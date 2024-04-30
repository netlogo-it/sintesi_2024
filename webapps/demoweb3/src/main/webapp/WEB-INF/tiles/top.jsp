<%@page language="java" contentType="text/html; charset=UTF-8" %>
<%
    String path=request.getContextPath();
%>
<header>
    <img class="logo" src="<%=path %>/img/logo.png">
    <a href="<%=path %>/">Home</a>
    <a href="<%=path %>/page/contatti.jsp">Contatti</a>
    <a href="<%=path %>/page/richiesta.jsp">Richiesta</a>
</header>