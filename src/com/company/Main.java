package com.company;

import java.io.Console;

public class Main {

    private static String sFormat = "C[CODE_CAR]_[GOS_NUMBER]-[CAR_MILEAGE]-[OPTIONAL_PARAMETER]";


    private static int[] getCoordinatesByCode(String vFormat, String vSearchCode) {
        int[] vStartEndPosition = new int[2];
        int vStart = vFormat.indexOf(vSearchCode) + 1;
        int vEnd = vSearchCode.length();

        vStartEndPosition[0] = vStart;
        vStartEndPosition[1] = vEnd;

        return vStartEndPosition;
    }


    /***
     * Расшифровка кодов транспортных средств:
     * 100 - легковой авто
     * 200 - грузовой авто - объем перевезенного груза см. куб.
     * 300 - пассажирский транспорт - число перевезенных пассажиров
     * 400 - тяжелая техника(краны) - вес поднятых грузов тонн
     * @param vCode код транспортного средства
     * @return Расшифровка кодов транспортного средства
     */
    private static String getNameCarByCode(String vCode) {
        if (vCode == "100") {
            return "легковой авто";
        } else if (vCode == "200") {
            return "грузовой авто - объем перевезенного груза см. куб.";
        } else if (vCode == "200") {
            return "грузовой авто - объем перевезенного груза см. куб.";
        } else if (vCode == "300") {
            return "пассажирский транспорт - число перевезенных пассажиров";
        } else if (vCode == "400") {
            return "тяжелая техника(краны) - вес поднятых грузов тонн";
        } else {
            return null;
        }
    }


    /**
     * Для каждого типа транспортного средства, своя стоимость литра топлива:
     * 100 - 46.10
     * 300 - 47.50
     * 200, 400 - 48.90
     *
     * @param vCode
     * @return
     */
    private static Double getPriceFuelByCode(String vCode) {
        if (vCode == "100") {
            return 46.10;
        } else if (vCode == "300") {
            return 47.50;
        } else if (vCode == "200" || vCode == "400") {
            return 48.90;
        } else {
            return null;
        }
    }


    /**
     * Для каждого типа транспортного средства свой расход топлива на 100 км:
     * 100 - 12.5
     * 200 - 12
     * 300 - 11.5
     * 400 - 20
     *
     * @param vCode
     * @param args
     */
    private static Double getCostFuelBYkm(String vCode) {
        if (vCode == "100") {
            return 12.5;
        } else if (vCode == "200") {
            return 12.0;
        } else if (vCode == "300") {
            return 11.5;
        } else if (vCode == "400") {
            return 20.0;
        } else {
            return null;
        }
    }


    public static void main(String[] args) {
        System.out.println(getCostFuelBYkm("200"));
    }
}
