## API

This application comes with an out-of-the-box API provided by **Spring Data REST**.

### sample request body

```json
{
    "name": "Elon"
}
```

## Explore Rest APIs

**Spring Data REST** defines following CRUD APIs.
 
### URLs

|                   URL                      | Method |          Remarks            |
|--------------------------------------------|--------|-----------------------------|
|`http://localhost:8080/api/v1/persons`      | POST   | Create Person               |
|`http://localhost:8080/api/v1/persons/`     | GET    | Get all persons             |
|`http://localhost:8080/api/v1/persons/{id}` | GET    | Get a person by id          |
|`http://localhost:8080/api/v1/persons/{id}` | DELETE | Delete person by id         |
|`http://localhost:8080/api/v1/persons/{id}` | PUT    | Update person by id         |
|`http://localhost:8080/api/v1/persons/{id}` | PATCH  | Partial update person by id |
