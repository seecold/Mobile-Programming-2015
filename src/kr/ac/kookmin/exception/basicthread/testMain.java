package kr.ac.kookmin.exception.basicthread;

public class testMain {

	public static BankAccount account = new BankAccount();

	public static void main(String[] args) {

		Thread depositMan = new Thread() {
			public void run() {
				while (true) {
					
					try {
						account.add(10);// 10 ��ŭ �Ա�
						sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
		};

		Thread withdrawMan = new Thread() {
			public void run() {
				while (true) {
					try {
						account.delete(10);// 10 ��ŭ ���
						sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
		};
		depositMan.start();
		withdrawMan.start();
	}
}
