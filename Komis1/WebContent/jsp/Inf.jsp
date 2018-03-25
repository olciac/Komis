<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>


<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<style>
.obraz {
	height: 300px;
}
.przycisk
	{
	color: red;
	float: right;
	background: yellow;
	height : 50px;
	width: 200px;
	text-align: center;
	line-height: -moz-block-height;
	}
</style>
<body>
<div class="container">
    <div class="row">
    <br>
        <nav class="navbar navbar-default" role="navigation">
            <div class="container-fluid">
                 <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-admin">
                        <span class="sr-only">Toggle Menu</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand">TBC <span class="glyphicon glyphicon-stats"></span></a>
                </div><!--/.navbar-header -->
                <div class="collapse navbar-collapse" id="navbar-admin">
                 <!---------------------------------MENU--------------------------------->
                    <ul class="nav navbar-nav">
                        <li><a href="${home}/Komis1/Komis"><span class="glyphicon glyphicon-dashboard"></span> Lista samochodów</a></li>
                        <li><a href="#"><span class="glyphicon glyphicon-bullhorn"></span> Dodaj samochód</a></li>
                        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Kontakt</a></li>
                    </ul>
               
                <!---------------------------------LOGIN - SIGNUP--------------------------------->
                    <ul class="nav navbar-nav navbar-right">
                        <li class="hidden-sm hidden-xs">
                            <a href="${home}/Komis1/" class="link-button-color"><span class="glyphicon glyphicon-log-out"></span> Wyloguj</a>
                        </li>
                    </ul>
             </div><!--/.container-fluid -->
        </nav><!--/.navbar -->
    </div>
</div>


    
     
<div class="container">
 	<a class="przycisk" href="${home}/Komis1/komis">Powrót</a><br>

	<img class="obraz" src="${car.foto}" alt="car">
	<br><hr>
	<ul class="list-group">
		<li class="list-group-item">Marka : ${car.make}</li>
		<li class="list-group-item">Model : ${car.model}</li>
		<li class="list-group-item">Rok produkcji : ${car.year}</li>
		<li class="list-group-item">Cena : ${car.price} zł</li>
	</ul>
</div>
     
     
   
</body>
</html>