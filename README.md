<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Project Overview: PicPay Simplified</title>
</head>
<body>
    <h1>Objective</h1>
    <p>The objective of this project is to create a simplified version of PicPay, focusing on the money transfer flow between two types of users: common users and merchants (lojistas). Both user types have a wallet with funds and can perform transfers between each other. This README outlines the key requirements and functionalities of the system.</p>

    <h1>Requirements</h1>
    <p>To achieve the objective, the following requirements have been identified:</p>

    <h2>User Data</h2>
    <p>All users, whether common users or merchants, need to provide the following information during registration:</p>
    <ul>
        <li>Full Name</li>
        <li>CPF (Individual Taxpayer Registry in Brazil) or CNPJ (National Register of Legal Entities in Brazil)</li>
        <li>Email</li>
        <li>Password</li>
    </ul>
    <p>CPF/CNPJ and email addresses must be unique in the system. This means that the system should only allow one registration with the same CPF or email address.</p>

    <h2>Money Transfer</h2>
    <p>Both common users and merchants can perform money transfers. Common users can send money to other users or merchants, while merchants can only receive transfers and cannot initiate them.</p>
    <p>Before processing a transfer, the system must validate whether the user initiating the transfer has a sufficient balance in their wallet.</p>

    <h2>Validation</h2>
    <p>Prior to completing a transfer, the system should consult an external authorization service. You can simulate this behavior using the following mock service: <a href="https://run.mocky.io/v3/8fafdd68-a090-496f-8c9a-3442cf30dae6">Authorization Mock</a>.</p>

    <h2>Transaction Handling</h2>
    <p>Money transfers should be treated as transactions, which means they should be reversible in case of any inconsistency or error. If an issue arises, the money must be returned to the sender's wallet.</p>

    <h2>Notification</h2>
    <p>Upon receiving a payment, both users and merchants need to receive notifications. These notifications can be sent via email or SMS and should be handled by a third-party service. It's important to consider that this third-party service may experience occasional unavailability or instability. You can simulate the notification service using this mock: <a href="http://o4d9z.mocklab.io/notify">Notification Mock</a>.</p>

    <h2>RESTFul Service</h2>
    <p>The entire system should be designed as a RESTFul service.</p>
</body>
</html>
