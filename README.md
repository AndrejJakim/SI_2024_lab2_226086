# Андреј Јакимовски, 226086
![CFG lab2](https://github.com/AndrejJakim/SI_2024_lab2_226086/assets/139021668/0c117954-129a-440f-a8b4-316a88bd627c)
### Цикломатска комплексност 
Цикломатската комплексност на овој код е 10, резултатот е добиен според бројот на региони на самиот граф.
### Тест случаи според критериумот Every Branch критериумот  
1. allItems = null ; payment = 1000
2. Name: Kaskaval, Barcode: 0895, Price: 500, Discount: 13 ; payment = 10000
3. Name: Cokolado, Barcode: 7543, Price: 67, Discount: 30 ; payment = 1000
4. Name: null, Barcode: null, Price: 50, Discount: 15 ; payment = 1000
5. Name: Leb, Barcode: a367, Price: 30, Discount: 5 ; payment = 1000
6. Name: Jogurt, Barcode: 1965, Price: 90, Discount: 0 ; payment = 1000
### Тест случаи според критериумот Multiple Condition за условот if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0')
1. Name: Kaskaval, Barcode: 0895, Price: 500, Discount: 13 ; payment = 10000
Овој е единствен тест случај од погорните случаеви кој кога би влегол во условот би го извршил соодветно. Самиот услов вели доколку цената е поголема од 300 (цената на нашиот тест случај е 500), попустот да е поголем од нула (попустот на нашиот тест случај е 13) и првиот карактер на бар кодот да е 0 (нашиот баркод е 0895).
