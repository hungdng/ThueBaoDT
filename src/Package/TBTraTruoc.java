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
public class TBTraTruoc extends ThueBao{
    private double tienNap;

    public TBTraTruoc() {
    }

    public TBTraTruoc(double tienNap, String maTB, String tenTB) {
        super(maTB, tenTB);
        this.tienNap = tienNap;
    }

    public TBTraTruoc(double tienNap, String maTB, String tenTB, double khuyenMai) {
        super(maTB, tenTB, khuyenMai);
        this.tienNap = tienNap;
    }    

    public double getTienNap() {
        return tienNap;
    }

    public void setTienNap(double tienNap) {
        this.tienNap = tienNap;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double tinhCuoc() {
        return this.getTienNap();
    }

    @Override
    public double getKhuyenMai() {
        return super.getKhuyenMai();
    }

}
