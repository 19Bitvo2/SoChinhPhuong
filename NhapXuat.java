package toanhoc.nhapxuat;

import java.util.Scanner;
//import toanhoc.kiemtra.KiemTra;
import toanhoc.nhapxuat.*;
import toanhoc.main.*;
import toanhoc.kiemtra.*;
/**
 *
 * @author phong
 */
public class NhapXuat {
    public static void nhap() {
        int n;
        System.out.print("Nhap vao so n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        xuat(n);
    }
    public static void xuat(int n){
        for(int i = 1;i<n;i++){
            if(KiemTra.kiemtra(i)){
                System.out.println(i);
            }
        }
    }
}
