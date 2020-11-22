package silver_practice;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class Sample{
	public static void calc() {
		long free = Runtime.getRuntime().freeMemory();
		long total = Runtime.getRuntime().totalMemory();
		long usage = (total - free) / 1024/1024;
		System.out.println(usage);
	}
    public static void main(String[] args) {
    	Instant start = Instant.now();
    	System.out.println(Integer.MAX_VALUE);
    	StringBuilder sb1 = new StringBuilder(50_000);
    	String a = "";
    	String[] array = {"A","B","C","D","E","F","G","H","I","J"};
    	calc();
    	for (int i = 0; i < 50_000; i++) {
    		Random r = new Random();
    		int rr = r.nextInt(10);
    		a += array[rr];
//			sb1.append(array[rr])/*.append(array[rr]).append(array[rr])*/;
		}
    	calc();
    	Instant end = Instant.now();
    	System.out.println(Duration.between(start, end));
	    
	    //結果は大分効率化された。
// 	    時間もなん十分の一、メモリもなん十分の一になった。
    }
}

