<%-- 
    Document   : login
    Created on : 14/05/2017, 10:12:14 AM
    Author     : WarMachine
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no"/>
        <title>Iniciar Sesión</title>
        <link rel="shortcut icon" href="img/login.png">

        <!-- CSS  -->
        <link href="css/css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="css/css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="css/css/font-awesome/css/font-awesome.min.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <script>
            $(document).ready(function () {
                $('#submit').click(function (event) {
                    var username = $('#username').val();
                    var password = $('#password').val();
                    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
                    //$.post('login.do', {
                    //    username: username,
                      //  password: password
                    //}, function (responseText) {
                      //  $('#tabla').html(responseText);
                    //});
                    alert("hola");
                });
            });
        </script>
    </head>
    <body class="grey lighten-2">
        <header>
            <div class="navbar">
                <nav class="black" role="navigation">
                    <div class="nav-wrapper container">


                        <ul class="right hide-on-med-and-down">
                            <a id="logo-container" href="index.jsp" class="brand-logo center grey-text text-lighten-3">
                                Instituto de Musica UAB
                            </a>
                        </ul>

                    </div>
                </nav>
            </div>
        </header>
        <br>
        <br>
        <div class="container grey-text text-darken-2">
            <div class="row">
                <div class="col s12 m6 offset-m3">
                    <div class="card z-depth-4">
                        <div class="card-content">
                            <span class="card-title">Inicio Sesión</span>
                            <br>
                            <form class="responsive" >
                                <div class="row">
                                    <div class="input-field col s12">
                                        <input name="username" type="text" class="validate" required>
                                        <label for="text">Usuario</label>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <input name="password" type="password" class="validate" required>
                                        <label for="password">Contraseña</label>
                                    </div>
                                </div>
                                <input type="hidden" name="datos" value="1">
                                <div class="card-action center">
                                    <button id="submit" class="btn green darken-4 grey-text text-lighten-1" value="Ingresar"></button>
                                </div>
                            </form>
                            <div id="tabla"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!--  Scripts-->
    </body>
    <br>
    <br>
    <br>
    <footer class="page-footer black">
        <div class="footer-copyright">
            <div class="container">
                © 2017 Copyright 
                <a class="grey-text text-lighten-4" href="#!">EliasSauer</a>
            </div>
        </div>

    </footer>
    <script src="css/js/jquery.min.js"></script>
    <script src="css/js/materialize.min.js"></script>
    <script src="css/js/init.js"></script>
</html>

