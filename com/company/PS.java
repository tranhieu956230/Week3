/**
 * @author Trần Đức Hiếu
 * @since 18/09/2018
 * @version 1.8.0
 *
 */
package com.company;
public class PS {
    private int tu, mau;
    public PS(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public int getTu() {
        return this.tu;
    }

    public int getMau() {
        return this.mau;
    }

    public void setTu(int n) {
        this.tu = n;
    }

    public void setMau(int n) {
        this.mau = n;
    }

    /**
     *
     * @param a phân số
     * @param b phân số
     * @return tổng của a và b
     */
    public static PS add(PS a, PS b) {
        int newTu = a.getTu() * b.getMau() + b.getTu() * a.getMau();
        int newMau = a.getMau() * b.getMau();
        int ucln = gcd(newTu, newMau);
        return new PS(newTu/ucln, newMau/ucln);
    }

    /**
     * @param a phân số
     * @param b phân số
     * @return hiệu của a và b
     */
    public static PS sub(PS a, PS b) {
        int newTu = a.getTu() * b.getMau() - b.getTu() * a.getMau();
        int newMau = a.getMau() * b.getMau();
        int ucln = gcd(newTu, newMau);
        return new PS(newTu/ucln, newMau/ucln);
    }

    /**
     *
     * @param a phân số
     * @param b phân số
     * @return tích của a và b
     */
    public static PS mul(PS a, PS b) {
        int newTu = a.getTu() * b.getTu();
        int newMau = a.getMau() * b.getMau();
        int ucln = gcd(newTu, newMau);
        return new PS(newTu/ucln, newMau/ucln);
    }

    /**
     *
     * @param a phân số
     * @param b phân số
     * @return thương của a và b
     */
    public static PS div(PS a, PS b) {
        int newTu = a.getTu() * b.getMau();
        int newMau = a.getMau() * b.getTu();
        int ucln = gcd(newTu, newMau);
        return new PS(newTu/ucln, newMau/ucln);
    }

    /**
     *
     * @param a phân số
     * @param b phân số
     * @return true nếu a bằng b
     */
    public static boolean equals(PS a, PS b) {
        PS result = div(a, b);
        return (result.mau == 1) ? true : false;
    }

    /**
     *
     * @param a Số nguyên
     * @param b Số nguyên
     * @return UCLN của a và b
     */
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        if(b == 0) return a;
        return gcd(b, a % b);
    }
}
