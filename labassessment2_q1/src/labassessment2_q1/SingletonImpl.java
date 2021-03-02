package labassessment2_q1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

class Singleton implements Cloneable, Serializable{
	private static final long serialVersionUID = 1L;
	
	private volatile static Singleton singleton; 
	
	private Singleton() {}
	
	//double checked locking
	public  static Singleton getSingleton() {
		if(singleton==null) {
			synchronized (Singleton.class) {
				if(singleton==null)
				singleton=new Singleton();
			}
		}
			
	return singleton;
	}

	@Override //to prevent cloning
	protected Object clone() throws CloneNotSupportedException {
		return singleton;
	}
	
	//to prevent deserialize problem
	private Object readResolve() {
		return singleton;
	}
	
}

public class SingletonImpl {
	public static void main(String[] args) throws CloneNotSupportedException, FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Singleton singleton=Singleton.getSingleton();
		System.out.println(singleton.hashCode());
		
		
	}
}
