package com.company.Converter;

import com.company.AbstractLongValue;
import com.company.value.Centimetr;
import com.company.value.Inch;
import com.company.value.Meters;
import com.company.value.Milles;

public class MillesConverter implements Converter {
    @Override
    public AbstractLongValue convert(AbstractLongValue unit) {
        double dlina;
        if (unit instanceof Centimetr) {
            dlina = unit.getNumber() * 160934;
        } else if (unit instanceof Meters) {
            dlina = unit.getNumber() * 1609;
        } else if (unit instanceof Inch) {
            dlina = unit.getNumber() * 63630;
        } else {
            dlina = unit.getNumber();
        }
        Milles milles = new Milles();
        milles.setNumber(dlina);
        return milles;
    }
}
