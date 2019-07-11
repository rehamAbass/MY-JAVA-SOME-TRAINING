package testMain;

public class tMain extends Thread { 
		
		static final int N = 5; 
		static int activeThread = 0;
		
		static final Object lock = new Object();
		
		public static void main(String[] args) { 
			for (int i = 1; i <= N; i++) { 
				new tMain().start();
				}
			}
		///////////////////////////////////////////
		@Override
		public void run() { 
			System.out.println("function run being called:");
		while (true) { 
			this.printThreadName_REHAM();
			}
		}
		 //////////////////////////////////////////////////
		private void printThreadName_REHAM() { 
			synchronized (lock) { 
					while (!("Thread-" + activeThread).equals(this.getName())) { 
						
						try { 
							lock.wait();
							}catch (InterruptedException e) { 
									System.out.println(this.getName() + " was interrupted!");
									}
						}//end of while 
					System.out.println(this.getName()); 
					activeThread = (activeThread + 1) % N; 
					lock.notifyAll();
					}
					//end of synchronized, print, main output: Thread-0, Thread-1, Thread-2, Thread-3... 
		}
		///////////////////////////////////////////////////////
	}
