<%@page pageEncoding="utf-8" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <!DOCTYPE html>
        <html lang="pt">

        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>EXM02: Lista de Jogadores</title>
        </head>

        <body>
            <h1>Lista de Jogadores</h1>
            <a href="/create">Cadastrar</a>
            <ul>
                <c:forEach var="jogador" items="${jogadores}">
                    <li>[${jogador.id}] - ${jogador.nome} (${jogador.time})
                        <a href="show?id=${jogador.id}">Visualizar</a>
                        <a href="edit?id=${jogador.id}">Editar</a>
                        <a href="delete?id=${jogador.id}">Deletar</a>
                    </li>
                </c:forEach>
            </ul>
        </body>

        </html>