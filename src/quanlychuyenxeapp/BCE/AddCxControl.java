package quanlychuyenxeapp.BCE;

import quanlychuyenxeapp.provider.ChuyenXeNoiThanh;

/**
 *
 * @author phuoc
 */
public class AddCxControl {
    //state
    //constructor
    //behavior
    public void control(RequestDTO req)
    {
        ResponseDTO resDTO = null;
        //điều phối
        //1.nhận dữ liêu trong đối tượng RequestDTO
        //tạo đối tượng chuyến xe tương ứng
        if(req.loai == 1){
            ChuyenXeNoiThanh cxNoi = 
                    new ChuyenXeNoiThanh(req.maCx, req.tenTx,
                            req.soXe, req.donGia, 
                            req.soTuyen, req.kmDiDuoc);
        //gửi thông điệp đên hành vi insertCXNoi()
        //của đối tượng AddCxDAO
        AddCxDAO addDAO =  new AddCxDAO();
        addDAO.insertCxNoi(cxNoi);
        
        resDTO= new ResponseDTO();
        resDTO.maCx = String.valueOf(cxNoi.getMaCx());
        resDTO.tenTx = cxNoi.getTenTx();
        resDTO.soXe = cxNoi.getSoXe();
        resDTO.loai = "Ngoai Thanh";
        
                
        
        }
        
        if(req.loai == 2){
            //code
        }
        
        ResultAddCxUI resultUI = new ResultAddCxUI();
        resDTO.message = "Them Thanh Cong!!";
        resultUI.display(resDTO);
        
    }
    
}
