package zlhywlf;

/**
 * @author zlhywlf
 */
public class Main {

    /**
     * 文档注释
     *
     * @param args 运行时参数
     */
    public static void main(String[] args) {
        // 单行注释
        // 单行注释
        /*
         * 多行注释
         * 多行注释
         * */
        System.out.println("hello world");

        double d = 0.1;
        int i = (int) d;
        d = i;
        System.out.println(d);

        System.out.println(Math.pow(2, 4));
    }
}


class Scope {
    /**
     * 类变量
     */
    static int classVar = 12;

    /**
     * 实例变量
     */
    int instanceVar = 11;

    void doSomething() {
        // 局部变量
        int localVar = 10;
    }
}