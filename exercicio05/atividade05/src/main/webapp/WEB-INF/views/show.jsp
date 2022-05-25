<%@page pageEncoding="utf-8" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <!DOCTYPE html>
        <html lang="pt">

        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>EXM02: Jogador</title>
        </head>

        <body>
            <h1>Detalhe Jogador</h1>
            <p>Nome: ${jogador.nome}</p>
            <p>Time: ${jogador.time}</p>
            <a href="index.html">Voltar</a>
            <a href="edit?id=${jogador.id}">Editar</a>
            <a href="delete?id=${jogador.id}">Deletar</a>
        </body>

        </html>