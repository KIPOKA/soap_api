<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Product</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f4f4f4;
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
                margin: 0;
            }

            .container {
                background: #fff;
                padding: 20px;
                border-radius: 8px;
                box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
                width: 350px;
                text-align: center;
            }

            h2 {
                color: #333;
            }

            label {
                font-weight: bold;
                display: block;
                text-align: left;
                margin-top: 10px;
            }

            input[type="text"], input[type="number"] {
                width: 100%;
                padding: 8px;
                margin-top: 5px;
                border: 1px solid #ccc;
                border-radius: 5px;
            }

            input[type="submit"] {
                margin-top: 15px;
                background-color: #28a745;
                color: white;
                border: none;
                padding: 10px;
                width: 100%;
                border-radius: 5px;
                font-size: 16px;
                cursor: pointer;
            }

            input[type="submit"]:hover {
                background-color: #218838;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <h2>Add a New Product</h2>
            <form action="ProductServlet" method="post">
                <label for="name">Product Name:</label>
                <input type="text" id="name" name="name" required>

                <label for="price">Price:</label>
                <input type="text" id="price" name="price" required>

                <label for="qty">Quantity:</label>
                <input type="number" id="qty" name="qty" required>

                <input type="submit" value="Add Product">
            </form>
        </div>
    </body>
</html>
