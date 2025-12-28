package quanlychuyenxeapp.provider;

import java.util.Date;

/**
 *
 * @author phuoc
 */
public class ChuyenXeNoiThanh extends ChuyenXe{
    private int soTuyen;
    private float kmDiDuoc;
    
    public ChuyenXeNoiThanh(){}
    public ChuyenXeNoiThanh(int _maCx, String _tenTx,
            String _soXe, double _donGia, int _soTuyen, float _kmDiDuoc, Date _ngayDi)
    {
        super(_maCx, _tenTx, _soXe, _donGia, _ngayDi);
        soTuyen = _soTuyen;
        kmDiDuoc = _soTuyen;
    }

    @Override
    public double tinhTien() {
        return kmDiDuoc * donGia; 
    }
    
    

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public float getKmDiDuoc() {
        return kmDiDuoc;
    }

    public void setKmDiDuoc(float kmDiDuoc) {
        this.kmDiDuoc = kmDiDuoc;
    }
   
    
    
    
}
