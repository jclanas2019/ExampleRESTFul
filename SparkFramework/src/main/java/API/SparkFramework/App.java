package API.SparkFramework;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("===============");

		StringBuffer sbuffer = new StringBuffer();
		long inicio = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			sbuffer.append("zim");
		}
		long fin = System.currentTimeMillis();
		System.out.println("Tiempo del StringBuffer: " + (fin - inicio));

		StringBuilder sbuilder = new StringBuilder();
		inicio = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			sbuilder.append("zim");
		}
		fin = System.currentTimeMillis();
		System.out.println("Tiempo del StringBuilder: " + (fin - inicio));
		System.out.println("Stringbuffer fue : " + (fin - inicio));
	}
}
