package com.taxcalculator.karan_stha;

public class Calculate {

    private double Salary;


    public double Two_lakh()
    {
        return (Salary*0.01)+Salary;
    }

    public double Three_half_lakh()
    {
        double remain = Salary - 200000;
        double remain_tax = remain*0.15;
        double main = 200000*0.01;
        double total = main + remain_tax + Salary;
        return total;
    }

    public double Above_three()
    {
        double remain = Salary - 200000;
        double remain_after = remain - 150000;
        double main = 200000*0.01;
        double second_main = 150000*0.15;
        double remain_tax = remain_after*0.25;
        double total = main + second_main + remain_tax + Salary;
        return total;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
