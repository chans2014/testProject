package com.alikes.controller;

public class parentHome {
    private  String msg;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
    public  void  PIndex(){
        System.out.println("父类:"+msg);
    }


}
