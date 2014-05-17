<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.7.min.js"></script>
<script type="text/javascript">

$(document).ready(function()
		
		{
	$("#id").click(function()
	{
		var memberList = [{
					id: null,
			 		fname:"fname1",
			        lname:"lname1",
			        email:"email@gmail.com",
			        source:"jmeter"
			       },
			       {
			    	    id: null,
				 		fname:"fname11",
				        lname:"lname12",
				        email:"email1@gmail.com"  ,
				        	source:"jmeter"
			       },
			       {
			    	   id: null,
				 		fname:"fname12",
				        lname:"lname12",
				        email:"email2@gmail.com",
				        source:"jmeter"
			       },
			       {
			    	   id: null,
				 		fname:"fname11",
				        lname:"lname12",
				        email:"email3@gmail.com",
				        source:"jmeter"
			       },
			       {
			    	   id: null,
				 		fname:"fname1",
				        lname:"lname1",
				        email:"gp@gmail.com",
				        source:"jmeter"
			       },
			       {
			    	   id: null,
				 		fname:"fname1",
				        lname:"lname1",
				        email:"gp@gmail.com",
				        source:"jmeter"
			       },
			       {
			    	   id: null,
				 		fname:"fname1",
				        lname:"lname1",
				        email:"gp@gmail.com",
				        source:"jmeter"
			       },
			       {
			    	   id: null,
				 		fname:"fname1",
				        lname:"lname1",
				        email:"gp@gmail.com",
				        source:"jmeter"
			       },
			       {
			    	   id: null,
				 		fname:"fname1",
				        lname:"lname1",
				        email:"gp@gmail.com",
				        source:"jmeter"
			       },
			       {
			    	   id: null,
				 		fname:"fname1",
				        lname:"lname1",
				        email:"gp@gmail.com",
				        source:"jmeter"
			       },
			       {
			    	   id: null,
				 		fname:"fname1",
				        lname:"lname1",
				        email:"gp@gmail.com",
				        source:"jmeter"
			       },
			       {
			    	   id: null,
				 		fname:"fname1",
				        lname:"lname1",
				        email:"gp1@gmail.com",
				        source:"jmeter"
			       },
			       {
			    	   id: null,
				 		fname:"fname1",
				        lname:"lname1",
				        email:"gp2@gmail.com",
				        source:"jmeter"
			       },
			       
			       {
			    	   id: null,
				 		fname:"fname3",
				        lname:"lname5",
				        email:"gp2@gmail.com",
				        source:"jmeter"
				       },
				       {
				    	   id: null,
					 		fname:"fname1",
					        lname:"lname1",
					        email:"gp3@gmail.com",
					        source:"jmeter"
				       },
				       {
				    	   id: null,
					 		fname:"fname1",
					        lname:"lname1",
					        email:"raju1@gmail.com",
					        source:"jmeter"
				       },
				       {
				    	   id: null,
					 		fname:"fname1r",
					        lname:"lname13",
					        email:"raju2@gmail.com",
					        source:"jmeter"
				       },
				       /* {
				    	   id: null,
					 		fname:"fname13",
					        lname:"lname14",
					        email:"raju2@gmail.com" 
				       },
				       {
				    	   id: null,
					 		fname:"fname144",
					        lname:"lname166",
					        email:"raju14@gmail.com"
				       },
				       {
				    	   id: null,
					 		fname:"fname155",
					        lname:"lname1yy",
					        email:"raju15@gmail.com" 
				       },
				       {
				    	   id: null,
					 		fname:"fname1",
					        lname:"lname1",
					        email:"majji1@gmail.com" 
				       },
				       {
				    	   id: null,
				    	   fname:"fname133",
					        lname:"lname155",
					        email:"majji2@gmail.com" 
				       },
				       {
				    	   id: null,
					 		fname:"fname1",
					        lname:"lname1",
					        email:"email1" 
				       },
				       {
				    	   id: null,
					 		fname:"fname1",
					        lname:"lname1",
					        email:"email1" 
				       },
				       {
				    	   id: null,
					 		fname:"fname1",
					        lname:"lname1",
					        email:"email1" 
				       },
				       {
				    	   id: null,
					 		fname:"fname1sfsd",
					        lname:"lname1sdfds",
					        email:"lgp2@gmail.com"
				       },
				       
				       {
				    	   id: null,
					 		fname:"fname144",
					        lname:"lname155",
					        email:"lgp2@gmail.com"
					       },
					       
					       {
					    	   id: null,
						 		fname:"fname1dgdf",
						        lname:"lname1dgfd",
						        email:"lgp1@gmail.com"  
					       },
					       {
					    	   id: null,
						 		fname:"fname15t54",
						        lname:"lname1dfgdf",
						        email:"bchand1@gmail.com" 
					       },
					       {
					    	   id: null,
						 		fname:"fname1",
						        lname:"lname1",
						        email:"bchand@gmail.com" 
					       },
					       {
					    	   id: null,
						 		fname:"fname1",
						        lname:"lname1",
						        email:"bchand@gmail.com" 
					       },
					       
						       {
						    	   id: null,
							 		fname:"fname1tt",
							        lname:"lname1gf",
							        email:"email1" 
						       },
						       {
						    	   id: null,
							 		fname:"fname155",
							        lname:"lname1df",
							        email:"gp5@gmail.com" 
						       },
						       {
						    	   id: null,
							 		fname:"fname1wre",
							        lname:"lname1sdfds",
							        email:"gp4@gmail.com" 
						       },
						       {
						    	   id: null,
							 		fname:"fname13",
							        lname:"lname14",
							        email:"gp@gmail.com" 
						       },
						       {
						    	   id: null,
							 		fname:"fname1",
							        lname:"lname1",
							        email:"bchand@gmail.com" 
						       },
						       {
									id: null,
							 		fname:"fname1",
							        lname:"lname1",
							        email:"prasanna@gmail.com"
							       },
							       {
							    	   id: null,
								 		fname:"fname1",
								        lname:"lname1",
								        email:"raju@gamil.com"  
							       },
							       {
							    	   id:null,
								 		fname:"fname1",
								        lname:"lname1",
								        email:"majji@gmail.com" 
							       }
							        */
				 ];
		$.ajax(
			{
				 headers: { 
				        'Accept': 'application/json',
				        'Content-Type': 'application/json' 
				    },
					type: "POST",
					url: "MemberInfoService/save",
					dataType: 'json',
					data:JSON.stringify(memberList)
					//beforeSend: function(xhr){xhr.setRequestHeader('token', 'lllac');
					
					
			}).complete(function(data){
				
				var data1=data.responseText;
				console.log("respone"+data1);
				alert(data1);
				$("#txt").val(data1);
			}); 
		});
	
	
	$("#id1").click(function()
	{
		alert("from id1");		
	$.ajax(
			{/* 
				 headers: { 
				        'Accept': 'application/json',
				        'Content-Type': 'application/json' 
				    }, */
					type: "GET",
					url: "MemberInfoService/get",
					dataType: 'json',
					//data:JSON.stringify(memberList)
					//beforeSend: function(xhr){xhr.setRequestHeader('token', 'lllac');
					
					
			}).complete(function(data){
				
				var data1=data.responseText;
				console.log("respone"+data1);
				alert(data1);
				$("#txt").val(data1);
			}); 
		});
		
		});

</script>
</head>
<body>
  <input type="text" id="txt"/>
   <input type="button" id="id" value="Load Data" />
   <input type="button" id="id1" value="Get Data" />
</body>
</html>