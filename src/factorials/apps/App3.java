package factorials.apps;

import java.io.File;
import java.net.URL;
import java.util.Enumeration;

import factorials.Factorial;
import factorials.FactorialObserver;

public class App3 {
	public static void main(String[] args) throws Exception {
		
		int number = 25;
		Enumeration<URL> resources = ClassLoader.getSystemClassLoader().getResources("factorials/calculators");
		File[] files = new File(resources.nextElement().getFile()).listFiles();
		for (int i = 0; i < files.length; i++) {
			File file = files[i];
			String classPath = "factorials.calculators." + file.getName().replace(".class", "");
			Class<?> clazz = Class.forName(classPath);
			Factorial factorial = (Factorial)clazz.getConstructor().newInstance();
			FactorialObserver observer = new FactorialObserver(factorial);
			observer.observe(number);
		}
	}
}
