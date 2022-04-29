package pramudito.rh.application;

import pramudito.rh.data.ReflectionData;
import pramudito.rh.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        ReflectionData rd = new ReflectionData();
        rd.setUsername("robby");
        rd.setPassword("pass");
        rd.setName(null);

        ValidationUtil.validationReflection(rd);
    }
}
