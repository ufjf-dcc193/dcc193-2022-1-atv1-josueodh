<%@page pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>EXM: Formulário</title>


    <body>
        <h1>EXM02: Formulário</h1>
        <form action="resultado.html" method="post">
            <div class="flex flex-column">
                <label>Nome: <input type="text" name="name" /></label>
                <label>Idade: <input type="number" step="1" min="0" max="100" name="age" /></label>
                <button type="submit">Enviar</button>
            </div>
        </form>
    </body>

    </html>