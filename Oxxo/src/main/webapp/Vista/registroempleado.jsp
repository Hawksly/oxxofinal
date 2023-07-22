<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="/Oxxo/res/logo/oxxo-asi-de-facil.png">
        <title>Registro de Empleado</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" 
              integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
        <link rel="stylesheet" href="/Oxxo/css/ingreso.css">
        <link rel="stylesheet" href="/Oxxo/css/style.css">
        <link rel="stylesheet" href="/Oxxo/css/main.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
    </head>
    <body>
        <!-- Cabecera -->
        <header class="header sticky-top">
            <div class="logo">
                <img src="/Oxxo/res/logo/oxxologo.png" class="rounded" alt="Logo de la marca">
            </div>
            <nav>
                <ul class="nav-links">
                    <li><a href="/Oxxo/Vista/inicio.php">Inicio</a></li>
                    <li><a href="/Oxxo/Vista/about.php">Quiénes Somos</a></li>
                    <li><a href="/Oxxo/Vista/promociones.php">Promociones</a></li>
                    <li><a href="/Oxxo/Vista/contacto.jsp">Contáctanos</a></li>
                    <%String roles="";
                    if((String) request.getAttribute("rol")!=null){
                        roles = (String) request.getAttribute("rol");
                    }else{
                        roles="";
                    }
                    if(roles.equals("Administrador") && roles!=null){
                    %>
                    <li><a class="dropdown-item" href="/Oxxo/Vista/inventario.jsp">Inventario</a></li>
                    <li><a class="dropdown-item" href="/Oxxo/Vista/registroempleado.jsp">Registro</a></li>
                    <%}
                    if (roles.equals("Empleado") && roles!=null) {
                    %>
                    <li><a class="dropdown-item" href="/Oxxo/Vista/inventario.jsp">Inventario</a></li>
                    <li><a class="nav-link disabled" href="#">Registro</a></li>
                    <%} 
                    if (roles.equals("") && roles!=null){
                    %>
                    
                    <%}%>
                </ul>
            </nav>
            <a href="/Oxxo/Vista/login.jsp" class="boton"><button>Login</button></a>
            <a onclick="openNav()" class="menu" href="#"><button>Menu</button></a>
            <div class="overlay" id="mobile-menu">
                <a onclick="closeNav()" href="" class="close">&times;</a>
                <div class="overlay-content">
                    <a href="/Oxxo/Vista/inicio.php">Inicio</a>
                    <a href="/Oxxo/Vista/about.php">Quiénes Somos</a>
                    <a href="/Oxxo/Vista/promociones.php">Promociones</a>
                    <a href="/Oxxo/Vista/contacto.jsp">Contáctanos</a>
                </div>
            </div>
        </header>
        <!-- Final de Cabecera -->
    </br>
    </br>
    <div>
        <!-- Formulario de solicitud de contacto -->
        <form class="contactanos" style="max-width: 550px; margin: 0 auto;" method="post" action="${pageContext.request.contextPath}/SvRegistro">
            <fieldset>
                <center>
                    <legend>
                        <h4>Registro de Empleados</h4>
                    </legend>
                    
                    <label>DNI</label>
                    <div class="form-group">
                        <input type="text" class="form-control" id="dni" name="dni" required />
                    </div>
                    </br>
                    </br>
                    <label for="nombres">Nombres</label>
                    <div class="form-group">
                        <input type="text" class="form-control" id="nombre" name="nombre" required />
                    </div>
                    </br>
                    <label for="apellidos">Apellido Paterno</label>
                    <div class="form-group">
                        <input type="text" class="form-control" id="paterno" name="paterno" required />
                    </div>
                    <label for="apellidos">Apellido Materno</label>
                    <div class="form-group">
                        <input type="text" class="form-control" id="materno" name="materno" required />
                    </div>
                    </br>
                    </br>
                    <label>Teléfono</label>
                    <div class="form-group">
                        <input type="phone" class="form-control" id="telefono" name="telefono" required />
                    </div>
                    </br>
                    <label>Email</label>
                    <div class="form-group">
                        <input type="email" class="form-control" id="correo" name="correo" required />
                    </div>
                    </br>
                    <label>Direccion</label>
                    <div class="form-group">
                        <input type="text" class="form-control" id="direccion" name="direccion" required />
                    </div>
                    </br><label>Usuario</label>
                    <div class="form-group">
                        <input type="text" class="form-control" id="usuario" name="usuario" required />
                    </div>
                    </br>
                    <label>Contraseña</label>
                    <div class="form-group">
                        <input type="password" class="form-control" id="pass" name="pass" required />
                    </div>
                    </br>
                    <label>Seleccione el rol</label>
                    <div class="form-group">
                        <select class="form-select" name="rol" id="rol" required>
                            <option value>Seleccione un rol</option>
                            <option value="Administrador">Administrador</option>
                            <option value="Empleado">Empleado</option>
                        </select>
                    </div>
                    </br>
                    <p style="text-align: center">
                        <button type="submit" class="btn btn-danger btn-lg">Enviar</button>
                    </p>
    </div>
</br>
</br>
<!-- Inferior -->
        <footer class="footer">
            <div class="contenido">
                <div class="wow">
                    <div class="footer-col">
                        <h4>Mundo</h4>
                        <ul>
                            <li><a href="/Oxxo/Vista/inicio.php">Inicio</a></li>
                            <li><a href="/Oxxo/Vista/about.php">Quiénes Somos</a></li>
                            <li><a href="/Oxxo/Vista/promociones.php">Promociones</a></li>
                            <li><a href="/Oxxo/Vista/contacto.jsp">Contáctanos</a></li>
                        </ul>
                    </div>
                    <div class="footer-col">
                        <h4>¿Necesitas ayuda?</h4>
                        <ul>
                            <li><a href="http://www.femsa.com/es/">FEMSA</a></li>
                            <li><a href="https://www.oxxo.pe/faqs">Preguntas frecuentes</a></li>
                            <li><a href="https://www.oxxo.pe/aviso-de-privacidad">Política de privacidad</a></li>
                            <li><a href="https://www.oxxo.pe/terminos-y-condiciones">Términos y condiciones</a></li>
                        </ul>
                    </div>
                    <div class="footer-col">
                        <h4>¡Síguenos en nuestras redes sociales!</h4>
                        <div class="social-links">
                            <a href="https://www.facebook.com/OXXOperu/"><i class="fab fa-facebook-f"></i></a>
                            <a href="https://www.instagram.com/OXXOperu/?hl=es-la"><i class="fab fa-instagram"></i></a>
                            <a href="https://twitter.com/Tiendas_OXXO"><i class="fab fa-twitter"></i></a>
                            <img src="/Oxxo/res/logo/oxxo-asi-de-facil.png" alt="oxxo-asi-de-facil" />
                        </div>
                    </div>
                </div>
            </div>
        </footer>
    <!-- Fin Inferior -->
        <!-- js bootstrap -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" 
        integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" 
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" 
        integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>
    </body>
</html>
