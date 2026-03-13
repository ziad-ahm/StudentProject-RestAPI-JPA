# Student REST API - Spring Boot

A simple REST API built using **Spring Boot** and **Spring Data JPA** to manage students in a database.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Lombok

## Project Structure
├── controller
│ └── StudentController
├── entity
│ └── Student
├── repository
│ └── StudentRepository
├── service
│ └── StudentService

## API Endpoints

| Method | Endpoint | Description |
|------|------|------|
| GET | /students | Get all students |
| GET | /students/{id} | Get student by id |
| POST | /students | Create new student |
| PUT | /students | Update student |
| DELETE | /students/{id} | Delete student |

## Example JSON Request

```json
{
  "studentId": 123456,
  "firstName": "ZeZo",
  "lastName": "Ahmad",
  "age": 22,
  "major": "Computer Science"
}