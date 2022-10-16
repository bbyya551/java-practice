package day4;

public class prob417 {
	public static void main(String[] args) {
//		for(int i = 1; i <= 10; i++) {
//			System.out.print("■" + " ");
//			for (int j = (10 - i); j >= 0; j--) {
//				System.out.print("□" + " ");
//			}
//			System.out.println();
//		}
		// 行
		for(int i = 1; i <= 10; i++) {
			//列
			for(int j = 1; j <= 10; j++) {
				if(j <= i) {
					System.out.print("■" + " ");
				}else {
					System.out.print("□" + " ");
				}
			}
			System.out.println();
		}
	}
}
