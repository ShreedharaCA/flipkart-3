<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="icon" type="image/ico" href="icon.ico"/>
<link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script src="<%=request.getContextPath()%>/sis-bootstrap/js/bootstrap-multiselect.js" type="text/javascript"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script><title>Flipkart_Group5</title>
</head>
<body >
<br><br>

<div class="col-lg-7">
<form method="post" action="login_action" class="form-horizental">
		
	<div class="form-group">
      	<label  class="col-lg-2 control-label">Email</label>
      	<div class="col-lg-4">
     		<div class="input-group">
     			<span class="input-group-addon" id="basic-addon1">
     			  <span class="glyphicon glyphicon-user" aria-hidden="true"></span> 
     			</span>
       			<input type="text" class="form-control" placeholder="Type UserName here" name="userName">
       		 </div>       							
       							  
      	</div>
      	<br><br>
      </div>	 
	<div class="form-group">
      	<label  class="col-lg-2 control-label">Password</label>
      	<div class="col-lg-4">
     		<div class="input-group">
     			<span class="input-group-addon" id="basic-addon1">
     			  <span class="glyphicon glyphicon-lock" aria-hidden="true"></span> 
     			</span>
       			<input type="password" class="form-control" placeholder="********" name="password">
       		 </div>       							
       							  
      	</div>
      	<br><br>
      </div>
	<div class="form-group">
      	<div class="col-lg-10 col-lg-offset-2"><input type="submit" value="Submit"  class="btn btn-primary" />
       	<input type="reset" class="btn btn-default" name="Reset"/>
        </div>
     </div>
	
</form>
</div>
<div class="col-lg-3"></div>

</body>
</html>