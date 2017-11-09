package spring_aop_24;


public class TestMath {
    public static void main(String[] args) {
        Math math = (Math) new CglibProxy().getProxyObject(new Math());
        int n1 = 999, n2 = 112;
        math.add(n1, n2);
        math.sub(n1, n2);
        math.mul(n1, n2);
        math.div(n1, n2);
        math.mod(n1, n2);
    }
}
