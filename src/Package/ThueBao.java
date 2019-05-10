/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

/**
 *
 * @author hungd
 */
public abstract class ThueBao implements IThueBao{
    private String maTB;
    private String tenTB;
    private double khuyenMai;

    public ThueBao() {
    }

    public ThueBao(String maTB, String tenTB) {
        this.maTB = maTB;
        this.tenTB = tenTB;
    }  

    public ThueBao(String maTB, String tenTB, double khuyenMai) {
        this.maTB = maTB;
        this.tenTB = tenTB;
        this.khuyenMai = khuyenMai;
    }    

    public String getMaTB() {
        return maTB;
    }

    public void setMaTB(String maTB) {
        this.maTB = maTB;
    }

    public String getTenTB() {
        return tenTB;
    }

    public void setTenTB(String tenTB) {
        this.tenTB = tenTB;
    }

    public double getKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(double khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    
    @Override
    public String toString() {
        return super.toString();
    }
}
