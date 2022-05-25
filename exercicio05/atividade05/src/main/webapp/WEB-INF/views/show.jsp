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
            <hr>
            <div>
                <p>Saques: ${jogador.saques}</p>
                <a href="increment?id=${jogador.id}&type=saques">Incrementar</a>
                <a href="decrement?id=${jogador.id}&type=saques">Decrementar</a>
            </div>
            <div>
                <p>Bloqueio: ${jogador.bloqueios}</p>
                <a href="increment?id=${jogador.id}&type=bloqueios">Incrementar</a>
                <a href="decrement?id=${jogador.id}&type=bloqueios">Decrementar</a>
            </div>
            <div>
                <p>Pontos: ${jogador.pontos}</p>
                <a href="increment?id=${jogador.id}&type=pontos">Incrementar</a>
                <a href="decrement?id=${jogador.id}&type=pontos">Decrementar</a>
            </div>
            <div>
                <p>Ataques: ${jogador.ataques}</p>
                <a href="increment?id=${jogador.id}&type=ataques">Incrementar</a>
                <a href="decrement?id=${jogador.id}&type=ataques">Decrementar</a>
            </div>
        </body>

        </html>