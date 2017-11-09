package spring_aop_24;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {

    //被代理对象
    Object target;

    //获得代理后的对象
    public Object getProxyObject(Object target) {
        this.target=target;
        //动态代码生成器，增强器
        Enhancer enhancer=new Enhancer();
        //指定回调
        enhancer.setCallback(this);
        //指定生成的父类类型
        enhancer.setSuperclass(target.getClass());
        //返回生成的对象
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("开始调用方法"+method.getName());

        //在被代理对象上执行方法method并指定参数objects
        Object result=method.invoke(target,objects);

        System.out.println("调用方法结束"+method.getName());
        return result;

    }
}
