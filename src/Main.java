public class Main {
    public static void main(String[] args) {
        //Задача №1, 2, 3
        int[] num = new int[3];
        int a = 1;
        num[0] = a;
        int b = 2;
        num[1] = b;
        int c = 3;
        num[2] = c;
        for (int i = 3; i >= num.length; i--) {
            System.out.print(i-- + ", ");
            System.out.print(i-- + ", ");
            System.out.print(i--);
            System.out.println();

            double[] frac = new double[]{1.57, 7.654, 9.986};
            double d = 1.57;
            frac[0] = d;
            double e = 7.654;
            frac[1] = e;
            double f = 9.986;
            frac[2] = f;
            for (double n = frac[frac.length - 1]; n >= frac.length; n--) {
                ///  for (double n = frac[frac.length - 1]; n >= 0; n--) {

                System.out.print(n-- + ", ");
                System.out.print(n-- + ", ");
                System.out.print(n--);
                System.out.println();

                int[] q = {4, 7, 2, 9};
                int g = 4;
                q[0] = g;
                int h = 7;
                q[1] = h;
                int k = 2;
                q[2] = k;
                int l = 9;
                q[3] = l;
                for (int t = q[q.length - 1]; t >= q.length; t--) {
                    System.out.print(t-- + ", ");
                    System.out.print(t-- + ", ");
                    System.out.print(t-- + ", ");
                    System.out.print(t--);


                }
            }
        }
    }
}


