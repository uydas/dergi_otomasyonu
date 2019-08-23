<%-- 
    Document   : index
    Created on : 09.Tem.2019, 14:23:43
    Author     : Lenovo
--%>





<%@page import="dergi.dergilerDao"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>





<html lang="en">
<%   int kullaniciid = (int) session.getAttribute("kullaniciid");
System.out.println("k.. :"+ session.getAttribute("kullaniciid") );

                                dergilerDao Kaydet=new dergilerDao();
                                boolean kontrol;
                                if(request.getParameter("kaydet")!=null){
                                kontrol=Kaydet.insertdergi(request,kullaniciid);
                                
                                
                                }
                                
                                %>


<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title>Au Register Forms by Colorlib</title>

    <!-- Icons font CSS-->
    <link href="vendorpage/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="vendorpage/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="vendorpage/vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="vendorpage/vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="vendorpage/css/main.css" rel="stylesheet" media="all">
</head>

<body>
<img src="lr/img/sobiadLogo10.png" alt=""></img>
    <div class="page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins">
        <div class="wrapper wrapper--w680">
            <div class="card card-4">
                <div class="card-body">
                    <h2 class="title">Registration Form</h2>
                    <form method="POST">
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Dergi ADI</label>
                                    <input class="input--style-4" type="text" name="dergiadi">
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Dergi ISSN</label>
                                    <input class="input--style-4" type="text" name="issn">
                                </div>
                            </div>
                           <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Dergi Alanı</label>
                                    <input class="input--style-4" type="text" name="alan">
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Dergi Editör</label>
                                    <input class="input--style-4" type="text" name="editor">
                                </div>
                            </div>
                        </div>
                        <div class="row row-space">
                                    <div class="col-md-2">
                                <div class="form-group has-feedback">
                                    <label class="control-label" for="date1">İlk Yayın Tarihi:</label>
                                    <input class="form-control" name="ilkyayin" id="date1" type="date"/>
                                    <span class="fa fa-calendar form-control-feedback" aria-hidden="true"></span> </div>
                            </div>
                        </div>
                        <div class="row row-space">
                                    <div class="col-md-2">
                                <div class="form-group has-feedback">
                                    <label class="control-label" for="date2">Son Yayın Tarihi:</label>
                                    <input class="form-control" name="sonyayin" id="date2" type="date"/>
                                    <span class="fa fa-calendar form-control-feedback" aria-hidden="true"></span> </div>
                            </div>
                        </div>
                        
                        </div>
                        <div class="p-t-20">
                            <button class="btn btn--radius btn--green" name="kaydet" type="submit">KAYDET</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>


    <!-- Jquery JS-->
    <script src="vendorpage/vendor/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="vendorpage/vendor/select2/select2.min.js"></script>
    <script src="vendorpage/vendor/datepicker/moment.min.js"></script>
    <script src="vendorpage/vendor/datepicker/daterangepicker.js"></script>

    <!-- Main JS-->
    <script src="vendorpage/js/global.js"></script>

</body><!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>
<!-- end document-->
