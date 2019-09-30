package controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.io.Serializable;
import java.util.Date;

public class FormatTester implements Serializable {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    @NumberFormat(style = NumberFormat.Style.NUMBER, pattern = "#,###")
    private int total;
    @NumberFormat(style = NumberFormat.Style.PERCENT)
    private double discount;
    @NumberFormat(style = NumberFormat.Style.CURRENCY)
    private double money;

    public Date getBirthday() {
        return birthday;
    }

    public double getDiscount() {
        return discount;
    }

    public double getMoney() {
        return money;
    }

    public int getTotal() {
        return total;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
