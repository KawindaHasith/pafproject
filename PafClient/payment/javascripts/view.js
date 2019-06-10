
$(function (){

	var $payments = $('#payments');

	$.ajax({

		type: 'GET',
		url: 'http://localhost:8080/payments/payment',
		success: function(payments) {

			$.each(payments, function(i, payment){

				$payments.append('<li>PID: '+ payment.pid + ' DATE: '+ payment.pdate + ' AMOUNT: ' + payment.pamount + ' STATUS: ' + payment.pstatus  + ' ORDER ID: ' + payment.oid + '</li>');

			});
			console.log(response);

		},
		error: function() {

			alert('error loading data');
		}


	});


});


