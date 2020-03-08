public class Client {
	static int multiply(int x, int result[], int size) {
		int carry = 0;

		for (int i = 0; i < size; i++) {
			int prod = result[i] * x + carry;
			result[i] = prod % 10;
			carry = prod / 10;
		}

		while (carry != 0) {
			result[size] = carry % 10;
			carry /= 10;
			size++;
		}
		return size;
	}

	static void factorial(int n) {
		int result[] = new int[5000];
		result[0] = 1;
		int size = 1;

		for (int i = 2; i <= n; i++)
			size = multiply(i, result, size);
		
		System.out.println("Factorial of given number is ");
		for (int i = size - 1; i >= 0; i--)
			System.out.print(result[i]);
	}

	public static void main(String[] args) {
		factorial(5);
	}
}
