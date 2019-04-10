package com.taxcalculator.karan_stha;

public class Calculate {

    int Salary;


    public int Two_lakh()
    {
        return (Salary*(1/100))+Salary;
    }

    public int Three_half_lakh()
    {
        int remain = Salary - 200000;
        int remain_tax = (remain*(15/100));
        int main = (200000*(1/100));
        int total = main + remain + Salary;
        return total;
    }

    public int Above_three()
    {
        int remain = Salary - 200000;
        int remain_after = remain - 150000;
        int main = (200000*(1/100));
        int second_main = (150000*(15/100));
        int remain_tax = (remain_after*(25/100));
        int total = main + second_main + remain_tax + Salary;
        return total;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
