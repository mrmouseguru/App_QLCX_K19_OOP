package quanlychuyenxeapp.BCE.themCx;

import quanlychuyenxeapp.BCE.FakeCxDatabase;
import quanlychuyenxeapp.provider.ChuyenXeNgoaiThanh;
import quanlychuyenxeapp.provider.ChuyenXeNoiThanh;

/**
 *
 * @author phuoc
 */
public class AddCxDAO {
    //state
    //constructor
    //behavior
    public void insertCxNoi(ChuyenXeNoiThanh cxNoi)
    {
        //thêm vào cxNoi vào CSDL
        FakeCxDatabase.insertNoi(cxNoi);
    }
    
    
    public void insertCxNgoai(ChuyenXeNgoaiThanh cxNgoai )
    {
        //thêm vào cxNoi vào CSDLcxNgoai
        FakeCxDatabase.insertNgoai(cxNgoai);
    }
    
}
