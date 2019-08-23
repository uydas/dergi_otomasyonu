<%--
    Document   : login
    Created on : 16.Tem.2019, 10:04:00
    Author     : Lenovo
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Login V16</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
	<link rel="icon" type="image/png" href="loginpage/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="loginpage/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="loginpage/pagefonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="loginpage/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="loginpage/vendor/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="loginpage/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="loginpage/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="loginpage/vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="loginpage/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="loginpage/css/util.css">
	<link rel="stylesheet" type="text/css" href="loginpage/css/main.css">
<!--===============================================================================================-->
</head>
<body>
    <%
            Object status = session.getAttribute("isLogin");
            if(status!=null){
                System.out.println("status : "+status);
                boolean isLogin =  ((Boolean) status).booleanValue();
                if (isLogin){
                    Object role =  session.getAttribute("role");
                    if (role == "0"){
                        response.sendRedirect("kullanıcıindex.jsp");
                    } else {
                    response.sendRedirect("adminindex.jsp");

                    }
                }
            }

    %>
	<div class="limiter">
		<div class="container-login100" style="background-image: url('loginpage/images/bg-01.jpg');">
			<div class="wrap-login100 p-t-30 p-b-50">
				<span class="login100-form-title p-b-41">
					Kullanıcı Giriş
				</span>
				<form action="loginprocess.jsp" method="post" class="login100-form validate-form p-b-33 p-t-5">

					<div class="wrap-input100 validate-input" data-validate = "Enter Kullanıcıadı">
						<input class="input100" type="text" name="kullaniciadi" placeholder="Kullanıcıadı">
						<span class="focus-input100" data-placeholder="&#xe82a;"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate="Enter Sifre">
						<input class="input100" type="password" name="sifre" placeholder="Sifre">
						<span class="focus-input100" data-placeholder="&#xe80f;"></span>
					</div>

					<div class="container-login100-form-btn m-t-32">
						<button class="login100-form-btn" type="submit">
							Login
						</button>
					</div>
                                    			<div class="container-login100-form-btn m-t-32">
						<button class="login100-form-btn" type="submit" >
                                                    <a class="nav-link" href="Kullanıcıkayıt.jsp">
							kayıt ol
						</button>
					</div>

				</form>
			</div>
		</div>
	</div>


	<div id="dropDownSelect1"></div>

<!--===============================================================================================-->
	<script src="loginpage/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="loginpage/vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="loginpage/vendor/bootstrap/js/popper.js"></script>
	<script src="loginpage/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="loginpage/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="loginpage/vendor/daterangepicker/moment.min.js"></script>
	<script src="loginpage/vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="loginpage/vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="loginpage/js/main.js"></script>


</body>
</html>