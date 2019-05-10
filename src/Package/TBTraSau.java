/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import java.util.Date;

/**
 *
 * @author hungd
 */
public class TBTraSau extends ThueBao {

    private int soTinNhan;
    private int soCuocGoi;
    private double phiTinNhan;
    private double phiCuocGoi;
    private Date ngayTB;

    public TBTraSau() {
    }

    public TBTraSau(int soTinNhan, int soCuocGoi, double phiTinNhan, double phiCuocGoi, String maTB, String tenTB, double khuyenMai) {
        super(maTB, tenTB, khuyenMai);
        this.soTinNhan = soTinNhan;
        this.soCuocGoi = soCuocGoi;
        this.phiTinNhan = phiTinNhan;
        this.phiCuocGoi = phiCuocGoi;
        this.ngayTB = new Date();
    }

    public int getSoTinNhan() {
        return soTinNhan;
    }

    public void setSoTinNhan(int soTinNhan) {
        this.soTinNhan = soTinNhan;
    }

    public int getSoCuocGoi() {
        return soCuocGoi;
    }

    public void setSoCuocGoi(int soCuocGoi) {
        this.soCuocGoi = soCuocGoi;
    }

    public double getPhiTinNhan() {
        return phiTinNhan;
    }

    public void setPhiTinNhan(double phiTinNhan) {
        this.phiTinNhan = phiTinNhan;
    }

    public double getPhiCuocGoi() {
        return phiCuocGoi;
    }

    public void setPhiCuocGoi(double phiCuocGoi) {
        this.phiCuocGoi = phiCuocGoi;
    }

    public Date getNgayTB() {
        return ngayTB;
    }

    public void setNgayTB(Date ngayTB) {
        this.ngayTB = ngayTB;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double tinhCuoc() {
        double cuoc = (this.getPhiTinNhan() * this.getSoTinNhan()) + (this.getPhiCuocGoi() * this.getSoCuocGoi());
        return cuoc;
    }

    @Override
    public double getKhuyenMai() {
        long diff = new Date().getTime() - this.getNgayTB().getTime();
        int diffDays = (int) (diff / (24 * 60 * 60 * 1000));
        return super.getKhuyenMai() * diffDays;
    }

}
