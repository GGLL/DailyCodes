package proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;

public class proxyTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class clazzProxy = Proxy.getProxyClass(Collection.class.getClassLoader(), Collection.class);
		Constructor[] constructors = clazzProxy.getConstructors();
		for(Constructor constructor : constructors){
			System.out.println(constructor.getName());
			System.out.println("(");
			System.out.println(constructor.getParameterTypes()[0].getName());
			System.out.println(")");
		}
		class MyInvocationHandler implements InvocationHandler{
			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				// TODO Auto-generated method stub
				return null;
			}
		}
		Constructor cc = clazzProxy.getConstructor(InvocationHandler.class);
		Collection collection = (Collection)cc.newInstance(new MyInvocationHandler());
		
		cc.newInstance(new InvocationHandler(){
			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				// TODO Auto-generated method stub
				return null;
			}
		});
		
		Collection prxy3 = (Collection)Proxy.newProxyInstance(
				Collection.class.getClassLoader(), 
				new Class[]{Collection.class}, 
				new InvocationHandler(){
					@Override
					public Object invoke(Object proxy, Method method, Object[] args)
							throws Throwable {
						ArrayList target = new ArrayList();
						long beginTime = System.currentTimeMillis();
						Object obj = method.invoke(target, args);
						long endTime = System.currentTimeMillis();
						
						System.out.println(method.getName() + " takes " + (endTime-beginTime) + " sec");
						return obj;
					}
				});
		prxy3.add("gel");
		prxy3.add("whl");
	}

}
