# SpringBoot-MongoDB-CRUD

## create STUDENT : [ student ]

### POST :  localhost:9005/api/student/create

- REQUEST body:

	{
	
	  "name":"Dowlath",
	  
	  "email":"dowlath@gmail.com",
	  
	  "department":{
	  
			"departmentName":"Computer Science",
			
			"location":"INDIA"
			
		   },
		   
	   "subjects": [
	   
					{
					
					   "subjectName":"Java",
					   
					   "marksObtained":90
					   
					},
					
					{
					
					   "subjectName":"Microservice",
					   
					   "marksObtained":80
					}
					
				]
				
	}

- RESPONSE :

	{
	
		"id": "5e7a695e0e70231e53379a39",
		
		"name": "Dowlath",
		
		"email": "dowlath@rediffmail.com",
		
		"department": {
		
			"departmentName": "Computer Science",
			
			"location": "INDIA"
			
		},
		
		"percentage": 0.0,
		
		"subject": null
		
	}


## GETBYID :

### GET : localhost:9005/api/student/getById/5e7a695e0e70231e53379a39

- RESPONSE BODY :

	{
	
		"id": "5e7a695e0e70231e53379a39",
		
		"name": "Dowlath",
		
		"email": "dowlath@rediffmail.com",
		
		"department": {
		
			"departmentName": "Computer Science",
			
			"location": "INDIA"
			
		},
		
		"percentage": 0.0,
		
		"subject": null
		
	}


## get aLL :

### GET : localhost:9005/api/student/all

- REQ :  localhost:9005/api/student/all

- RESPONSE :

	[
	
		{
		
			"id": "5e7a0854c309a40c20e29da1",
			
			"name": "Dowlath Basha G",
			
			"email": null,
			
			"department": null,
			
			"percentage": 0.0,
			
			"subject": null
			
		},
		
		{
		
			"id": "5e7a0aa2c309a40c20e29da6",
			
			"name": "Dowlath Basha G",
			
			"email": "dowlathbasha@gmail.com",
			
			"department": null,
			
			"percentage": 95.0,
			
			"subject": [
			
				{
				
					"subjectName": "Java",
					
					"marksObtained": 90
					
				},
				
				{
				
					"subjectName": "MicroServices",
					
					"marksObtained": 100
					
				}
				
			]
			
		},
		
		{
		
			"id": "5e7a695e0e70231e53379a39",
			
			"name": "Dowlath",
			
			"email": "dowlath@rediffmail.com",
			
			"department": {
			
				"departmentName": "Computer Science",
				
				"location": "INDIA"
				
			},
			
			"percentage": 0.0,
			
			"subject": null
			
		}
		
	]



### Update document

## PUT  method 

- REQ :  localhost:9005/api/student/update 

	{
	
	  "id":"5e7a695e0e70231e53379a39",
	  
	  "name":"Dowlath Basha G",
	  
	  "email":"dowlathbasha2020@gmail.com",
	  
	  "department":{
	  
			"departmentName":"Computer Science",
			
			"location":"INDIA"
			
		   },
		   
	   "subjects": [
	   
					{
					
					   "subjectName":"Java",
					   
					   "marksObtained":60
					   
					},
					
					{
					
					   "subjectName":"Microservice",
					   
					   "marksObtained":30
					   
					}
					
				]
				
	}
	

- RESPONSE:

	{

		"id": "5e7a695e0e70231e53379a39",
		
		"name": "Dowlath Basha G",
		
		"email": "dowlathbasha2020@gmail.com",
		
		"department": {
		
			"departmentName": "Computer Science",
			
			"location": "INDIA"
			
		},
		
		"percentage": 0.0,
		
		"subject": null
		
	}


## DELETE DOCUMENT :

- REQ : DELETE  localhost:9005/api/student/delete/5e7a0854c309a40c20e29da1

- RES:

	Student has been deleted.


## STUDENT'S BY NAME :

- REQ : GET   localhost:9005/api/student/studentsByName/Dowlath Basha G


- RES:

	[
	
		{
		
			"id": "5e7a0aa2c309a40c20e29da6",
			
			"name": "Dowlath Basha G",
			
			"email": "dowlathbasha@gmail.com",
			
			"department": null,
			
			"percentage": 95.0,
			
			"subject": [
			
				{
				
					"subjectName": "Java",
					
					"marksObtained": 90
					
				},
				
				{
				
					"subjectName": "MicroServices",
					
					"marksObtained": 100
					
				}
				
			]
			
		},
		
		{
		
			"id": "5e7a695e0e70231e53379a39",
			
			"name": "Dowlath Basha G",
			
			"email": "dowlathbasha2020@gmail.com",
			
			"department": {
			
				"departmentName": "Computer Science",
				
				"location": "INDIA"
				
			},
			
			"percentage": 0.0,
			
			"subject": null
			
		}
		
		
	]


