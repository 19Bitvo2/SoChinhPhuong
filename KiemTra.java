package toanhoc.kiemtra;

public class KiemTra {
    
    public static boolean kiemtra (int n) {
        
	int tam = (int)Math.sqrt(n);
        
	if (tam* tam== n) {
		return true;
	}
	else {
            return false;
	}
    }
}
