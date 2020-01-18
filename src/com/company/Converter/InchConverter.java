package com.company.Converter;

import com.company.AbstractLongValue;
import com.company.value.Centimetr;
import com.company.value.Inch;
import com.company.value.Meters;
import com.company.value.Milles;

public class InchConverter implements Converter {
    @Override
    public AbstractLongValue convert(AbstractLongValue unit) {
        double dlina;
        if (unit instanceof Centimetr) {
            dlina = unit.getNumber() * 2.54;
        } else if (unit instanceof Meters) {
            dlina = unit.getNumber() / 39.37;
        } else if (unit instanceof Milles) {
            dlina = unit.getNumber() / 63360;
        } else {
            dlina = unit.getNumber();
        }
        Inch inch = new Inch();
        inch.setNumber(dlina);
        return inch;
    }
}