## findby Name AND Email.

### Method : GET  http://localhost:9005/api/student/studentsByNameAndMail?
            
			      name=Dowlath Basha G&email=dowlathbasha2020@gmail.com


- RES :

	{
	
		"id": "5e7a695e0e70231e53379a39",
		
		"name": "Dowlath Basha G",
		
		"email": "dowlathbasha2020@gmail.com",
		
		"department": {
		
			"departmentName": "Computer Science",
			
			"location": "INDIA"
			
		},
		
		"percentage": 0.0,
		
		"subject": null
		
	}
	

## findby Name OR Email.	
	
### Method : GET  http://localhost:9005/api/student/studentsByNameOrMail?
 
                  name=Dowlath &email=dowlathbasha@gmail.com


- RES :

	{
	
		"id": "5e7a0aa2c309a40c20e29da6",
		
		"name": "Dowlath Basha G",
		
		"email": "dowlathbasha@gmail.com",
		
		"department": null,
		
		"percentage": 95.0,
		
		"subject": [
		
			{
			
				"subjectName": "Java",
				
				"marksObtained": 90
				
			},
			
			{
			
				"subjectName": "MicroServices",
				
				"marksObtained": 100
				
			}
			
		]
		
	}


## Pageable ie. Pagination.  Internally Pagination implemented by MongoDB.

- Note:

	Pageable pageable = PageRequest.of(pageno-1, pageSize)


	Page No.				Skip (Page No - 1) * PageSize				PageSize (LIMIT)

	1							1-1 = 0 									10

	2.							2-1	= 1  									10


- REQ :  GET   http://localhost:9005/api/student/allWithPagination?pageNo=1&pageSize=10


- RES :

	[
	
		{
		
			"id": "5e7a0aa2c309a40c20e29da6",
			
			"name": "Dowlath Basha G",
			
			"email": "dowlathbasha@gmail.com",
			
			"department": null,
			
			"percentage": 95.0,
			
			"subject": [
			
				{
				
					"subjectName": "Java",
					
					"marksObtained": 90
					
				},
				
				{
				
					"subjectName": "MicroServices",
					
					"marksObtained": 100
					
				}
				
			]
			
		},
		
		{
		
			"id": "5e7a695e0e70231e53379a39",
			
			"name": "Dowlath Basha G",
			
			"email": "dowlathbasha2020@gmail.com",
			
			"department": {
			
				"departmentName": "Computer Science",
				
				"location": "INDIA"
				
			},
			
			"percentage": 0.0,
			
			"subject": null
			
		}
		
	]


## Sort by Name :

	MongoDB provides Sort class , we use this class and will get the sorting list.

	Sort sort = Sort.by(Sort.Direction.ASC, "name", "email");

	Using this enum we are getting ascending order :  Sort.Direction.ASC


- REQ : GET      http://localhost:9005/api/student/allWithSorting


- RES :

	[
	
		{
		
			"id": "5e7a695e0e70231e53379a39",
			
			"name": "Dowlath Basha G",
			
			"email": "dowlathbasha2020@gmail.com",
			
			"department": {
			
				"departmentName": "Computer Science",
				
				"location": "INDIA"
				
			},
			
			"percentage": 0.0,
			
			"subject": null
			
		},
		
		{
		
			"id": "5e7a0aa2c309a40c20e29da6",
			
			"name": "Dowlath Basha G",
			
			"email": "dowlathbasha@gmail.com",
			
			"department": null,
			
			"percentage": 95.0,
			
			"subject": [
			
				{
				
					"subjectName": "Java",
					
					"marksObtained": 90
					
				},
				
				{
				
					"subjectName": "MicroServices",
					
					"marksObtained": 100
					
				}
				
			]
			
		}
		
	]

## Starts with test in Studio 3T. [ Native query ]

	{ "name"  : /^Dowlath/}


## Like Query [ Native query ]

	{ "mail"  : /gmail/}



## @Transient --> Spring data will ignore while doing update db.It wont save.


## PCF - Its open source PaaS

   Getting MongoDB on cloud (mLab)
