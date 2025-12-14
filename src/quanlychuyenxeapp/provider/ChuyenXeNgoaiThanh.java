package quanlychuyenxeapp.provider;
/**
 *
 * @author phuoc
 */
public class ChuyenXeNgoaiThanh extends ChuyenXe{
    
    private String noiDen;
    private float soNgayDiDuoc;
    
    public ChuyenXeNgoaiThanh(){};
    public ChuyenXeNgoaiThanh(int _maCx, String _tenTx,
            String _soXe, double _donGia, String _noiDen, float _soNgayDiDuoc)
    {
        super(_maCx, _tenTx, _soXe, _donGia);
        noiDen = _noiDen;
        soNgayDiDuoc = _soNgayDiDuoc;
        
    }

    @Override
    public double tinhTien() {
        return soNgayDiDuoc * donGia;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public float getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(float soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
    
    
    
    
    
    
            
    
    
}
