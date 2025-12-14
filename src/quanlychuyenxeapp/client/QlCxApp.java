package quanlychuyenxeapp.client;
import java.util.Scanner;
import quanlychuyenxeapp.provider.ChuyenXeNgoaiThanh;
import quanlychuyenxeapp.provider.ChuyenXeNoiThanh;

/**
 *
 * @author phuoc
 */
public class QlCxApp {
    //khai báo 2 biến mảng để lưu danh sách xe
    //2 biến này là toàn cục - có tác dụng toàn hệ thống
    static ChuyenXeNoiThanh[] dsCxNoiThanh = new ChuyenXeNoiThanh[50];
    static ChuyenXeNgoaiThanh[] dsCxNgoaiThanh = new ChuyenXeNgoaiThanh[50];
    static Scanner keyboard = new Scanner(System.in);
    static int sizeNoi = 0;
    static int sizeNgoai = 0;
    public static void main(String[] args) {
        int choice;
        initData();

        while(true){
            printMenu();
            System.out.print("->");
            choice = keyboard.nextInt();
            
            if(choice == 1)
            {
                nhapChuyenXe();
                continue;

            }
            
            if(choice == 2){
                printListChuyenXe();
                continue;
            }
            
            if(choice == 3){
                printChitietCx();
                continue;
            }
            
            
            
            if(choice == 4)
            {
                tinhTongTienTungLoaiCX();
                continue;
            }
            
            if(choice == 5)
            {
                break;
            }

            
        }
        //in danh sách
       
    }
    
    static void printMenu(){
        System.out.println("~~~~~~~~~~~~~ Menu ~~~~~~~~~~~~~");
        System.out.println("1. NHAP THONG TIN CHUYEN XE");
        System.out.println("2. IN DANH SACH CHUYEN XE");
        System.out.println("3. XEM CHI TIET THONG TIN MOT CX");
        System.out.println("4. TINH TONG TIEN TUNG LOAI");
        System.out.println("5. THOAT CHUONG TRINH");
        System.out.println("~~~~~~~~~~~~~ Menu ~~~~~~~~~~~~~~");
    }
    
    static void nhapChuyenXe()
    {
        System.out.print("[MA CHUYEN XE]:");
            int maCx = keyboard.nextInt();
            keyboard.nextLine();//nhận ký tự xuống dòng '\n'

            System.out.print("[HO TEN TAI XE]:");
            String hoTenTx = keyboard.nextLine();
            System.out.print("[SO XE]:");
            String soXe = keyboard.nextLine();
            System.out.print("[LOAI XE (1-NOI THANH / 2-NGOAI THANH)]:");
            int type = keyboard.nextInt();
            System.out.print("[DON GIA]:");
            double donGia = keyboard.nextDouble();
            keyboard.nextLine();//nhận ký tự xuống dòng '\n'
            if(type == 1){
                
                System.out.print("[SO TUYEN]:");
                int soTuyen = keyboard.nextInt();
                System.out.print("[SO KM DI DUOC]:");
                float soKmDiDuoc = keyboard.nextFloat();
                ChuyenXeNoiThanh cxNoi = new ChuyenXeNoiThanh(maCx, hoTenTx,
                        soXe, donGia, soTuyen, soKmDiDuoc);
                dsCxNoiThanh[sizeNoi] = cxNoi;
                sizeNoi++;
                
            }
            
            if(type == 2){
                System.out.print("[NOI DEN]:");
                String noiDen = keyboard.nextLine();
                System.out.print("[SO NGAY DI DUOC]:");
                float soNgayDiDuoc = keyboard.nextFloat();
                ChuyenXeNgoaiThanh cxNgoai = new ChuyenXeNgoaiThanh(maCx, 
                        hoTenTx, soXe, donGia, 
                        noiDen, soNgayDiDuoc);
                dsCxNgoaiThanh[sizeNgoai] = cxNgoai;
                sizeNgoai++;


            }
    }
    
    static void printListChuyenXe()
    {
        System.out.printf("%-15s%-20s%-15s%-20s%10s\n", "Ma Chuyen Xe", 
                "Ho Ten Tai Xe","So xe", "Don gia",
                "Thanh tien");
        for(int i =0; i < sizeNoi; i++)
        {
            System.out.printf("%-15d%-20s%-15s%-20.0f%10.0f\n", 
                    dsCxNoiThanh[i].getMaCx(),
                    dsCxNoiThanh[i].getTenTx(),
                    dsCxNoiThanh[i].getSoXe(),
                    dsCxNoiThanh[i].getDonGia(),
                    dsCxNoiThanh[i].tinhTien()
                    
            );
        }
        
        for(int i =0; i < sizeNgoai; i++)
        {
            System.out.printf("%-15d%-20s%-15s%-20.0f%10.0f\n", 
                    dsCxNgoaiThanh[i].getMaCx(),
                    dsCxNgoaiThanh[i].getTenTx(),
                    dsCxNgoaiThanh[i].getSoXe(),
                    dsCxNgoaiThanh[i].getDonGia(),
                    dsCxNgoaiThanh[i].tinhTien()
                    
            );
        }
        
        
    }
    
