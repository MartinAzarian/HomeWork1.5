package com.company.value;

import com.company.AbstractLongValue;

public class Meters extends AbstractLongValue {
    @Override
    public void printConverter() {
        System.out.println(getNumber());
    }
}
