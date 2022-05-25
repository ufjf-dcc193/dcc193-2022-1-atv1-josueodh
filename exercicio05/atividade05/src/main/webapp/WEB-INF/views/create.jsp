<%@page pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Cadastro</title>


    <body>
        <h1>Cadastro Jogador</h1>
        <form action="/resultado" method="post">
            <div class="flex flex-column">
                <label>Nome: <input type="text" name="nome" /></label>
                <label>Time: <input type="text" name="time" /></label>
                <button type="submit">Enviar</button>
            </div>
        </form>
    </body>

    </html>