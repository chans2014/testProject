package com.alikes.controller;

import java.util.Properties;

public class Home {
    private parentHome ph;
    private  String _name;
    private Properties _testlist;
    private  refclass refclass;

//    public void  setrefclass(refclass refclass){
//        this.refclass=refclass;
//
//    }

    public  Home(parentHome phome, String name, Properties testlist,refclass refclass)
    {
        this.ph=phome;
        this._name=name;
        this._testlist=testlist;
        this.refclass=refclass;
    }

    private  String msg;
    private  Init init;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public  void  Index(){
//        ph.PIndex();
       // System.out.println("hello:"+msg);
        refclass.Index();
    }

    public  void  init(){
        System.out.println("实例化bean前执行");
    }

    public  void  destoryq(){
        System.out.println("销毁bean后执行");
    }
}
