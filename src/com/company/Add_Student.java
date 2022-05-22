package com.company;

public class Add_Student {

    private String name;
    private String roll_number;
    private long reg_number;
    private long phone_number;
    private String Father_name;
    private String mother_name;
    private int mess_fee;
    private int attCount;

    public int getFee() {
        return  mess_fee;

    }

    public void setFee(int fee) {

        this.mess_fee = fee;

    }
    public void setAtt(){
        this.attCount +=1;
    }
    public int getAttCount(){
        return  attCount;
    }
    public String getName() {

        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getRoll_number()
    {

        return roll_number;
    }

    public void setRoll_number(String roll_number) {

        this.roll_number = roll_number;
    }

    public long getReg_number() {

        return reg_number;
    }

    public void setReg_number(long reg_number) {

        this.reg_number = reg_number;
    }

    public long getPhone_number() {

        return phone_number;
    }

    public void setPhone_number(long phone_number) {

        this.phone_number = phone_number;
    }

    public String getFather_name() {

        return Father_name;
    }

    public void setFather_name(String father_name) {
        Father_name = father_name;
    }

    public String getMother_name() {
        return mother_name;
    }

    public void setMother_name(String mother_name) {

        this.mother_name = mother_name;
    }
}
