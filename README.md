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
    
### 3. Message

- **Method:** POST
- **Path:** `/message`
- **Description:** Allows users to send a message along with their name, email, and timestamp.
- **Request Body:** `MessageDTO`
    - `name` (String, required): The name of the user sending the message.
    - `email` (String, required): The email address of the user sending the message.
    - `message` (String, required): The message content.
    - `timestamp` (String, required): The timestamp of the message in ISO-8601 format.
- **Response:** 
    - `200 OK` if the message is successfully saved.
    - Response body: A JSON object containing the saved message details.
        ```json
        {
            "message_name": "John Doe",
            "message_email": "johndoe@example.com",
            "message": "This is a test message.",
            "message_timestamp": "2024-02-13T12:00:00Z"
        }
        ```
- **Sample Request:**
    ```http
    POST /message
    Content-Type: application/json

    {
        "name": "John Doe",
        "email": "johndoe@example.com",
        "message": "This is a test message.",
        "timestamp": "2024-02-13T12:00:00Z"
    }
    ```

### 3. Test

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
