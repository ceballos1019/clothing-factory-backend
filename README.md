# ClothingFactory API

## Requirements

JDK 1.7+
Eclipse IDE

## API Rest

To request order:

Path: http://<host>/clothingFactory/v1/rest/services/order
Json Example:
{
  "name": "MyName",
  "docType": "Cedula de ciudadania",
  "docNumber": "000000",
  "date": "12-09-18",
  "address": "Street X",
  "quantity": 4,  
  "detail": [
    {

      "type": "Camisas formales",
      "price": 2500,
      "quantity": 1
    },
    {
      "type": "Pantalones formales",
      "price": 3000,
      "quantity": 1
    },
    {
      "type": "Chaquetas",
      "price": 3001,
      "quantity": 1
    }
  ],
  "totalValue": 213000.2
}
