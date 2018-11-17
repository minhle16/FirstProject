<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h1>${msg}</h1>
<c:forEach var="product" items="${allProduct}">

	<c:choose>
		<c:when test="${product.active}">
			<p>${product.id}</p>
			<p>${product.name}</p>
			<p>${product.price}</p>
		</c:when>
	</c:choose>

</c:forEach>