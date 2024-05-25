# Андреј Јакимовски, 226086
![CFG lab2](https://github.com/AndrejJakim/SI_2024_lab2_226086/assets/139021668/0c117954-129a-440f-a8b4-316a88bd627c)
### Цикломатска комплексност 
Цикломатската комплексност на овој код е 10, резултатот е добиен според бројот на региони на самиот граф.
### Тест случаи според критериумот Every Branch критериумот  
1. allItems = null ; payment = 1000
2. Name: Kaskaval, Barcode: 0895, Price: 500, Discount: 13 ;
3. Name: Chips, Barcode: 7543, Price: 67, Discount: 30 ; 
4. Name: null, Barcode: null, Price: 50, Discount: 15 ; 
5. Name: Leb, Barcode: z367, Price: 30, Discount: 5 ; 
6. Name: Jogurt, Barcode: 1965, Price: 90, Discount: 0 ; 
7. Name: Meso, Barcode: null, Price: 345, Discount: 3 ; 
8. Name: Pavlaka, Barcode: 3333, Price: 150, Discount: 0 ;
### Тест случаи според критериумот Multiple Condition за условот if(item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0')
1. Name: Kaskaval, Barcode: 0895, Price: 500, Discount: 13 ;
2. Name: 
