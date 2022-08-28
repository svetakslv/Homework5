public class Main {
    public static void main(String[] args) {
        //Задача №1, 2, 3
        int[] num = new int[3];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;

        for (int i = num.length - 1; i > 0; i--) {
            System.out.print(num[i] + ", ");
            if (i != num.length - 1) {
                System.out.print(num[0]);
                System.out.println();

                double[] frac = new double[]{1.57, 7.654, 9.986};
                frac[0] = 1.57;
                frac[1] = 7.654;
                frac[2] = 9.986;

                for (int j = frac.length - 1; j > 0; j--) {
                    System.out.print(frac[j] + ", ");
                    if (j != frac.length - 1) {
                        System.out.print(frac[0]);
                        System.out.println();


                        int[] q = {4, 7, 2, 9};
                        q[0] = 4;
                        q[1] = 7;
                        q[2] = 2;
                        q[3] = 9;

                        for (int t = q.length - 1; t > 0; t--) {
                            System.out.print(q[t] + ", ");
                            if (t != q.length - 1) {
                                System.out.print(q[0]);

                            }
                        }
                    }
                }
            }
        }
    }
}


