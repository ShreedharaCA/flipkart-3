<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
       <%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
<!-- Custom CSS -->
<link href="<%=request.getContextPath()%>/bootstrap/css/stylish-portfolio.css" rel="stylesheet" type="text/css"/>
 <!-- Custom Fonts -->
<link href="<%=request.getContextPath()%>/bootstrap/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">
<script src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.js"></script>
<script src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.min.js"></script>
<link rel="icon" type="image/ico" href="icon.ico"/>

         <%@include file="/jsp/admin/admin_home.jsp" %>
</head>
<body>

	<div class="col-lg-7">

<div class="mainframe">
	  		<br><br>
	  		
  		<h3 align="center">Delete Advertisement </h3>
		<br><br>
		<form  action="deleteadvertisement" method="post">
		
			
			 <div class="form-group">
				<div class="col-lg-2"></div>
     			<label  class="col-lg-2 control-label">Advertisement Names:</label>
     			<sx:autocompleter  list="adheadinglist" name="advertisement_name" showDownArrow="false"></sx:autocompleter>
     			<br><br>
       	    </div>  		
       	    <br><br>
       	    
       	    	 <div class="form-group">
       	     		<div class="col-lg-2"></div>
					<div class="col-lg-8 col-lg-offset-2">       	     	
       	      		<input type="submit" value="Delete Advertisement"  class="btn btn-primary" />
       	      		</div>
       	      		<br><br>
      		</div>
		
		</form>
		<br><br><br><br><br><br><br><br><br><br><br><br>
	</div>
  		

</div>

</body>
</html>