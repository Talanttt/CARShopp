package org.example;

import org.example.config.CarshopConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static int id = 3;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(CarshopConfig.class);

        CAR Camry = (CAR) context.getBean("Camry");
        System.out.println(Camry);

        CAR teslaCar = (CAR) context.getBean("tesla");
        System.out.println(teslaCar);

        CAR Hyundai = (CAR) context.getBean("Hyundai");
        System.out.println(Hyundai);

        Staff ctxStaff = (Staff) context.getBean("erezhep");
        System.out.println(ctxStaff);

        Staff ctxStaff2 = (Staff) context.getBean("talant");
        System.out.println(ctxStaff2);

        Staff ctxStaff3 = (Staff) context.getBean("nurss");
        System.out.println(ctxStaff3);

        parts ctxparts = (parts) context.getBean("dongelek");
        System.out.println(ctxparts);

        ctxStaff.setCar(teslaCar);
        ctxStaff2.setCar(Hyundai);
        ctxStaff3.setCar(Camry);


    }
}