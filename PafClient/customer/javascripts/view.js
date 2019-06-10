
$(function (){

	var $customers = $('#customers');

	$.ajax({

		type: 'GET',
		url: 'http://localhost:8080/customers/customer',
		success: function(customers) {

			$.each(customers, function(i, customer){

				$customers.append('<li>USERNAME: '+ customer.username + ' EMAIL: '+ customer.email + ' FIRST NAME: ' + customer.fname + ' LAST NAME: ' + customer.lname  + ' ADDRESS: ' + customer.address + '</li>');

			});
			console.log(response);

		},
		error: function() {

			alert('error loading data');
		}


	});


});


