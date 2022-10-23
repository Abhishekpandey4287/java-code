import javax.swing.text.html.MinimalHTMLWriter;

public class pattern {
    public static void main(String[] args) {
        pattern1(4);
        System.out.println();
        pattern2(4);
        System.out.println();
        pattern3(4);
        System.out.println();
        pattern4(4);
        System.out.println();
        pattern5(4);
        System.out.println();
        pattern6(4);
        System.out.println();
        pattern7(4);
        System.out.println();
        pattern8(4);
        System.out.println();
        pattern9(4);
        System.out.println();
        pattern10(4);
        System.out.println();

    }

    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {

        for (int i = 1; i <= 2 * n; i++) {
            if (i > n) {
                for (int j = 1; j <= 2 * n - i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            if (i > n) {
                for (int j = 1; j <= 2 * n - i; j++) {
                    for (int s = 1; s <= i - 2; s++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    for (int s = 1; s < 2 * n - i; s++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s <= n - i; s++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int c = i > n ? 2 * n - i : i;
            for (int s = 0; s <= n - c; s++) {
                System.out.print("  ");
            }
            for (int j = c; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= c; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {
        int original = n;
        n = 2*n;
        for (int i = 1 ; i < n ; i++) {
            for (int j = 1; j < n; j++) {
                int ateveryIndex = original - Math.min(Math.min( i , j) , Math.min(n- i , n-j)) +1;
                System.out.print(ateveryIndex+" ");
            }
            System.out.println();
        }
    }
}