Project Title:  CurrencyV1 / CurrencyV1.java
Purpose of Project: to display the conversion rates of currency and amounts spent in USD
Date: 08/16/24
Author: William Van Uitert


Post-Mortem Review:

ExchangeRate.com: https://www.exchangerate.com/currency-converter/USD/INR

What went Right:
    I understood what the assignment was and what calculations I needed to do from the assignment specification page.

What went Wrong:
    I forgot how to use modulo for a minute and instead was tried using addition and division to express multiplication and subtraction for the fundsRemaining variables:
        fundRemaining = budget + ((costItem / (1 / totalItems)) / -1) = budget - (costItem * totalItems)
    I then realized I was intended to use modulo for this expression an corrected my mistake.

In the Future:
    In the future, I would like to do something a little more organized than using a whole bunch of variables because what the variables express is very similar.
    This could be something like a custom data object created by a seperate class, or using hashmaps within a hashmap. I feel that using one of these would make
    my code a little more organized.