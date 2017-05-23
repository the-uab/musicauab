<%-- 
    Document   : header
    Created on : 14/05/2017, 09:52:36 AM
    Author     : WarMachine
--%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no"/>
        <title>Bienvenidos a Musica</title>
        <link rel="shortcut icon" href="img/logoMusica.png">
        <!-- CSS  -->
        <link href="css/css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="css/css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="css/css/font-awesome/css/font-awesome.min.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    </head>
    <header>
        <div class="fixed-action-btn vertical click-to-toggle">
            <a class="btn-floating btn-large black pulse">
                <i class="material-icons ">menu</i>
            </a>
            <ul>
                <li><a href="login.jsp" class="btn-floating btn tooltipped orange" data-position="left" data-delay="50" data-tooltip="Login"><i class="material-icons">lock</i></a></li>
                <li><a href="index.jsp" class="btn-floating btn tooltipped grey" data-position="left" data-delay="50" data-tooltip="Inicio"><i class="material-icons">dashboard</i></a></li>
                <li><a href="#" class="btn-floating btn tooltipped red" data-position="left" data-delay="50" data-tooltip="Noticias"><i class="material-icons">list</i></a></li>
                <li><a href="#" class="btn-floating btn tooltipped light-green" data-position="left" data-delay="50" data-tooltip="Testimonios"><i class="material-icons">comment</i></a></li>
                <li><a href="#" class="btn-floating btn tooltipped deep-purple" data-position="left" data-delay="50" data-tooltip="Multimedia"><i class="material-icons">perm_media</i></a></li>
                <li><a href="#" class="btn-floating btn tooltipped blue-grey" data-position="left" data-delay="50" data-tooltip="Carreras"><i class="material-icons">info</i></a></li>
                <li><a href="#" class="btn-floating btn tooltipped blue-grey" data-position="left" data-delay="50" data-tooltip="Contactos"><i class="material-icons">perm_identity</i></a></li>
            </ul>
        </div>

        <div class="navbar">

            <nav class="black" role="navigation">
                <div class="nav-wrapper container">
                    <ul class="right hide-on-med-and-down">
                        <li>
                            <a id="logo-container" href="index.jsp" class="brand-logo center grey-text text-lighten-3">
                                Instituto de Musica UAB
                            </a>
                        </li>
                        <li>
                            <a href="login.jsp"><i class="fa fa-sign-in grey-text text-lighten-3">Login</i></a>
                        </li>
                    </ul>
                    <ul id="nav-mobile" class="side-nav">
                        <li><a href="login.jsp"><i class="fa fa-sign-in"></i>Login</a></li>
                        <li><a href="#">Inicio</a></li>
                    </ul>
                    <a href="#" data-activates="nav-mobile" class="button-collapse menu">
                        <i class="fa fa-navicon"> </i>
                        <img src="" alt="log" class="circle responsive-img" height="20" width="20"> Instituto de Musica UAB 
                    </a>
                </div>
            </nav>

        </div>
    </header>
