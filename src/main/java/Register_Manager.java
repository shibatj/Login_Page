
import java.util.ArrayList;
import javax.swing.JOptionPane;


    public class Register_Manager {
        private static ArrayList<Register> reg = new ArrayList<>();

        public static void registerUser(String usr, String pass, String gender){
            Register new_reg = new Register(usr, pass, gender);
            reg.add(new_reg);
        }
    
    public static boolean isUsernameTaken(String usr) {
        for (Register r : reg) {
            if (r.getUsr().equalsIgnoreCase(usr)) {
                return true;
            }
        }
        return false;
    }

    public static Register searchUser(String usr, String pass) {
        for (Register r : reg) {
            if (r.getUsr().equals(usr) && r.getPass().equals(pass)) {
                JOptionPane.showMessageDialog(null, "username correct");
                return r;
            }
        }
        JOptionPane.showMessageDialog(null, "username not found, try again?");
        return null;
    }

}
