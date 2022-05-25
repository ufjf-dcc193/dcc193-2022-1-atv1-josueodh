<%@page pageEncoding="utf-8" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <!DOCTYPE html>
        <html lang="pt">

        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>EXM02: Lista de Pessoas</title>
        </head>

        <body>
            <h1>Lista de Pessoas</h1>
            <a href="/formulario">Cadastrar</a>
            <ul>
                <c:forEach var="pessoa" items="${pessoas}">
                    <li>[${pessoa.id}] ${pessoa.nome} (${pessoa.idade})
                        <a href="visualizar?id=${pessoa.id}">Visualizar</a>
                        <a href="editar?id=${pessoa.id}">Editar</a>
                        <a href="excluir?id=${pessoa.id}">Deletar</a>
                    </li>
                </c:forEach>
            </ul>
        </body>

        </html>