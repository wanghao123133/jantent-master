package springboot.service.impl;

import springboot.util.MyUtils;

public class Md5test {
    public  static  void main(String[] args)throws Exception{
        String pwd = MyUtils.MD5encode("admin123456");
       /* Thread thread=new Thread();*/
        System.out.printf(pwd);
      Thread.sleep(1000);
        String pwd2 = MyUtils.MD5encode("admin123456");

        System.out.printf(pwd2);
    }
}
