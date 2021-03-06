<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="single_top">
<%@ page import="buyer.web.entities.User" %>

	<div class="container">
		<div class="register">
			<form:form action="${pageContext.request.contextPath}/registration"
				method="POST" class="form-horizontal" role="form">
				<div class="register-top-grid">
					<h3>PERSONAL INFORMATION</h3>
					<div>
						<span>First Name<label>*</label></span>
						 <form:input type="text"
							path="name" placeholder="Name" class="form-control" />
							<form:errors path="name" cssClass = "error" />
					</div>
					<div>
						<span>Last Name<label>*</label></span>
						 <form:input type="text"
							path="lastName" placeholder="Last Name" class="form-control" />
							<form:errors path="lastName" cssClass = "error" />
					</div>
					<div>
						<span>Email Address<label>*</label></span>
						<form:input type="text"
							path="email" placeholder="Email" class="form-control" />
							<form:errors path="email" cssClass = "error" />
					</div>
					<div class="clearfix"></div>
					<a class="news-letter" href="#"> <label class="checkbox">
					<input type="checkbox" name="checkbox" ><i> </i>Sign
							Up for Newsletter</label>
					</a>
				</div>
				<div class="register-bottom-grid">
					<h3>LOGIN INFORMATION</h3>
					<div>
						<span>Password<label>*</label></span> 
						<form:input type="password" path="password" placeholder="Password" class="form-control" />
						<form:errors path="password" cssClass = "error" />
					</div>
					<div>
						<span>Confirm Password<label>*</label></span>
						<form:input type="password" path="confirmpassword" placeholder="Repeat Password" class="form-control" />
					</div>
					
					<div class="clearfix"></div>
	
				</div>
				
				<div class="register-but">
					<input type="submit" class="btn btn-primary btn-block"
						value="Submit">
					<div class="clearfix"></div>
				</div>
			</form:form>

		</div>
	</div>
</div>
