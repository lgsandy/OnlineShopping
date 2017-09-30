<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<spring:url var="bootstrap" value="/resources/bootstrap"></spring:url>
<spring:url var="jqyery" value="/resources/jquery"></spring:url>
<spring:url var="popper" value="/resources/popper"></spring:url>
<spring:url var="images" value="/resources/images"></spring:url>
<spring:url var="custom" value="/resources/custom"></spring:url>

<c:set var="rootContext" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Sandy-Online-Shopping- ${title}</title>
<script>
	window.menu = '${title}';
</script>

<!-- Bootstrap core CSS -->
<link href="${bootstrap}/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${bootstrap}/customCss/onlineShopping.css" rel="stylesheet">

</head>

<body>
	<div class="bodyWrapper">
		<!-- Navigation bar -->

		<%@include file="./shared/navbar.jsp"%>

		<!-- Navigation bar -->
		<div class="bodyContent">

			<!-- Page Content -->

			<c:if test="${userClickHome==true}">
				<%@include file="bodyhome.jsp"%>
			</c:if>

			<!-- Display About Us when user is clicled About us -->
			<c:if test="${userClickAboutUs==true}">
				<%@include file="aboutUs.jsp"%>
			</c:if>

			<!-- Display About Us when user is clicled Contact us -->
			<c:if test="${userClickContact==true}">
				<%@include file="contactUs.jsp"%>
			</c:if>
			
			<!-- Display When listProduct is clicked -->
			<c:if test="${userClickAllproducts==true or userClickCategoryProducts==true}">
				<%@include file="listproduct.jsp"%>
			</c:if>

			<!-- Page container -->
		</div>

		<!-- Footer -->
		
		<%@include file="./shared/footer.jsp"%>

		<!-- Footer -->
		
		<!-- Bootstrap core JavaScript -->

		<script src="${jqyery }/jquery.min.js"></script>
		<script src="${popper }/popper.min.js"></script>
		<script src="${bootstrap }/js/bootstrap.min.js"></script>
		<!-- Custom JavaScript -->
		<script src="${custom }/myapp.js"></script>

	</div>
	
</body>

</html>
