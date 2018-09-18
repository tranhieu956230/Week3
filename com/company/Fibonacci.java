/**
 * @author Trần Đức Hiếu
 * @since 18/09/2018
 * @version 1.8.0
 *
 */
package com.company;
public class Fibonacci {
    /**
     *
     * @param a
     * @param b
     * @return UCLN của a và b
     */
    public int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        if(b == 0) return a;
        return gcd(b, a%b);
    }

    /**
     *
     * @param n Số nguyên dương
     * @return  số fibonacci thứ n
     */
    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }
}
