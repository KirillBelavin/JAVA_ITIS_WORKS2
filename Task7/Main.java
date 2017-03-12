class Main {
	public static void main(String[] args) {
     int a[] = new int[10];
		a[0] = 10;
		a[1] = -7;
		a[2] = 4;
		a[3] = 12;
		a[4] = -10;
		a[5] = 5;
		a[6] = 2;
		a[7] = 1;
		a[8] = 9;
		a[9] = 2;
		int sum = 0;
		  for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("amount =" + sum);
	}	
}
