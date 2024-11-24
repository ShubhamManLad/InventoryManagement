## Code Output
### Adding items to inventory

Item{id='1', name='Laptop', category='Electronics', quantity=10}

Item{id='2', name='Phone', category='Electronics', quantity=20}

Item{id='3', name='Tablet', category='Electronics', quantity=15}

Item{id='4', name='Table', category='Furniture', quantity=15}

Item{id='5', name='Chair', category='Furniture', quantity=30}

Item{id='6', name='Sofa', category='Furniture', quantity=20}

Item{id='7', name='Milk', category='Grocery', quantity=50}

Item{id='8', name='Apples', category='Grocery', quantity=50}

Item{id='9', name='Cookies', category='Grocery', quantity=80}

9 Items added to the inventory



### Retrieving Items with Item ID 2,4 and 7
Item{id='2', name='Phone', category='Electronics', quantity=20}

Item{id='4', name='Table', category='Furniture', quantity=15}

Item{id='7', name='Milk', category='Grocery', quantity=50}




### Updating quantity of Items 2,4 and 7

ALERT: Item Phone (ID: 2) is below threshold. Current quantity: 8

Quantity Updated for Item Phone (ID: 2)

Item{id='2', name='Phone', category='Electronics', quantity=8}


Invalid Quantity!

Quantity Updated for Item Table (ID: 4)

Item{id='4', name='Table', category='Furniture', quantity=15}


Quantity Updated for Item Milk (ID: 7)

Item{id='7', name='Milk', category='Grocery', quantity=100}



### Removing Items 6, 13

Removing Item 6


Removing Item 13 (which does not exist)

Item not found



### Retrieving Electronics Items in Descending order of quantity

Item{id='3', name='Tablet', category='Electronics', quantity=15}

Item{id='1', name='Laptop', category='Electronics', quantity=10}

Item{id='2', name='Phone', category='Electronics', quantity=8}



### Retrieving top 4 Items

Item{id='7', name='Milk', category='Grocery', quantity=100}

Item{id='9', name='Cookies', category='Grocery', quantity=80}

Item{id='8', name='Apples', category='Grocery', quantity=50}

Item{id='5', name='Chair', category='Furniture', quantity=30}



### Adding items to secondaryInventory

Item{id='11', name='Speakers', category='Electronics', quantity=20}

Item{id='12', name='Earphones', category='Electronics', quantity=15}

Item{id='13', name='Sugar', category='Grocery', quantity=20}

Item{id='4', name='Table', category='Furniture', quantity=50}

Item{id='5', name='Chair', category='Furniture', quantity=5}

Item{id='10', name='SmartWatch', category='Electronics', quantity=7}

6 Items added to the inventory



### Merging Inventories

Item{id='11', name='Speakers', category='Electronics', quantity=20}

Item{id='1', name='Laptop', category='Electronics', quantity=10}

Item{id='12', name='Earphones', category='Electronics', quantity=15}

Item{id='2', name='Phone', category='Electronics', quantity=8}

Item{id='13', name='Sugar', category='Grocery', quantity=20}

Item{id='3', name='Tablet', category='Electronics', quantity=15}

Item{id='4', name='Table', category='Furniture', quantity=50}

Item{id='5', name='Chair', category='Furniture', quantity=30}

Item{id='7', name='Milk', category='Grocery', quantity=100}

Item{id='8', name='Apples', category='Grocery', quantity=50}

Item{id='9', name='Cookies', category='Grocery', quantity=80}

Item{id='10', name='SmartWatch', category='Electronics', quantity=7}

