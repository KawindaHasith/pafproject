# SellNBuy
PAF Assignment

Github link- https://github.com/AchinthaTM/SellNBuy

******Instructions to install and test the system******
**PafClient folder contain frontend and SellNBuy folder contain backend of the system**

*Reequired tools

	1.Spring tool suite (https://spring.io/tools)
	2.Postman (https://www.getpostman.com/tools)
	3.XAMPP (https://www.apachefriends.org/download.html)

*Step 1-  Download project zip file from the github and unzip it.

*Step 2-  Open spring tool suite.

*Step 3-  Go to 'File ->Open Projects From File System ->Directory' and select the file 'SellNBuy' inside the unziped folder then click on 'Finish'.

*Step 4-  After import the project, right click on it select 'Maven ->Update Project'.

*Step 5-  Open XAMPP Control Panel and start the Apache and MySQL services.

*Step 6-  Click on admin button of the MySQL service and it will open phpmyadmin.

*Step 7-  Select the SQL tab of the phpmyadmin and execute the each following statements.

	 create database sellnbuy; -- Create the new database
	 create user 'admin'@'localhost' identified by 'admin'; -- Creates the user
	 grant all on sellnbuy.* to 'admin'@'localhost'; -- Gives all the privileges to the new user on the newly created database

*Step 8- Go to the Sprint Tool Suite, right click on the project 'Run As ->Spring Boot App'.

*Step 9- Open Postman.

*Step 10-Go to Headers field and add following keys and values.
	
	  Key		  Value
      Accept         application/json
      Content-Type   application/json

*Step 11-Check the Web Services.

#Customer Service#

	1.GET All Customers
	Url- http://localhost:8080/customers/customer
	Method- GET

	2.Get Specific Customer
	Url- http://localhost:8080/customers/customer/1
	Method- GET	

	3.Create New Customer
	Url- http://localhost:8080/customers/customer
	Method- POST
	Body- {
    "username": "dilusha123",
    "password": "asdf",
    "fname": "Dilusha",
    "lname": "Rajaguru",
    "address": "Kaduwela",
    "email": "dilushan@gmail.com",
    "phone": "768974123",
    "id": 5
    }

	4.Update Customer
	Url- http://localhost:8080/customers/customer
	Method- PUT
	Body- {
    "username": "dilusha123",
    "password": "asdf",
    "fname": "Dilusha",
    "lname": "Labuthale",
    "address": "Kaduwela",
    "email": "dilushan@gmail.com",
    "phone": "0718002536",
    "id": 5
    }


	5.Delete Customer
	Url- http://localhost:8080/customers/customer/1
	Method- DELETE

#Order Service#

	1.GET All Orders
	Url- http://localhost:8080/orders/order/
	Method- GET

	2.Get Specific Order
	Url- http://localhost:8080/orders/order/1
	Method- GET	

	3.Create New Order
	Url- http://localhost:8080/orders/order/
	Method- POST
	Body- {
    "oid": 5,
    "odate": "2019-05-05",
    "qty": 10,
    "total": 2450,
    "fid": 456,
    "cid": 257,
    "sid": 457
    }


	4.Update Order
	Url- http://localhost:8080/orders/order/
	Method- PUT
	Body- {
    "oid": 5,
    "odate": "2019-05-05",
    "qty": 5,
    "total": 2200,
    "fid": 456,
    "cid": 257,
    "sid": 457
    }



	5.Delete Order
	Url- http://localhost:8080/orders/order/1
	Method- DELETE


#Food Service#

	1.GET All Foods
	Url- http://localhost:8080/foods/food/
	Method- GET

	2.Get Specific Food
	Url- http://localhost:8080/foods/food/1
	Method- GET	

	3.Create New Food
	Url- http://localhost:8080/foods/food/
	Method- POST
	Body- {
    "fid": 5,
    "fname": "Egg Bun",
    "fdiscription": "discription",
    "fprize": 50,
    "fdiscount": 2,
    "sid": 525
    }


	4.Update Food
	Url- http://localhost:8080/foods/food/
	Method- PUT
	Body- {
    "fid": 5,
    "fname": "Egg Bun",
    "fdiscription": "discription",
    "fprize": 70,
    "fdiscount": 3,
    "sid": 525
    }



	5.Delete Food
	Url- http://localhost:8080/foods/food/1
	Method- DELETE



#Payment Service#

	1.GET All Payments
	Url- http://localhost:8080/payments/payment/
	Method- GET

	2.Get Specific Payment
	Url- http://localhost:8080/payments/payment/1
	Method- GET	

	3.Create New Payment
	Url- http://localhost:8080/payments/payment/
	Method- POST
	Body- {
    "pid": 5,
    "pdate": "2019-05-13",
    "pamount": 250,
    "pstatus": "Paid",
    "oid": 124,
    "cardid": 275
    }


	4.Update Payment
	Url- http://localhost:8080/payments/payment/
	Method- PUT
	Body- {
    "pid": 5,
    "pdate": "2019-05-13",
    "pamount": 350,
    "pstatus": "Unaid",
    "oid": 124,
    "cardid": 275
    }



	5.Delete Payment
	Url- http://localhost:8080/payments/payment/1
	Method- DELETE


#Delivery Service#

	1.GET All Deliveries
	Url- http://localhost:8080/deliveries/delivery/
	Method- GET

	2.Get Specific Delivery
	Url- http://localhost:8080/deliveries/delivery/1
	Method- GET	

	3.Create New Delivery
	Url- hhttp://localhost:8080/deliveries/delivery/
	Method- POST
	Body- {
    "id": 6,
    "cusName": "Kamal",
    "address": "Kaduwela",
    "telNo": 766468789,
    "email": "kamal@gmail.com",
    "itemName": "Rice",
    "noOfItem": "2",
    "amount": "500"
    }


	4.Update Delivery
	Url- http://localhost:8080/deliveries/delivery/
	Method- PUT
	Body- {
    "id": 6,
    "cusName": "Kamal",
    "address": "Kaduwela",
    "telNo": 766468789,
    "email": "kamal@gmail.com",
    "itemName": "Rice",
    "noOfItem": "2",
    "amount": "500"
    }



	5.Delete Delivery
	Url- http://localhost:8080/deliveries/delivery/1
	Method- DELETE


