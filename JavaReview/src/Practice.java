public class Practice {

    public static void main(String[] args) {
    	for(int p = 0; p<20; p++) {
        int n = p; // Set your value for n here
        int sum = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < i * i; j++) {
                if (j % i == 0) {
                    for (int k = 0; k < j; k++) {
                        sum++;
                    }
                }
            }
        }

        System.out.println("The sum for n = " + n + " is: " + sum);
    }}
}
