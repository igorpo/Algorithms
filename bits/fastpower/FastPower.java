package bits.fastpower;

public class FastPower {
	
	public int fastPower(int a, int b, int n) {
        return (int) sub(a, b, n);
    }
	
    private long sub(int a, int b, int n) {
        if (n == 0) {
            return 1 % b;
        } else if (n == 1) {
            return a % b;
        }
        long pre = fastPower(a, b, n/2); 
        return (pre * pre) % b * (n % 2 != 0 ? a % b : 1) % b;
    }
}
