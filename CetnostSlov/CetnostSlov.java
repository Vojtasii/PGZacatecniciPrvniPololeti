public class CetnostSlov {
    public static void main(String[] args) throws java.io.IOException {
        String slovo;
     	Stringcetnosti scetn = new Stringcetnost();
        while (true) {
            int znak = System.in.read();
            if (znak == -1) {
                // Konec vstupu.
                break;
            }
            char pismeno = (char) znak;
 
            if (pismeno == ' ') {
                // Zapocitej slovo
		
            } else {
                slovo = slovo + pismeno;
            }
            ...
        }
        ...
}
}
