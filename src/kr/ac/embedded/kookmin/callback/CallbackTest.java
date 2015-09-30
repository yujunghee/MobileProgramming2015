package kr.ac.embedded.kookmin.callback;

public class CallbackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum total = new Sum();
		
		OnMaxNumberCb callback = new OnMaxNumberCb() {

			@Override
			public void onMaxNumber(int number, int exceed) {
				// TODO Auto-generated method stub
				// 구현하시오 //
			}
			
		};
		
		total.setMaxNumber(50);
		total.setOnMaxNumberCb(callback);
		
		for ( int i=1; i<=11; i++) {
			total.addNumber(i);
		}
		
		System.out.println("Total is" + total.getTotal());
	}
	

}
