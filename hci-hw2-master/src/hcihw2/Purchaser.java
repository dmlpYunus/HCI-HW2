/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hcihw2;

/**
 *
 * @author batuhan
 */
public class Purchaser {

    String name, Postc, phone, province, city, address, date, creditcn;

    public Purchaser(String name, String Postc, String phone, String province, String city, String address, String date, String creditcn) {
        this.name = name;
        this.Postc = Postc;
        this.phone = phone;
        this.province = province;
        this.city = city;
        this.address = address;
        this.date = date;
        this.creditcn = creditcn;
    }

    @Override
    public String toString() {
        return name + " " + Postc + " " + phone + " " + province + " " + city + " " + address + " " + date + " " + creditcn;
    }

}
