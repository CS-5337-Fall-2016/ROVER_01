package testUtillities;

import javax.swing.SwingUtilities;

public class SwingThreadMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		final SwingThreadingEg mainPanel = new SwingThreadingEg();
		final MyWorker myWorker = new MyWorker(mainPanel);

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				SwingThreadingEg.createAndShow(myWorker, mainPanel);
			}
		});

		
		for (int i = 2; i < 29; i++) {
			System.out.println(i);
			myWorker.printOut(Integer.toString(i));

			Thread.sleep(500); // Time delay to sync output

		}

	}

}
