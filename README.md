# API Documentation

## Endpoints

### 1. Join

- **Method:** POST
- **Path:** `/join`
- **Description:** Allows users to join by providing their email address.
- **Request Body:** `JoinDTO`
    - `email` (String, required): The email address of the user.
- **Response:** 
    - `200 OK` if the join is successful.
    - Response body: `"Stored join email: <email>"`, where `<email>` is the email provided in the request.
- **Sample Request:**
    ```http
    POST /join
    Content-Type: application/json

    {
        "email": "example@example.com"
    }
    ```

### 2. Test

- **Method:** GET
- **Path:** `/test`
- **Description:** A test endpoint to check if the server is running properly.
- **Response:** 
    - `200 OK` if the server is running properly.
    - Response body: `"Test"`
- **Sample Request:**
    ```http
    GET /test
    ```