    static void initData()
    {
        ChuyenXeNoiThanh cxNoi1 = new ChuyenXeNoiThanh(1, 
                "L Van Teo",
                "Teo 111", 7_000, 
                24, 10.5f);
        ChuyenXeNoiThanh cxNoi2 = new ChuyenXeNoiThanh(2, 
                "L Van Ty",
                "Ty 222", 8_000, 
                54, 9.5f);
        
        ChuyenXeNgoaiThanh cxNgoai1 = new ChuyenXeNgoaiThanh(3, 
                "Nguyen V Tung", "tung 333", 
                700_000, 
                "Can Tho", 3.5f);
         ChuyenXeNgoaiThanh cxNgoai2 = new ChuyenXeNgoaiThanh(4, 
                "Trinh Van Beo", "beo 4444", 
                900_000, 
                "Ca Mau", 5.0f);
         
        dsCxNoiThanh[0] = cxNoi1; sizeNoi++;
        dsCxNoiThanh[1] = cxNoi2;sizeNoi++;
        dsCxNgoaiThanh[0] = cxNgoai1;sizeNgoai++;
        dsCxNgoaiThanh[1] = cxNgoai2;sizeNgoai++;
        

         
    }
    
    static void tinhTongTienTungLoaiCX(){
        double tongTienNoiThanh = 0;
        double tongTienNgoaiThanh = 0;
        for(int i = 0; i < sizeNoi; i++)
        {
            tongTienNoiThanh += dsCxNoiThanh[i].tinhTien();
        }
        for(int i = 0; i < sizeNgoai; i++)
        {
            tongTienNgoaiThanh += dsCxNgoaiThanh[i].tinhTien();
        }
        
        System.out.println("Tong tienn CX Noi Thanh: " + tongTienNoiThanh);
        System.out.println("Tong tienn CX Noi Thanh: " + tongTienNgoaiThanh);

        
    }
    
  
    static void printChitietCx()
    {
        ChuyenXeNoiThanh cxNoi = null;
        ChuyenXeNgoaiThanh cxNgoai = null;
        System.out.print("[NHAP MA CX]:");
        int maCx = keyboard.nextInt();
        keyboard.nextLine();
        
        //tìm chuyến xe theo mã
        for(int i = 0; i < sizeNoi; i++)
        {
            if(dsCxNoiThanh[i].getMaCx() == maCx)
            {
                cxNoi = dsCxNoiThanh[i];
                break;
            }
        }
        
        for(int i = 0; i < sizeNgoai; i++)
        {
            if(dsCxNgoaiThanh[i].getMaCx() == maCx)
            {
                cxNgoai = dsCxNgoaiThanh[i];
                break;
            }
        }
        
        if(cxNoi != null)
        {
            System.out.printf("%-15s%-20s%-15s%-15s%-10s%-20s%10s\n", "Ma Chuyen Xe", 
                "Ho Ten Tai Xe","So xe", "Don Gia",
                 "So Tuyen","So KM Di Duoc",
                "Thanh tien");
            System.out.printf("%-15d%-20s%-15s%-15.0f%-10d%-20.1f%10.0f\n", 
                    cxNoi.getMaCx(),
                    cxNoi.getTenTx(),
                    cxNoi.getSoXe(),
                    cxNoi.getDonGia(),
                    cxNoi.getSoTuyen(),
                    cxNoi.getKmDiDuoc(),
                    cxNoi.tinhTien()
                    
            );
            
        }
        
        if(cxNgoai != null)
        {
            System.out.printf("%-15s%-20s%-15s%-15s%-15s%-20s%10s\n", "Ma Chuyen Xe", 
                "Ho Ten Tai Xe","So xe","Don gia",
                "Noi Den",
                "So Ngay Di Duoc", 
                "Thanh tien");
            System.out.printf("%-15d%-20s%-15s%-15.0f%-15s%-20.0f%10.0f\n", 
                    cxNgoai.getMaCx(),
                    cxNgoai.getTenTx(),
                    cxNgoai.getSoXe(),
                    cxNgoai.getDonGia(),
                    cxNgoai.getNoiDen(),
                    cxNgoai.getSoNgayDiDuoc(),
                    cxNgoai.tinhTien()
                    
            );
            
        }
        
        if(cxNoi == null && cxNgoai == null){
            System.out.println("Khong tim thay chuyen xe co ma: " + maCx);
        }
    }
    
}
