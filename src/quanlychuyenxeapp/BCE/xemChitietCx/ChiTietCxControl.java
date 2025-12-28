package quanlychuyenxeapp.BCE.xemChitietCx;

import java.text.SimpleDateFormat;
import quanlychuyenxeapp.BCE.FakeCxDatabase;
import quanlychuyenxeapp.provider.ChuyenXeNgoaiThanh;
import quanlychuyenxeapp.provider.ChuyenXeNoiThanh;

/**
 *
 * @author phuoc
 */
public class ChiTietCxControl {
    //state
    //constructor
    //behavior
    public void control(RequestDTO reqDTO){
        SimpleDateFormat sDF = new SimpleDateFormat("dd/MM/yyyy");
        ChuyenXeNoiThanh xeNoiThanh = null;
        ChuyenXeNgoaiThanh xeNgoaiThanh = null;
        ResponseDTO resDTO = null;
        ResultChiTietUI chiTietUI = null;
        //tìm chuyến xe theo mã lấy từ reqDTO
        //gửi thông điệp đến hành vi get() của đối tượng
        //ChiTietCxDAO
        xeNoiThanh = FakeCxDatabase.getCxNoiById(reqDTO.maCx);
        
        xeNgoaiThanh = FakeCxDatabase.getNgoaiById(reqDTO.maCx);
        
        if(xeNoiThanh != null)
        {
           resDTO = new ResponseDTO();
           resDTO.maCx = String.valueOf(xeNoiThanh.getMaCx());
           resDTO.tenTx = xeNoiThanh.getTenTx();
           resDTO.soXe = xeNoiThanh.getSoXe();
           resDTO.donGia = String.valueOf(xeNoiThanh.getDonGia());
           resDTO.xeNoiThanh = true;
           resDTO.soTuyen = String.valueOf(xeNoiThanh.getSoTuyen());
           resDTO.kmDiDuoc = String.valueOf(xeNoiThanh.getKmDiDuoc());
           resDTO.tien = String.valueOf(xeNoiThanh.tinhTien());
           resDTO.found = true;
           resDTO.ngayDi = sDF.format(xeNoiThanh.getNgayDi());
            
        }
        
        if(xeNgoaiThanh != null)
        {
            //sv code
        }
        
        if(xeNoiThanh == null&& xeNgoaiThanh == null){
            resDTO = new ResponseDTO();
            resDTO.found = false;
            resDTO.message = "[KHONG TIM THAY CX CO MA]: " + reqDTO.maCx;
        }
        
        
        
        chiTietUI = new ResultChiTietUI();
        chiTietUI.display(resDTO);
        
        
        
    }
    
}
