package quanlychuyenxeapp.BCE;

import java.util.Calendar;
import java.util.Date;
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
  
    public static void initData(){
         int day = 20;
        int month = 10;
        int year = 2025;
        
        
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.MONTH, month -1);
        cal.set(Calendar.YEAR, year);
                
        Date ngayDi = cal.getTime();
        
         ChuyenXeNoiThanh cxNoi1 = new ChuyenXeNoiThanh(1, 
                "L Van Teo",
                "Teo 111", 7_000, 
                24, 10.5f, ngayDi);
        ChuyenXeNoiThanh cxNoi2 = new ChuyenXeNoiThanh(2, 
                "L Van Ty",
                "Ty 222", 8_000, 
                54, 9.5f, ngayDi);
        
        ChuyenXeNgoaiThanh cxNgoai1 = new ChuyenXeNgoaiThanh(3, 
                "Nguyen V Tung", "tung 333", 
                700_000, 
                "Can Tho", 3.5f,ngayDi);
         ChuyenXeNgoaiThanh cxNgoai2 = new ChuyenXeNgoaiThanh(4, 
                "Trinh Van Beo", "beo 4444", 
                900_000, 
                "Ca Mau", 5.0f, ngayDi);
         
        dsCxNoi.put(cxNoi1.getMaCx(), cxNoi1);
        dsCxNoi.put(cxNoi2.getMaCx(), cxNoi2);
        dsCxNgoai.put(cxNgoai1.getMaCx(), cxNgoai1);
        dsCxNgoai.put(cxNgoai2.getMaCx(), cxNgoai2);

    }
    
    public static void insertNoi(ChuyenXeNoiThanh cxNoi)
    {
        dsCxNoi.put(cxNoi.getMaCx(), cxNoi);
    }
    
    public static void insertNgoai(ChuyenXeNgoaiThanh cxNgoai)
    {
        dsCxNgoai.put(cxNgoai.getMaCx(), cxNgoai);
    }
    
    public static ChuyenXeNoiThanh getCxNoiById(int id)
    {
        ChuyenXeNoiThanh xeNoiThanh = null;
        xeNoiThanh = dsCxNoi.get(id);
        return xeNoiThanh;
        
    }
    
    public static ChuyenXeNgoaiThanh getNgoaiById(int id)
    {
        ChuyenXeNgoaiThanh xeNgoaiThanh = null;
        xeNgoaiThanh = dsCxNgoai.get(id);
        return xeNgoaiThanh;
        
    }
}
