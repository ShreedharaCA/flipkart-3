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
	  		
  		<form  action="addadvertisement" method="post" name="addAdvertisementForm" enctype="multipart/form-data">
		
		<h3 align="center">Add Advertisement </h3>
		<br><br>
		
		  <div class="form-group">
				<div class="col-lg-2"></div>
     			<label  class="col-lg-2 control-label">Already Ad Names:</label>
     			
     			<sx:autocompleter  list="alreadyadlist" name="ad_name" showDownArrow="false"></sx:autocompleter>
     			
       	    </div>  	
       	    <br><br>
    
		
			 <div class="form-group">
				<div class="col-lg-2"></div>
     			<label  class="col-lg-2 control-label">Advertisement Id:</label>
     				<div class="col-lg-4">
     		<div class="input-group">
     			<input type="text" placeholder ="Type advertisement id" name="advertisement_id">
       		
       		 </div>       							
     
     			</div>       	<br><br>    </div>  	<br><br>
       	    
      <div class="form-group">
				<div class="col-lg-2"></div>
     			<label  class="col-lg-3 control-label">Product Names:</label>
     			
     			<sx:autocompleter  list="productlist" name="product_name" showDownArrow="false"></sx:autocompleter>
     			<br><br>
       	    </div>  	
       	    <br><br>
       	    
       	    <div class="form-group">
				<div class="col-lg-2"></div>
       	     	<div class="col-lg-2 control-label"><label for="comment" >Ad Main Heading:</label></div>
       	     	<div class="col-lg-8">       	     	
       	     	<div class="input-group">
     			<input type="text" placeholder ="Type advertisement name" name="advertisement_name">
       			
       		 </div>       							
       		
       	     		</div>	
       	     	       	<br><br>    
       	     </div>
       	     <br><br>
       	     
       	       <div class="form-group">
				<div class="col-lg-2"></div>
       	     	<div class="col-lg-2 control-label"><label for="comment" >Ad Description</label></div>
       	     	<div class="col-lg-8">       	 
       	     	<div class="input-group">
     			<input type="text" placeholder ="Type advertisement description" name="advertisement_description">
       			
       		 </div>       							
       		    	
       	     		       	     	</div> <br><br>	</div>
       	     		       	     	
       	    <br><br>
       	    
       	    	<div class="form-group">
   					
   						<div class="col-lg-2"></div>
      					<label  class="col-lg-2 control-label">Image:</label>
     					 <div class="col-lg-2">
     					 	
       							 <s:file class="form-control"   name="image"></s:file>
     					 </div>
     					 <br><br>
   					 </div>
   					 
   				
       	    
       	    
       	     	
    		
    		   <br><br>
    		 <div class="form-group">
       	     		<div class="col-lg-2"></div>
					<div class="col-lg-8 col-lg-offset-2">       	     	
       	      		<input type="submit" value="Add Advertisement"  class="btn btn-primary" />
       	      		</div>
      		</div>
		
		</form>
		<br><br><br>
	</div>
  		

</div>

</body>
</html>