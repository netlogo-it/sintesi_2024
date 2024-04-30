<%@page language="java" contentType="text/html; charset=UTF-8" %>
<%
    String path=request.getContextPath();
%>
<!DOCTYPE html>
<html>
    <jsp:include page="/WEB-INF/tiles/header.jsp" />    
<body>
    <jsp:include page="/WEB-INF/tiles/top.jsp" />    
    <main>
        <h2>Informazioni</h2>
        <hr>
        <div>
            <h2 style="color:red">Si e' verificato un errore!!!</h2>
        </div>
    </main>
    <jsp:include page="/WEB-INF/tiles/footer.jsp" />
</body>
</html>
