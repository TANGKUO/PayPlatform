//package com.shiyanlou.java;

public class Business {

    public static void main(String[] args){

        Account midAccount;//中间账户
        Buyer buyer;
        Seller seller;

        midAccount = new Account();
        buyer = new Buyer("Buyer", "shiyanlou，sichuan", "buyer@gmail.com", "8888888",midAccount);//买家基本信息以汇款的目标账户
        seller = new Seller("Seller", "aliyun，sichuan", "Seller@gmail.com", "6666666",midAccount);//卖家基本信息以取款的目标账户

        Thread accountThread1 = new Thread(buyer);//新建线程1 买家存款
        Thread accountThread2 = new Thread(seller);//新建线程2 卖家取款
        accountThread1.start();//线程1开始
        accountThread2.start();//线程2开始
        /*
        try{
            Thread.sleep(100);

        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }*/
        System.out.printf("Account : start Balance: %f\n",midAccount.getBalance());

    }       
}