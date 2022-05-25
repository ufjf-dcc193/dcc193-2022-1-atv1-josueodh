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
            <h1>Detalhe Pessoa</h1>
            <p>Nome: ${pessoa.nome}</p>
            <p>Idade: ${pessoa.idade}</p>
            <a href="pessoas.html">Voltar</a>
            <a href="editar?id=${pessoa.id}">Editar</a>
            <a href="excluir?id=${pessoa.id}">Deletar</a>
        </body>

        </html>