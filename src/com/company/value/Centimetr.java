package com.company.value;

import com.company.AbstractLongValue;

public class Centimetr extends AbstractLongValue {
    @Override
    public void printConverter() {
        System.out.println(getNumber());
    }
}
