<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="single_top">
	<div class="container">
		<div class="register">
			<form action="${pageContext.request.contextPath}/registration"
				method="POST" class="form-horizontal" role="form">
				<div class="register-top-grid">
					<h3>PERSONAL INFORMATION</h3>
					<div>
						<span>First Name<label>*</label></span> <input type="text"
							name="name" placeholder="Name" class="form-control">
					</div>
					<div>
						<span>Last Name<label>*</label></span> <input type="text"
							name="lastName" placeholder="Last Name" class="form-control">
					</div>
					<div>
						<span>Email Address<label>*</label></span> <input type="text"
							name="email" placeholder="Email" class="form-control">
					</div>
					<div class="clearfix"></div>
					<a class="news-letter" href="#"> <label class="checkbox"><input
							type="checkbox" name="checkbox" checked=""><i> </i>Sign
							Up for Newsletter</label>
					</a>
				</div>
				<div class="register-bottom-grid">
					<h3>LOGIN INFORMATION</h3>
					<div>
						<span>Password<label>*</label></span> 
						<input type="password" name="password" placeholder="Password" class="form-control">
					</div>
					<div>
						<span>Confirm Password<label>*</label></span>
						<input type="password" name="confirmpassword" placeholder="Repeat Password" class="form-control">
					</div>
					
					<div class="clearfix"></div>
	
				</div>
				
				<div class="register-but">
					<input type="submit" class="btn btn-primary btn-block"
						value="Submit">
					<!--  <input type="submit" value="submit"> -->
					<div class="clearfix"></div>
				</div>
			</form>

		</div>
	</div>
</div>
