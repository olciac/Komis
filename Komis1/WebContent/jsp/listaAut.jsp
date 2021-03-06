<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>


<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>


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
                        <li><a href="#"><span class="glyphicon glyphicon-dashboard"></span> Lista samochodów</a></li>
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
  <h2>Lista pojazdów</h2>
    
  <table class="table">
    <thead>
      <tr>
        <th>Marka</th>
        <th>Model</th>
        <th></th>
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${lista}" var="car">
    <tr>
        <td>Marka auta: <c:out value="${car.make}"/></td>
        <td>Model: <c:out value="${car.model}"/></td>  
        <td> <a href="${home}/Komis1/informacja?numer=${car.numer}" class="btn btn-danger">Zobacz szczegóły</a> </td>
    </tr>
    
</c:forEach>
    </tbody>
  </table>
</div>
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
       </body>
       </html>