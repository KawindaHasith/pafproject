$(function (){


	$.ajax({

		type: 'GET',
		url: 'http://localhost:8080/payments/payment',
		success: function(response) {
			console.log(response);
		},
		error: function() {

			alert('error loading data');
		}


	});



$('#submit').on('click',function(){


	var $pid = $('#pid');
                           
                            var regxpmnt=  /^[0-9]/;
                          

                            if($pid.val() == ""){
                                document.getElementById('pidl').innerHTML = " ** Please fill the PID";
                                return false;
                              }
        


		

		$.ajax({

		type: 'DELETE',
		url: 'http://localhost:8080/customers/customer/'+$pid.val(),
		success: function(response) {
			alert('Data Deleted successfully..!');
			console.log(response);
			
		},
		error: function(response) {

			console.log(response);
			alert('error loading data');
		}


	    });

	});

});
