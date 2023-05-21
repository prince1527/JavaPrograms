
public class Thread1 {

	public static void main(String[] args) {
		Runnable  task = () ->{String threadName = Thread.currentThread().getName();
		         System.out.println("Hello"+ threadName);
		};
		
		task.run();
		
		Thread thread0 = new Thread(task);
		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);
		
		thread0.start();
		thread1.start();
		thread2.start();
		System.out.println("Done!!");

	}

}
