
$(function (){


	$.ajax({

		type: 'GET',
		url: 'http://localhost:8080/customers/customer',
		success: function(response) {
			console.log(response);
		},
		error: function() {

			alert('error loading data');
		}


	});


$('#submit').on('click',function(){


	var $username = $('#username');
	var $password = $('#password');
	var $fname = $('#fname');
	var $lname = $('#lname');
	var $email = $('#email');
	var $address = $('#address');
	var $phone = $('#phone');
	var $id = $('#id');
                           
                            var regxpmnt=  /^[0-9]/;
                          
                           
                            
                            if( $username.val() == ""){
                              document.getElementById('cardidl').innerHTML = " ** please fill the Username";
                              return false;
                            }
                            else if( $password.val() == ""){
                              document.getElementById('oidl').innerHTML = " ** please fill the Password";
                              return false;
                            }

                            
                          
                            
                            else if( $fname.val() == ""){
                              document.getElementById('pamountl').innerHTML = " ** Please fill the First Name";
                              return false;
                            }
                         
                            
                            else if($lname.val() == ""){
                              document.getElementById('pdatel').innerHTML = " ** Please fill the Last Name";
                              return false;
                            }

                            else if($email.val() == ""){
                                document.getElementById('pidl').innerHTML = " ** Please fill the E-mail";
                                return false;
                              }
                                
                            else if($address.val() == ""){
                                document.getElementById('pstatusl').innerHTML = " ** Please fill the Address";
                                return false;
                              }

                              else if($phone.val() == ""){
                                document.getElementById('phone1').innerHTML = " ** Please fill the Contact Number";
                                return false;
                              }

                              else if($id.val() == ""){
                                document.getElementById('id1').innerHTML = " ** Please fill the ID";
                                return false;
                              }


		var customer = {
		    username: $username.val(),
		    password: $password.val(),
		    fname: $fname.val(),
		    lname: $lname.val(),
		    address: $address.val(),
		    email: $email.val(),
		    phone: $phone.val(),
		    id: $id.val()
            }

		$.ajax({

		type: 'POST',
		url: 'http://localhost:8080/customers/customer',
		contentType:'application/json',
		data: JSON.stringify(customer),
		dataType: 'json',
		success: function(response) {
			alert('Data added successfully..!');
			console.log(response);
			
		},
		error: function(response) {

			console.log(response);
			alert('error loading data');
		}


	    });

	});


});


