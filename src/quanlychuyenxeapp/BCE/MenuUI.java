package quanlychuyenxeapp.BCE;

import java.util.Scanner;

/**
 *
 * @author phuoc
 */
public class MenuUI {
    
    //state
    //constructors
    //behavior
    public void getChoices(){
        Scanner keyboard = new Scanner(System.in);
        int choice;
        while(true){
            printMenu();
            System.out.print("->");
            choice = keyboard.nextInt();
            if(choice == 1){
                ThongTinCxUI infoCxUI = new ThongTinCxUI();
                //gửi thông điệp
                infoCxUI.getCxInfo();
            }

        }
    }
    
    private void printMenu(){
        System.out.println("~~~~~~~~~~~~~ Menu ~~~~~~~~~~~~~");
        System.out.println("1. NHAP THONG TIN CHUYEN XE");
        System.out.println("2. IN DANH SACH CHUYEN XE");
        System.out.println("3. XEM CHI TIET THONG TIN MOT CX");
        System.out.println("4. TINH TONG TIEN TUNG LOAI");
        System.out.println("5. THOAT CHUONG TRINH");
        System.out.println("~~~~~~~~~~~~~ Menu ~~~~~~~~~~~~~~");
    }
    
}
