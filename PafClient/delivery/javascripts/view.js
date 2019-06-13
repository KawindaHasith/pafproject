
$(function (){

	var $deliveries = $('#deliveries');

	$.ajax({

		type: 'GET',
		url: 'http://localhost:8080/deliveries/delivery',
		success: function(deliveries) {

			$.each(deliveries, function(i, delivery){

				$deliveries.append('<li>ID: '+ delivery.id + ' CUSTOMER: '+ delivery.cusName + ' ADDRESS: ' + delivery.address + ' TEL: ' + delivery.telNo  + ' EMAIL: ' + delivery.email + ' ITEM '+ delivery.itemName +' QTY: '+ delivery.noOfItem +' AMOUNT: '+ delivery.amount +'</li>');

			});
			console.log(response);

		},
		error: function() {

			alert('error loading data');
		}


	});


});


