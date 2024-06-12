Feature: login to dominos

Scenario: use valid credentials

Given launch the url and maximizing
When click order online button
Then locate the delivery address
And enter the pincode
Then click vegpizza and add required quantity
Then click beverages and add required quantity
Then removing products
Then click checkout