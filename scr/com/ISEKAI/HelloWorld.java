package com.ISEKAI;
/*声明程序所在的包*/
import com.ISEKAI.tool.Print;


/*导入Print类，提供print方法*/
public class HelloWorld {

    public static void main(String [] args){
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        Test.test();
    }
}
/*创建HelloWorld类，提供main函数作为程序的入口*/
class Test{
    public static void test(){
        Print.print("Hello World");
    }
}
/*创建test类，其中有test方法调用print类中的print方法打印目标字符串*/
/*什么是包？根据我的理解
* 包的地位类似于特殊文件夹，将不同功能的代码放置在不同的包中确保哥哥代码段不会互相冲突
* 使代码更加模块化，便于操作
* */