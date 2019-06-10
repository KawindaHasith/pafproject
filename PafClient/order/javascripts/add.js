
$(function (){


	$.ajax({

		type: 'GET',
		url: 'http://localhost:8080/orders/order',
		success: function(response) {
			console.log(response);
		},
		error: function() {

			alert('error loading data');
		}


	});


$('#submit').on('click',function(){


	var $oid = $('#oid');
	var $qty = $('#qty');
	var $odate = $('#odate');
	var $total = $('#total');
	var $fid = $('#fid');
	var $cid = $('#cid');
	var $sid = $('#sid');
                           
                            var regxpmnt=  /^[0-9]/;
                          
                           
                            
                            if( $oid.val() == ""){
                              document.getElementById('cardidl').innerHTML = " ** please fill the Order ID";
                              return false;
                            }
                            else if( $qty.val() == ""){
                              document.getElementById('oidl').innerHTML = " ** please fill the Quantity";
                              return false;
                            }

                            
                          
                            
                            else if( $odate.val() == ""){
                              document.getElementById('pamountl').innerHTML = " ** Please fill the Date";
                              return false;
                            }

                            
                            else if($total.val() == ""){
                              document.getElementById('pdatel').innerHTML = " ** Please fill the Total Amount";
                              return false;
                            }

                            else if($fid.val() == ""){
                                document.getElementById('fid1').innerHTML = " ** Please fill the FID";
                                return false;
                              }
                                
                            else if($cid.val() == ""){
                                document.getElementById('cid1').innerHTML = " ** Please fill the CID";
                                return false;
                              }

                            else if($sid.val() == ""){
                                document.getElementById('sid1').innerHTML = " ** Please fill the SID";
                                return false;
                              }


		var order = {
		    oid: $oid.val(),
		    odate: $odate.val(),
		    qty: $qty.val(),
		    total: $total.val(),
		    fid: $fid.val(),
		    cid: $cid.val(),
		    sid: $sid.val()
            }

		$.ajax({

		type: 'POST',
		url: 'http://localhost:8080/orders/order',
		contentType:'application/json',
		data: JSON.stringify(order),
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


