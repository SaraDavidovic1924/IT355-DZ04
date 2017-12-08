<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ include file="header.jsp" %>

<html>
    <head>
        <title><spring:message code="unosNaslov"/></title>
    </head>
    <body>
        <h2><spring:message code="pregledNaslov"/></h2>
      <table>
        <tr>
            <td><spring:message code="brObjekta"/></td>
            <td>${brObjekta}</td>
        </tr>
        <tr>
            <td><spring:message code="adresa"/> </td>
            <td>${adresa}</td>
        </tr>
        <tr>
            <td><spring:message code="br"/> </td>
            <td>${br}</td>
        </tr>
        <tr>
            <td><spring:message code="kvadratura"/> </td>
            <td>${kvadratura}</td>
        </tr>
        <tr>
            <td><spring:message code="datum"/> </td>
            <td>${datum}</td>
        </tr>
    </table>
    </body>
</html>

<%@ include file="footer.jsp" %>




