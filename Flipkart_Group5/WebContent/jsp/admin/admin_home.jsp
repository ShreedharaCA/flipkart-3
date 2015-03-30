<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script><title>FlipKart_Group5</title>
</head>
<body>

        <h2>Welcome Admin</h2>
        <nav class="navbar navbar-default">
  <div class="container-fluid">
    
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        
         <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Seller <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="#">Add Seller</li>
                <li class="divider"></li>
            <li><a href="#">Delete Seller</a></li>
        
          </ul>
        </li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Category <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="#">Add Category</a></li>
             <li><a href="#">Add Sub-Category</a></li>
              <li><a href="#">Add Sub-Sub-Category</a></li>
                  <li class="divider"></li>
            <li><a href="#">Delete Category</a></li>
            <li><a href="#">Delete Sub-Category</a></li>
              <li><a href="#">Delete Sub-Sub-Category</a></li>
        
          </ul>
        </li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Product <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="#">Add Product</a></li>
                <li class="divider"></li>
            <li><a href="#">Delete Product</a></li>
        
          </ul>
        </li>
         <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Advertisement <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="addproductforadvertisement">Add Advertisement</a></li>
                <li class="divider"></li>
            <li><a href="selectadheadingtodeletead">Delete Advertisement</a></li>
        
          </ul>
        </li>
        
        
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Stock <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="#">View Stock</a></li>
            
            <li><a href="#">Update Stock</a></li>
        
          </ul>
        </li>
      </ul>
      
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">Logout</a></li>
      </ul>
    </div>
  </div>
</nav>
</body>
</html>