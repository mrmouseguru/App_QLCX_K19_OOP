package quanlychuyenxeapp.BCE;

/**
 *
 * @author phuoc
 */
public class AppQlCxBCE {
    
    public static void main(String[] args) {
        //khởi tạo dữ liệu cho App
        FakeCxDatabase.initData();
        //Bước 1    //Bước3     //Bước 2
        MenuUI menu  =         new MenuUI();
        //gửi thông điệp 
        menu.getChoices();
    }
    
}
