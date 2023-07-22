<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Contacto</title>
        <link rel="icon" href="/Oxxo/res/logo/oxxo-asi-de-facil.png">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" 
              integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
        <link rel="stylesheet" href="/Oxxo/css/ingreso.css">
        <link rel="stylesheet" href="/Oxxo/css/style.css">
        <link rel="stylesheet" href="/Oxxo/css/main.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
        <script src="/Oxxo/js/jq/jquery-3.6.1.min.js"></script>
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
                    <li><a href="/Oxxo/Vista/inventario.jsp">Inventario</a></li>
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
                    <a href="/Oxxo/Vista/inventario.jsp"></a>
                </div>
            </div>
        </header>
        <!-- Final de Cabecera -->
        <div class="photo">
        <center>
            <img src="/Oxxo/res/logo/contacto.jpg" class="rounded" alt="Logo" style="width:100%;" />
        </center>
    </div>
    </br>
    </br>
    <div class="parrafo p-5">
        <h4>GRACIAS POR TOMARTE ESTE TIEMPO PARA COMPARTIRNOS TU EXPERIENCIA DE SERVICIO</h4>
        <p>Para nosotros son muy importantes tus comentarios. Esto nos ayuda a mejorar nuestros servicios.</p>
        <p>Te invitamos a llamar a nuestra línea de atención a clientes al teléfono <strong>01 601 3636</strong> sin
            costo o bien, a llenar los siguientes campos o
            escríbenos un correo a atencionalcliente.peru@exxo.com para darle atención puntual a tu comentario.</p>
    </div>
    </br>
    </br>
    <div>
        <!-- Formulario de solicitud de contacto -->
        <form class="contactanos" style="max-width: 550px; margin: 0 auto;" method="post" action="SvContacto">
            <fieldset>
                <center>
                    <legend>
                        <h4>ESCRÍBENOS</h4>
                    </legend>
                    <label>Nos contactas para</label>
                    <div class="form-group">
                        <select class="form-select" name="motivo" id="motivo" required>
                            <option value>Seleccione un motivo</option>
                            <option value="Sugerencia">Sugerencia</option>
                            <option value="Consulta">Consulta</option>
                            <option value="Reclamo">Reclamo</option>
                            <option value="Otro">Otro</option>
                        </select>
                    </div>
                    </br>
                    <label for="nombres">Nombres</label>
                    <div class="form-group">
                        <input type="text" class="form-control" id="nombre" name="nombre" required />
                    </div>
                    </br>
                    <label for="apellidos">Apellidos</label>
                    <div class="form-group">
                        <input type="text" class="form-control" id="apellido" name="apellido" required />
                    </div>
                    </br>
                    <label>Email</label>
                    <div class="form-group">
                        <input type="email" class="form-control" id="correo" name="correo" required />
                    </div>
                    </br>
                    <label>Teléfono</label>
                    <div class="form-group">
                        <input type="phone" class="form-control" id="telefono" name="telefono" required />
                    </div>
                    </br>
                    <label>Tienda Oxxo</label>
                    <div class="form-group">
                        <select class="form-select" name="tienda" id="tienda" required />
                        <option value>Selecciona una tienda</option>
                        <option value="OXXO - Jr. El Polo">OXXO - Jr. El Polo</option>
                        <option value="OXXO - Av. La Mar">OXXO - Av. La Mar</option>
                        <option value="OXXO - Av. Arequipa">OXXO - Av. Arequipa</option>
                        <option value="OXXO - Av. San Luis">OXXO - Av. San Luis</option>
                        <option value="OXXO - Av. República de Panamá">OXXO - Av. República de Panamá</option>
                        <option value="OXXO - Av. Brasil">OXXO - Av. Brasil</option>
                        <option value="OXXO - Av. Javier Prado Oeste">OXXO - Av. Javier Prado Oeste</option>
                        <option value="OXXO - Av. Prol. Iquitos">OXXO - Av. Prol. Iquitos</optiona>
                        <option value="OXXO - Av. Montes de Los Olivos">OXXO - Av. Montes de Los Olivos</option>
                        <option value="OXXO - Av. Matellini  cruce con Jr. Lizandro de la Puente">OXXO - Av. Matellini
                            cruce con Jr. Lizandro de la Puente</option>
                        <option value="OXXO - Av. Manuel Cipriano Dulanto">OXXO - Av. Manuel Cipriano Dulanto</option>
                        <option value="OXXO - Av. Principal">OXXO - Av. Principal</option>
                        <option value="OXXO - Jr. Ayacucho">OXXO - Jr. Ayacucho</option>
                        <option value="OXXO - Av. Mariscal Cáceres">OXXO - Av. Mariscal Cáceres</option>
                        <option value="OXXO - Av. Guillermo Billinghurst">OXXO - Av. Guillermo Billinghurst</option>
                        <option value="OXXO - Av. San Luis">OXXO - Av. San Luis</option>
                        <option value="OXXO - Av. Benavides">OXXO - Av. Benavides</option>
                        <option value="OXXO - Av. Universitaria">OXXO - Av. Universitaria</option>
                        <option value="OXXO - Calle Bolivar">OXXO - Calle Bolivar</option>
                        <option value="OXXO - Av. Saenz Peña">OXXO - Av. Saenz Peña</option>
                        <option value="OXXO - Av. Faucett">OXXO - Av. Faucett</option>
                        <option value="OXXO - Av. 15 de Julio">OXXO - Av. 15 de Julio</option>
                        <option value="OXXO - Jr. Las Gaviotas">OXXO - Jr. Las Gaviotas</option>
                        <option value="OXXO - Av. Sáenz Pena">OXXO - Av. Sáenz Pena</option>
                        <option value="OXXO - Av. Angamos">OXXO - Av. Angamos</option>
                        <option value="OXXO - Av. Arequipa">OXXO - Av. Arequipa</option>
                        <option value="OXXO - Av. Túpac Amaru">OXXO - Av. Túpac Amaru</option>
                        <option value="OXXO - Av. Brigida Silva de Ochoa">OXXO - Av. Brigida Silva de Ochoa</option>
                        <option value="OXXO - Av. Argentina C.C. Minka">OXXO - Av. Argentina C.C. Minka</option>
                        <option value="OXXO - Av. Primero de Mayo">OXXO - Av. Primero de Mayo</option>
                        <option value="OXXO - Av. José Leal">OXXO - Av. José Leal</option>
                        <option value="OXXO - Av. Venezuela">OXXO - Av. Venezuela</option>
                        <option value="OXXO - Av. San Luis">OXXO - Av. San Luis</option>
                        <option value="OXXO - Av. El Sol">OXXO - Av. El Sol</option>
                        <option value="OXXO - Av. Caquetá">OXXO - Av. Caquetá</option>
                        <option value="OXXO - Av. Túpac Amaru">OXXO - Av. Túpac Amaru</option>
                        <option value="OXXO - Av. El Sol">OXXO - Av. El Sol</option>
                        <option value="OXXO - Av. Canto Grande">OXXO - Av. Canto Grande</option>
                        <option value="OXXO - Av. Los Ruiseñores">OXXO - Av. Los Ruiseñores</option>
                        <option value="OXXO - Av. Saenz Peña">OXXO - Av. Saenz Peña</option>
                        <option value="OXXO - Av. Gran Chimú">OXXO - Av. Gran Chimú</option>
                        <option value="OXXO - Av. Petit Thouars con Jr. Soledad">OXXO - Av. Petit Thouars con Jr.
                            Soledad</option>
                        <option value="OXXO - Av. Juan de Aliaga">OXXO - Av. Juan de Aliaga</option>
                        <option value="OXXO - Av. Caminos del Inca">OXXO - Av. Caminos del Inca</option>
                        <option value="OXXO - Av. Del Ejército">OXXO - Av. Del Ejército</option>
                        <option value="OXXO - Av. Carlos Izaguirre">OXXO - Av. Carlos Izaguirre</option>
                        <option value="OXXO - Av. Próceres">OXXO - Av. Próceres</option>
                        <option value="OXXO - Av. Gral. Eugenio Garzón">OXXO - Av. Gral. Eugenio Garzón</option>
                        <option value="OXXO - Av. Villarán">OXXO - Av. Villarán</option>
                        <option value="OXXO - Jr. Lloque Yupanqui">OXXO - Jr. Lloque Yupanqui</option>
                        <option value="OXXO - Av. San Borja Sur">OXXO - Av. San Borja Sur</option>
                        <option value="OXXO - Av. Bolivar">OXXO - Av. Bolivar</option>
                        <option value="OXXO - Jr. Libertad">OXXO - Jr. Libertad</option>
                        <option value="OXXO - Calle Los Negocios">OXXO - Calle Los Negocios</option>
                        <option value="OXXO - Av. Del Ejército">OXXO - Av. Del Ejército</option>
                        <option value="OXXO - Av. República de Chile">OXXO - Av. República de Chile</option>
                        <option value="OXXO - Av. Hipolito Unanue">OXXO - Av. Hipolito Unanue</option>
                        </select>
                        </br>
                    </div>
                    <label for="comentario">Comentarios</label>
                    <div class="form-group">
                        <textarea id="mensaje" class="form-control" name="mensaje" maxlength="190"
                            style="height: 10rem; resize: none;" required></textarea>
                    </div>
                    </br>
                    <small>Estoy de acuerdo con el <a href='https://www.oxxo.co/aviso-de-privacidad"'>Aviso de privacidad</a> y los <a
                            href='https://www.oxxo.pe/terminos-y-condiciones'>Términos y condiciones</a></small><br /><br />
                    <p style="text-align: center">
                        <button type="submit" class="btn btn-danger btn-lg">Enviar</button>
                    </p>
    </div>
</br>
</br>
        <!-- js bootstrap -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" 
        integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" 
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" 
        integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>
    </body>
</html>
