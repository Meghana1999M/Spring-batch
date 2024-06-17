Spring Batch:

Spring Batch is one of the core module of spring framework 
and using this spring batch you can create robust batch 
processing system.

Batch processing is a technique which processed data in a large
group instead of a single element of data. where you can
process a high volume of data with minimal human interaction.


When to use:
when you want to transfer huge number of data from source to destination
example:
billing analysis system covert csv file and insert into db
report generation system. db is the source and get csv as a report

Job Launcher -> It's an interface it's a entry point
Job -> work to be executed using spring batch
 Job repository -> helps to maintain the state of the job(fail/success)
 Step -> combination of 
	ItemReader( will read the data from source ex: csv)
	ItemProcessor (process the data)
	ItemWriter( will write the data into the destination ex: db)
	
	Job can have a multiple steps

Requirement : Read Customers Data from CSV file and write into database table

1) create spring starter project with below dependencies
Lombok
Spring web
Spring batch
MySQL driver
Spring data JPA
2) configure datasource properties in application.properties file
3) Keep source file under src/main/resource folder(customers.csv)
4) create batch configration class
