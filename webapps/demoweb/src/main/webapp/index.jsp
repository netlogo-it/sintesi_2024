<%
    String path=request.getContextPath();
%>
<html>
    <head>
        <title>DemoWeb</title>
    </head>
    <body>
        <jsp:include page="/WEB-INF/tiles/header.jsp" />
        <p><a href="<%=path %>/home.jsp">Home</a></p>
        <jsp:include page="/WEB-INF/tiles/footer.jsp" />
    </body>
</html>
