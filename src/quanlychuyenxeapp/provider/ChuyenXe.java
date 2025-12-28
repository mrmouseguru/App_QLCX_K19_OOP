package quanlychuyenxeapp.provider;

import java.util.Date;

/**
 *
 * @author phuoc
 */
public class ChuyenXe {
    protected int maCx;
    protected String tenTx;
    protected String soXe;
    protected double donGia;
    protected Date ngayDi;
    
    protected ChuyenXe(){}
    protected ChuyenXe(int _maCx, String _tenTx,
            String _soXe, double _donGia, Date _ngayDi)
    {
        maCx = _maCx;
        tenTx = _tenTx;
        soXe = _soXe;
        donGia = _donGia;
        ngayDi = _ngayDi;
    }

    public Date getNgayDi() {
        return ngayDi;
    }

    public void setNgayDi(Date ngayDi) {
        this.ngayDi = ngayDi;
    }
    
    

    public int getMaCx() {
        return maCx;
    }

    public void setMaCx(int maCx) {
        this.maCx = maCx;
    }

    public String getTenTx() {
        return tenTx;
    }

    public void setTenTx(String tenTx) {
        this.tenTx = tenTx;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
    
    public double tinhTien(){
      
      throw new UnsupportedOperationException
        ("Phương thức tinhTien() chưa được triển khai");
    }
    
}
