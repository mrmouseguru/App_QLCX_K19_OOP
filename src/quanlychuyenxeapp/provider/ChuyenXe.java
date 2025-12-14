package quanlychuyenxeapp.provider;

/**
 *
 * @author phuoc
 */
public class ChuyenXe {
    protected int maCx;
    protected String tenTx;
    protected String soXe;
    protected double donGia;
    
    protected ChuyenXe(){}
    protected ChuyenXe(int _maCx, String _tenTx,
            String _soXe, double _donGia)
    {
        maCx = _maCx;
        tenTx = _tenTx;
        soXe = _soXe;
        donGia = _donGia;
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
