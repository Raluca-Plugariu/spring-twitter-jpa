$( document ).ready(function() {
	
	var url = window.location;
	
	// SUBMIT FORM
    $("#login").click(function()  {
		// Prevent the form from submitting via the browser.
	
    	var formData = {
    			"username": $("#username").val(),
    			"password": $("#password").val()
    			};
    	console.log(formData);
    	
    	$.ajax({
    		type: "POST",
    		async: true,
    		contentType: "application/json",
    		url: "http://localhost:8080/twitter/",
    		data: JSON.stringify(formData),
    		dataType: 'json',
    		success: function(result){
    			 window.location

    	            .replace("http://localhost:8080/twitter/register");
    			console.log(result);
    			
    		},
    		failure: function(e){
    			alert("Error");
    			console.log("Error: ", e);
    		}    		
    	});
    	
   
    });
});
    