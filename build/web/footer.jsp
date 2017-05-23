<%-- 
    Document   : footer
    Created on : 14/05/2017, 09:52:56 AM
    Author     : WarMachine
--%>


<footer class="page-footer black grey-text text-lighten-3">
    <div class="container"  id="contactos">
        <div class="row">
            <div class="col l5 s12">
                <h5 class="white-text">Facultad de Ingeniería</h5>
                <p class="grey-text text-lighten-4">Tu presente y tu futuro.</p>
            </div>
            <div class="col l4 s12">
                <h5 class="white-text">Enlaces</h5>
                <ul>
                    <li><a class="grey-text text-lighten-3" href="#!">Inicio</a></li>
                    <li><a class="grey-text text-lighten-3" href="#!">Carreras</a></li>
                    <li><a class="grey-text text-lighten-3" href="view/contactos.php">Testimonios</a></li>
                    <li><a class="grey-text text-lighten-3" href="#!">Noticias</a></li>
                </ul>
            </div>
            <div class="col l3 s12 center-align">
                <h5 class="white-text">Contactenos</h5>
                <form data-form-output="form-output-global" data-form-type="subscribe" method="post" action="#" class="rd-mailform form-classic form-inline offset-top-15 center-align" novalidate="novalidate">
                    <div class="form-group has-error center-align">
                        <input id="contact-email" type="email" name="email" data-constraints="@Email @Required" class="form-control form-control-has-validation"><span class="form-validation">Ingresa tu E-Mail</span>
                    </div>
                    <button class="btn waves-effect waves-light green darken-4" type="submit" name="action">Enviar</button>
                </form>
            </div>
        </div>
    </div>
    <div class="footer-copyright">
        <div class="container">
            © 2017 Copyright
            <a class="grey-text text-lighten-4 right" href="#!">EliasSauer</a>
        </div>
    </div>
</footer>

<!--  Scripts-->
<script src="css/js/jquery.min.js"></script>
<script src="css/js/materialize.min.js"></script>
<script src="css/js/init.js"></script>

<script type="text/javascript">
    $(document).ready(function () {
        $('.slider').slider();
        $('.materialboxed').materialbox();
        $('.modal').modal();
        $('.tooltipped').tooltip({delay: 50});
    });
</script>

</html>