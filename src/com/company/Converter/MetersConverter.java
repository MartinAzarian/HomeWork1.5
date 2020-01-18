package com.company.Converter;

import com.company.AbstractLongValue;
import com.company.value.Centimetr;
import com.company.value.Inch;
import com.company.value.Meters;
import com.company.value.Milles;

public class MetersConverter implements Converter {
    @Override
    public AbstractLongValue convert(AbstractLongValue unit) {
        double dlina;
        if (unit instanceof Centimetr) {
            dlina = unit.getNumber() * 100;
        } else if (unit instanceof Inch) {
            dlina = unit.getNumber() * 39.7;
        } else if (unit instanceof Milles) {
            dlina = unit.getNumber() / 1609;
        } else {
            dlina = unit.getNumber();
        }
        Meters meters = new Meters();
        meters.setNumber(dlina);
        return meters;
    }
}
