
$(function (){

	var $orders = $('#orders');

	$.ajax({

		type: 'GET',
		url: 'http://localhost:8080/orders/order',
		success: function(orders) {

			$.each(orders, function(i, order){

				$orders.append('<li>ODER ID: '+ order.oid + ' DATE: '+ order.odate + ' QUANTITY: ' + order.qty + ' TOTAL: ' + order.total  + ' FOOD ID: ' + order.fid + '</li>');

			});
			console.log(response);

		},
		error: function() {

			alert('error loading data');
		}


	});


});


