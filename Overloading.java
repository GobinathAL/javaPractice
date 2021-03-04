public class Overloading {
        public static void main(String[] args) {
            int a = 1, b = 2, c = 3;
            int res = product(a, b);
            System.out.println(res);
            res = product(a, b, c);
            System.out.println(res);
            int[] arr = {1,2,3,4,5};
            res = product(arr);
            System.out.println(res);
        }
        static int product(int x, int y) {
            return x*y;
        }
        static int product(int x, int y, int z) {
            return x*y*z;
        }
        static int product(int[] arr) {
            int pro = 1;
            for(int n : arr)
                pro*=n;
            return pro;
        }

}
