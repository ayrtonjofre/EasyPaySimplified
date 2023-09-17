<!-- Project Overview: PicPay Simplified -->
# Project Overview: PicPay Simplified

## Objective
The objective of this project is to create a simplified version of PicPay, focusing on the money transfer flow between two types of users: common users and merchants. Both user types have a wallet with funds and can perform transfers between each other. This README outlines the key requirements and functionalities of the system.

## Requirements
To achieve the objective, the following requirements have been identified:

### User Data
- All users, whether common users or merchants, need to provide the following information during registration:
  - Full Name
  - CPF (Individual Taxpayer Registry in Brazil) or CNPJ (National Register of Legal Entities in Brazil)
  - Email
  - Password

- CPF/CNPJ and email addresses must be unique in the system. This means that the system should only allow one registration with the same CPF or email address.

### Money Transfer
- Both common users and merchants can perform money transfers. Common users can send money to other users or merchants, while merchants can only receive transfers and cannot initiate them.

- Before processing a transfer, the system must validate whether the user initiating the transfer has a sufficient balance in their wallet.

### Validation
- Prior to completing a transfer, the system should consult an external authorization service. You can simulate this behavior using the following mock service: [Authorization Mock](https://run.mocky.io/v3/8fafdd68-a090-496f-8c9a-3442cf30dae6).

### Transaction Handling
- Money transfers should be treated as transactions, which means they should be reversible in case of any inconsistency or error. If an issue arises, the money must be returned to the sender's wallet.

### Notification
- Upon receiving a payment, both users and merchants need to receive notifications. These notifications can be sent via email or SMS and should be handled by a third-party service. It's important to consider that this third-party service may experience occasional unavailability or instability. You can simulate the notification service using this mock: [Notification Mock](http://o4d9z.mocklab.io/notify).

### RESTFul Service
- The entire system should be designed as a RESTFul service.

---

Author: Ayrton Jofre.
