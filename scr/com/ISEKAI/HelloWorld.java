package com.ISEKAI;
/*声明程序所在的包*/
import com.ISEKAI.tool.Print;
/*导入Print类，提供print方法*/
public class HelloWorld {
    public static void main(String[] args){
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