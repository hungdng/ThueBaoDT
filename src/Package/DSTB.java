/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hungd
 */
public class DSTB {
    public List<ThueBao> listTB = new ArrayList<>();
    
    public void them(ThueBao tb){
        if (tb !=null) {
            listTB.add(tb);
        }
        
    }
    
    public boolean xoa(String maTB){        
        return listTB.removeIf(s -> (s.getMaTB() == null ? maTB == null : s.getMaTB().equals(maTB)));
    }
    
    public double tongTienTBTraSau() {
        double tong = 0;
        for (ThueBao thueBao : listTB) {
            if (thueBao instanceof TBTraSau) {
                tong += (((TBTraSau) thueBao).tinhCuoc() - thueBao.getKhuyenMai());
            }
        }
        return tong;
    }
    
    public String tim(double khuyenMai){
        return "";
    }
    
    public void hienThi(){
        
    }
}
