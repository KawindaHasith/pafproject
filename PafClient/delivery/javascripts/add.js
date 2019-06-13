
$(function (){


	$.ajax({

		type: 'GET',
		url: 'http://localhost:8080/deliveries/delivery/',
		success: function(response) {
			console.log(response);
		},
		error: function() {

			alert('error loading data');
		}


	});


$('#submit').on('click',function(){


	var $id = $('#id');
	var $cusName = $('#cusName');
	var $address = $('#address');
	var $telNo = $('#telNo');
	var $email = $('#email');
	var $itemName = $('#itemName');
	var $noOfItem = $('#noOfItem');
	var $amount = $('#amount');
                           
                            var regxpmnt=  /^[0-9]/;
                          
                           
                            
                            if( $id.val() == ""){
                              document.getElementById('cardidl').innerHTML = " ** please fill the ID";
                              return false;
                            }
                            else if( $cusName.val() == ""){
                              document.getElementById('oidl').innerHTML = " ** please fill the Customer Name";
                              return false;
                            }

                            
                          
                            
                            else if( $address.val() == ""){
                              document.getElementById('pamountl').innerHTML = " ** Please fill the Address";
                              return false;
                            }

                            
                            else if($telNo.val() == ""){
                              document.getElementById('pdatel').innerHTML = " ** Please fill the Contact Number";
                              return false;
                            }

                            else if($email.val() == ""){
                                document.getElementById('pidl').innerHTML = " ** Please fill the E-mail";
                                return false;
                              }
                                
                            else if($itemName.val() == ""){
                                document.getElementById('itemName1').innerHTML = " ** Please fill the Item Name";
                                return false;
                              }

                             else if($noOfItem.val() == ""){
                                document.getElementById('noOfItem1').innerHTML = " ** Please fill the Number of Items";
                                return false;
                              }

                             else if($amount.val() == ""){
                                document.getElementById('amount1').innerHTML = " ** Please fill the Total Amount";
                                return false;
                              }


		var delivery = {
		    id: $id.val(),
		    cusName: $cusName.val(),
		    address: $address.val(),
		    telNo: $telNo.val(),
		    email: $email.val(),
		    itemName: $itemName.val(),
		    noOfItem: $noOfItem.val(),
		    amount: $amount.val()
            }

		$.ajax({

		type: 'POST',
		url: 'http://localhost:8080/deliveries/delivery/',
		contentType:'application/json',
		data: JSON.stringify(delivery),
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


