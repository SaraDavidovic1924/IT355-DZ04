<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ include file="header.jsp" %>
<form:form method="POST" action="/IT335-DOMACI3/addNekretnine">
    <table>

        <tr>
            <td><form:label path="brObjekta"><spring:message code="brObjekta"/></form:label></td>
            <td><form:input path="brObjekta" /></td>
        </tr>
        <tr>
            <td><form:label path="adresa"><spring:message code="adresa"/></form:label></td>
            <td><form:input path="adresa" /></td>
        </tr>
        <tr>
            <td><form:label path="br"><spring:message code="br"/></form:label></td>
            <td><form:input path="br" /></td>
        </tr>
        <tr>
            <td><form:label path="kvadratura"><spring:message code="kvadratura"/></form:label></td>
            <td><form:input path="kvadratura" /></td>
        </tr>
        <tr>
            <td><form:label path="datum"><spring:message code="datum"/></form:label></td>
            <td><form:input path="datum" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Pošalji"/>
            </td>
        </tr>
    </table>

</form:form>