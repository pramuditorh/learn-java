package pramudito.rh.application;

import pramudito.rh.data.Application;
import pramudito.rh.data.Constant;
import pramudito.rh.data.Country;
import pramudito.rh.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);

        System.out.println(
                MathUtil.sum(1,2,3,4,5,6,7,8,9)
        );

        Country.City city = new Country.City();
        city.setName("Jakarta");

        System.out.println(city.getName());

        System.out.println(Application.PROCESSOR);
    }
}
