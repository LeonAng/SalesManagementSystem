<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="GBK" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>name</td>
    </tr>
    <c:forEach items="${users}" var="c" varStatus="st">
        <tr>
            <td>${c.name}</td>
            <td>${c.keyword}</td>
               
        </tr>
    </c:forEach>
</table>