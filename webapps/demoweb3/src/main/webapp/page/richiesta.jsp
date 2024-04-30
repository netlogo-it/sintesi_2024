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
        <h2>Invia una richiesta</h2>
        <hr>
        <div>
            <form action="<%=path %>/richiesta" method="post">
                <table>
                    <tr>
                        <td class="label">Cognome</td><td><input type="text" name="cognome" value="" required="true" ></td>
                    </tr>
                    <tr>
                        <td class="label">Nome</td><td><input type="text" name="nome" value="" required="true" ></td>
                    </tr>
                    <tr>
                        <td class="label">Email</td><td><input type="email" name="email" value="" required="true" ></td>
                    </tr>
                    <tr>
                        <td class="label">Richiesta</td><td><textarea cols="40" rows="5" name="richiesta" required="true"></textarea></td>
                    </tr>
                    <tr>
                        <td>
                            <button type="submit" name="invia">Invia richiesta</button>
                        </td>
                        <td>
                            <button type="reset">Cancella dati</button>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </main>
    <jsp:include page="/WEB-INF/tiles/footer.jsp" />
</body>
</html>
