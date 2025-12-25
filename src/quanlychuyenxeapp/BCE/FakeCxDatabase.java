package quanlychuyenxeapp.BCE;

import java.util.HashMap;
import quanlychuyenxeapp.provider.ChuyenXeNgoaiThanh;
import quanlychuyenxeapp.provider.ChuyenXeNoiThanh;

/**
 *
 * @author phuoc
 */
public class FakeCxDatabase {
    static HashMap<Integer, ChuyenXeNoiThanh> dsCxNoi = 
            new HashMap<>();
    static HashMap<Integer, ChuyenXeNgoaiThanh> dsCxNgoai = 
            new HashMap<>();
  
    public static void insertNoi(ChuyenXeNoiThanh cxNoi)
    {
        dsCxNoi.put(cxNoi.getMaCx(), cxNoi);
    }
    
    public static void insertNgoai(ChuyenXeNgoaiThanh cxNgoai)
    {
        dsCxNgoai.put(cxNgoai.getMaCx(), cxNgoai);
    }
}
