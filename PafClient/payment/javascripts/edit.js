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


	//only accept numercal values from the data fields
	$(".allownumericwithoutdecimal").on("keypress keyup blur",function (event) {    
		$(this).val($(this).val().replace(/[^\d].+/, ""));
		if ((event.which < 48 || event.which > 57)) {
				event.preventDefault();
		}
});


//only accept float values from the data fields
	$(".allownumericwithdecimal").on("keypress keyup blur",function (event) {
		//this.value = this.value.replace(/[^0-9\.]/g,'');
	$(this).val($(this).val().replace(/[^0-9\.]/g,''));
		if ((event.which != 46 || $(this).val().indexOf('.') != -1) && (event.which < 48 || event.which > 57)) {
				event.preventDefault();
		}
	});


	$('#pid').on('change',function(){

	    	var $pid = $('#pid');
				var $oid = $('#oid');
				var $pamount = $('#pamount');
				var $pdate = $('#pdate');
				var $cardid = $('#cardid');
				var $pstatus = $('#pstatus');

				$.ajax({

					type: 'GET',
					url: 'http://localhost:8080/payments/payment/'+$pid.val(),
					success: function(payment) {

						if(payment.pid!=$pid.val()){

							alert('Record not found');

						}
							

						$('#oid').val(payment.oid);
						$('#pamount').val(payment.pamount);
						$('#pdate').val(payment.pdate);
						$('#cardid').val(payment.cardid);
						$('#pstatus').val(payment.pstatus);
						console.log(payment);

					},
					error: function() {

						alert('error loading data');
					}


				});

	});

$('#submit').on('click',function(){


        var $pid = $('#pid');
				var $oid = $('#oid');
				var $pamount = $('#pamount');
				var $pdate = $('#pdate');
				var $cardid = $('#cardid');
				var $pstatus = $('#pstatus');
                           
                            var regxpmnt=  /^[0-9]/;
                          
                           
                            
                            if( $pid.val() == ""){
															document.getElementById('cardidl').innerHTML = " ** please fill the Payment ID";
                              return false;
                            }
                            else if( $oid.val() == ""){
                              document.getElementById('oidl').innerHTML = " ** please fill the OID";
                              return false;
                            }

                            
                          
                            
                            else if( $pamount.val() == ""){
                              document.getElementById('pamountl').innerHTML = " ** Please fill the PAMOUNT";
                              return false;
                            }
                            else if( !regxpmnt.test($pamount.val())){
         
                                document.getElementById('pamountl').innerHTML = " ** Please enter only numbers";
                                return false;
                                        }

                            
                            else if($pdate.val() == ""){
                              document.getElementById('pdatel').innerHTML = " ** Please fill the PDATE";
                              return false;
                            }

                            else if($cardid.val() == ""){
                                document.getElementById('pidl').innerHTML = " ** Please fill the CID";
                                return false;
                              }
                                
                            else if($pstatus.val() == ""){
                                document.getElementById('pstatusl').innerHTML = " ** Please Select the Status";
                                return false;
                              }


		var payment = {
		    pid: $pid.val(),
		    pdate: $pdate.val(),
		    pamount: $pamount.val(),
		    pstatus: $pstatus.val(),
		    oid: $oid.val(),
		    cardid: $cardid.val()
            }

		$.ajax({

		type: 'PUT',
		url: 'http://localhost:8080/payments/payment',
		contentType:'application/json',
		data: JSON.stringify(payment),
		dataType: 'json',
		success: function(response) {
			alert('Data changed successfully..!');
			location.reload();
			console.log(response);
			
		},
		error: function(response) {

			console.log(response);
			alert('error loading data');
		}


	    });

	});


});