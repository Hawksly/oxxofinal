<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar sesión</title>
        <link rel="icon" href="/Oxxo/res/logo/oxxo-asi-de-facil.png">
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
                <li><a href="/Oxxo/Vista/about.php">Sobre nosotros</a></li>
                <li><a href="/Oxxo/Vista/promociones.php">Productos</a></li>
                <li><a href="/Oxxo/Vista/contacto.jsp">Contacto</a></li>
            </ul>
        </nav>
        <a href="/Oxxo/Vista/login.jsp" class="boton"><button>Login</button></a>
        <a onclick="openNav()" class="menu" href="#"><button>Menu</button></a>
        <div class="overlay" id="mobile-menu">
            <a onclick="closeNav()" href="" class="close">&times;</a>
            <div class="overlay-content">
                <a href="/Oxxo/Vista/inicio.php">Inicio</a>
                <a href="/Oxxo/Vista/about.php">Sobre nosotros</a>
                <a href="/Oxxo/Vista/productos.php">Productos</a>
                <a href="/Oxxo/Vista/contacto.jsp">Contacto</a>
            </div>
        </div>
    </header>
        <!-- Fin de Cabecera -->
        <main class="p-4 d-flex flex-column align-items-center">
		<div style="width: 40vw;">
                    <img style="width: 40vw; height:20vw;" src="/Oxxo/res/banner/oxxo.png" alt="aula" />
		</div>
		<div class="card" style="width: 40vw;">
			<div class="card-body">
				<form method="post" class="pb-4" action="SvLogin">
					<h3 class="text-center">Iniciar sesión</h3>
					<label for="username">Nombre de usuario</label>
					<input type="text" class="form-control" id="username" name="username" placeholder="Usuario" required autofocus /><br>
					<label for="password">Password</label>
					<input type="password" class="form-control" id="password" name="password" placeholder="Password" required /><br>
					<input type="hidden" name="action" value="login" />
					<div class="p-4 d-flex flex-ro1 justify-content-around">
						<input type="submit" value="Login" class="btn btn-primary" />
					</div>
				</form>
			</div>
		</div>
	</main> 
        <!-- js bootstrap -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" 
        integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" 
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" 
        integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>
    </body>
</html>