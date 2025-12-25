package quanlychuyenxeapp.BCE.themCx;

import java.util.Scanner;

/**
 *
 * @author phuoc
 */
public class ThongTinCxUI {
    //state
    //constructor
    //behavior
    public void getCxInfo(){
       
        nhapChuyenXe();
    }
    
    private void nhapChuyenXe()
    {
         Scanner keyboard = new Scanner(System.in);
        System.out.print("[MA CHUYEN XE]:");
            int maCx = keyboard.nextInt();//5Enter='\n'
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
                RequestDTO noiDTO = new RequestDTO();
                noiDTO.maCx = maCx;
                noiDTO.tenTx = hoTenTx;
                noiDTO.soXe = soXe;
                noiDTO.donGia = donGia;
                noiDTO.soTuyen = soTuyen;
                noiDTO.kmDiDuoc = soKmDiDuoc;
                noiDTO.loai = type;
                //gửi thông điệp đến hành vi control()
                //của đối tượng AddCxControl
                AddCxControl addControl = new AddCxControl();
                addControl.control(noiDTO);
                
//                ChuyenXeNoiThanh cxNoi = new ChuyenXeNoiThanh(maCx, hoTenTx,
//                        soXe, donGia, soTuyen, soKmDiDuoc);
//                dsCxNoiThanh.add(cxNoi);
                
            }
            
            if(type == 2){
                System.out.print("[NOI DEN]:");
                String noiDen = keyboard.nextLine();
                System.out.print("[SO NGAY DI DUOC]:");
                float soNgayDiDuoc = keyboard.nextFloat();
//                ChuyenXeNgoaiThanh cxNgoai = new ChuyenXeNgoaiThanh(maCx, 
//                        hoTenTx, soXe, donGia, 
//                        noiDen, soNgayDiDuoc);
//                dsCxNgoaiThanh.add(cxNgoai);


            }
    }
    
}
