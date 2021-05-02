public class HeapSizeDemo
{
	public static void main(String[] args)
	{
		java.io.PrintStream out = System.out;

	
		Runtime runtime = Runtime.getRuntime();

		long MegaBytes = 1024 * 1024;

		
		long totalMemory = runtime.totalMemory() / MegaBytes;
		out.println("Heap size available for use -> " + totalMemory + " MB");

		
		long maxMemory = runtime.maxMemory() / MegaBytes;
		out.println("Maximum memory Heap can use -> " + maxMemory + " MB");

		
		long freeMemory = runtime.freeMemory() / MegaBytes;
		out.println("Free memory in heap -> " + freeMemory + " MB");

		
		long memoryInUse = totalMemory - freeMemory;
		out.println("Memory already used by heap -> " + memoryInUse + " MB");
	}
}
