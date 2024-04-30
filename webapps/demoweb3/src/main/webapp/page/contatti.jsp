<%@page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
    <jsp:include page="/WEB-INF/tiles/header.jsp" />    
<body>
    <jsp:include page="/WEB-INF/tiles/top.jsp" />
    <main>
        <h2>Contatti</h2>
        <hr>
        <div>
            <table>
                <tr>
                    <td rowspan="4"><img src="../img/myphoto.png" /></td>
                    <td class="label">Sviluppatore</td><td>Francesco</td>
                </tr>
                <tr>
                    <td class="label">Email</td><td>test@test.it</td>
                </tr>
                <tr>
                    <td class="label">Indirizzo</td><td>Via Storti - Potenza 85100</td>
                </tr>
                <tr>
                    <td class="label">Sito web</td><td><a href="https://www.ilmiosito.it">www.ilmiosito.it</a></td>
                </tr>
            </table>
        </div>
    </main>
    <jsp:include page="/WEB-INF/tiles/footer.jsp" />
</body>
</html>
