<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Product</title>
    </head>
    <body>
        <h2>Add a New Product</h2>
        <form action="ProductServlet" method="post">
            <label for="name">Product Name:</label>
            <input type="text" id="name" name="name" required><br><br>

            <label for="price">Price:</label>
            <input type="text" id="price" name="price" required><br><br>

            <label for="qty">Quantity:</label>
            <input type="number" id="qty" name="qty" required><br><br>

            <input type="submit" value="Add Product">
        </form>
    </body>
</html>
