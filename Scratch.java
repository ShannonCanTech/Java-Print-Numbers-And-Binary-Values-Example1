class Scratch {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 0; i <= 100; i++){
            String bin = Integer.toBinaryString(i);
            System.out.println("Number: " + i + ", Binary: " + bin);
        }

//        Test int to string and string to int binary values
        int n = 2;
        String binTest = Integer.toString(n, 2);
        System.out.println("\n***************\nTest\n***************\n");
        System.out.printf("Number Input: %d, Binary Output: %s", n, binTest);

        String bin3 = "1100100";
        int b = Integer.parseInt(bin3, 2);
        System.out.printf("\nBinary Input: %s, Number Output: %d", bin3, b);
    }
}
