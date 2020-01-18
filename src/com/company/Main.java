package com.company;

import com.company.Converter.Converter;
import com.company.Converter.MillesConverter;
import com.company.value.Milles;

public class Main {

    public static void main(String[] args) {
        Converter millconverter = new MillesConverter();
        Milles milles = new Milles();
        milles.setNumber(45);
        millconverter.convert(milles);

    }
}
