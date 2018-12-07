<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="mahadevBhawanHeader.jsp"></jsp:include>
<title>Mahadev Construction</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script type="text/javascript" charset="utf8"
	src="https://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/jquery.dataTables.min.js"></script>
<style type="text/css">
#example_length {
	display: none;
}

.dataTables_filter {
	display: none;
}

.button {
	background-color: #4CAF50; /* Green */
	border: none;
	color: black;
	padding: 20px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 4px 2px;
	cursor: pointer;
}

.button3 {
	border-radius: 8px;
}
</style>
</head>
<body>
	<center>
		<h2>Material Range</h2>
	</center>

	<div>
		<button class="button button3" onclick="addMaterials()">Add
			Materials</button>
	</div>
	<br>

<div id="materialRangeImg" style="width: 40%;">
<img src = "resources/images/material.jpg" style="height:498px;"/>
</div>


<div id="addMaterialDiv" style="display:none;">
<div class="w3-container w3-card-4 w3-light-grey" style="width: 40%;">
		<h2>Add New Materials</h2>

		<p>
			<label>Date</label> <input class="w3-input w3-border w3-round-xxlarge"
				name="date" type="date" id="date">
		</p>
		<p>
			<label>Material Name</label> <input
				class="w3-input w3-border w3-round-xxlarge" name="materialName" type="text" id="materialName">
		</p>
		<p>
			<label>Material Description</label> <input
				class="w3-input w3-border w3-round-xxlarge" name="materialDescription" type="text" id="materialDescription">
		</p>

		<label>Material Rate</label> <input
			class="w3-input w3-border w3-round-xxlarge" name="materialRate" type="text" id="materialRate">
		</p>
		
		<button class="w3-btn w3-blue-grey" onclick="saveMaterialRange()">Save</button>
		<br>
	</div>
</div>
</body>

<script type="text/javascript">

function addMaterials(){
	$("#addMaterialDiv").css('display','block');
	$("#materialRangeImg").css('display','none');
	
}

function saveMaterialRange(){
	
	var createdDate= $("#date").val();
	var materialName = $("#materialName").val();
	var materialDescription= $("#materialDescription").val();
	var rate= $("#materialRate").val();
	
	var materialRange = {createdDate, materialName,materialDescription,rate}
	console.log(materialRange);
	
	 $.ajax({
        type: 'POST',
        url: "saveMaterialRange",
        data: JSON.stringify(materialRange),
        contentType:"application/json; charset=utf-8",
        success: function(resultData) {
        	window.location.href = 'materialRange';
        },
	});
        	
 }
	
</script>

</html>