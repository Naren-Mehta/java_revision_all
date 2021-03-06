package math;

public class DivideTwoIntegers {

	public int divide(int dividend, int divisor) {

		if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1)) {
			return Integer.MAX_VALUE;
		}

		int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;

		long absDividend = Math.abs((long) dividend);
		long absDivisor = Math.abs((long) divisor);

		int count = 0;
		while (absDividend >= absDivisor) {
			int shift = 0;
			System.out.println(absDivisor + " " + shift + " " + (absDivisor << shift));
			while (absDividend >= (absDivisor << shift)) {
				shift++;
			}

			System.out.println(shift + " "+ (1<< (shift -1)));
			count += (1 << (shift - 1));

			absDividend -= absDivisor << (shift - 1);
		}

		return sign == -1 ? -count : count;

	}

	public static void main(String[] args) {
		DivideTwoIntegers obj = new DivideTwoIntegers();
		System.out.println(obj.divide(-2147483648, 2));
	}

//	-2147483648
//	1
}
