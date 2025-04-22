# TASK Build Application

### Description
Dengan waktu yang saya miliki, saya hanya dapat memberikan template application Spring Boot dengan pseudocode
mengenai bagaimana saya akan membuat Application ini.

```
Check in logic: 
- check if plate number in ticket table
	- if in database:
		- if check out > check in, check in
		- else return plate number already in check in
	- else check in

check out logic:
- check if plate number in ticket table
	- if in database:
		- if check out > check in, return error
		- else check out
	else return error
```

### Database
```
CREATE TABLE tickets (
	plate_number VARCHAR(10) PRIMARY KEY
	check_in_time DATETIME
	check_out_time DATETIME
	price BIGINT
)
```
