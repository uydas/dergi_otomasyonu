<%-- 
    Document   : index
    Created on : 09.Tem.2019, 14:59:27
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Lorahost hosting - Home</title>
	<link rel="icon" href="lr/img/Fevicon.png" type="image/png">

  <link rel="stylesheet" href="lr/vendors/bootstrap/bootstrap.min.css">
  <link rel="stylesheet" href="lr/vendors/themify-icons/themify-icons.css">
  <link rel="stylesheet" href="lr/vendors/owl-carousel/owl.theme.default.min.css">
  <link rel="stylesheet" href="lr/vendors/owl-carousel/owl.carousel.min.css">

  <link rel="stylesheet" href="lr/css/style.css">
</head>
<body>
    <% Object status = session.getAttribute("isLogin");
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
                else{
                    response.sendRedirect("login.jsp");
                }
               
            }
            else{
                response.sendRedirect("login.jsp");
            }
   

%>
  <!--================ Header Menu Area start =================-->
  <header class="header_area">
    <div class="main_menu">
      <nav class="navbar navbar-expand-lg navbar-light">
        <div class="container box_1620">
          <a class="navbar-brand logo_h" href="index.html"><img src="lr/img/sobiadLogo10.png" alt=""></a>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>

          <div class="collapse navbar-collapse offset" id="navbarSupportedContent">
            <ul class="nav navbar-nav menu_nav justify-content-end">
              <li class="nav-item active"><a class="nav-link" href="index.html">Ana Sayfa</a></li> 
              <li class="nav-item"><a class="nav-link" href="kullanıcıliste.jsp">Kullanıcılar</a></li> 
              <li class="nav-item"><a class="nav-link" href="dergiekle.jsp">Dergi Ekle</a>
              <li class="nav-item"><a class="nav-link" href="dergilist.jsp">Dergiler</a>
              <li class="nav-item submenu dropdown">
                <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                  aria-expanded="false">Pages</a>
                <ul class="dropdown-menu">
                  <li class="nav-item"><a class="nav-link" href="blog.html">Hakkımızda</a>                 
                      <li class="nav-item"><a class="nav-link" href="blog-details.html">Detay</a>                 
                </ul>
							</li>
              <li class="nav-item"><a class="nav-link" href="contact.html">Contact</a></li>
            </ul>
              

            <div class="nav-right text-center text-lg-right py-4 py-lg-0">
            
             <div class="btn-group" role="group">
    <button id="btnGroupDrop1" type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    Oturum
    </button>
    <div class="dropdown-menu" aria-labelledby="btnGroupDrop1">
      <a class="dropdown-item" href="logout.jsp">Çıkış YAP</a>
    </div>
  </div>
            </div>
          </div> 
        </div>
      </nav>
    </div>
  </header>
  <!--================Header Menu Area =================-->


  <!--================ Banner Section start =================-->
  <section class="hero-banner text-center">
    <div class="container">
      
      <h1>SOBİAD</h1>
     
    </div>
  </section>
  <!--================ Banner Section end =================-->

  </body>




					
 	 <!-- gerekli kodlar-->
			 <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
 
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
 
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
   
</body>
</html>