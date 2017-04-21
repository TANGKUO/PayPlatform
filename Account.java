//package com.shiyanlou.java;

public class Account {
    //余额  浮点类型
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    //构造方法
    public Account()
    {
        balance = 0;
    }

    /*
     * 付款，此处有关键字synchronized修饰。
     */
     public synchronized void deposit(double amount) {
        double tmp=balance;
        
        try {
                Thread.sleep(50);
        } catch (InterruptedException e) {
              e.printStackTrace();
        }
                  tmp+=amount;
                  balance=tmp;
     }

     /*
      * 取款此处有关键字synchronized修饰。
      */
     public synchronized void withdraw(double amount) {
         double tmp=balance;
         
          try {
                Thread.sleep(20);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         tmp-=amount;
         balance=tmp;
     }

     public void printInfo()
        {
            System.out.println("Balance on "+ " account =  " + balance);
    }
}