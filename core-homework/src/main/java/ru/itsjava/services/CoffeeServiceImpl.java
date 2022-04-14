package ru.itsjava.services;

import ru.itsjava.domain.Coffee;

public class CoffeeServiceImpl implements CoffeeService {

    @Override
    public Coffee getCoffeeByPrice(double price) {
        if ((price > 5) && (price < 7)) {
             return new Coffee("Espresso");
        }else if ((price>=7)&&(price<10)){
            return new Coffee("Americano");
        }else if ((price>=10)&&(price<12)){
            return new Coffee("Cappuccino");
        }
        return new Coffee("Не верная оплата за кофе");
    }
}
