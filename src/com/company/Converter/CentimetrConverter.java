package com.company.Converter;

import com.company.AbstractLongValue;
import com.company.value.Centimetr;
import com.company.value.Inch;
import com.company.value.Meters;
import com.company.value.Milles;

public class CentimetrConverter implements Converter {
    @Override
    public AbstractLongValue convert(AbstractLongValue unit) {
        double dlina;
        if (unit instanceof Inch) {
            dlina = unit.getNumber() * 0.0021;
        } else if (unit instanceof Meters) {
            dlina = unit.getNumber() * 1.11;
        } else if (unit instanceof Milles) {
            dlina = unit.getNumber() * 1.3;
        } else {
            dlina = unit.getNumber();
        }
        Centimetr centimetr = new Centimetr();
        centimetr.setNumber(dlina);
        return centimetr;
    }
}
