package Controllers;


import Models.*;
import BusinessLogic.*;
import Views.*;
import java.util.*;

public class calControl {
    private calLogic log;
    private calModel mod;
    private cmd view;
    private calControl() {
        mod = new calModel();
        log = new calLogic();
        view = new cmd();
        Scanner sc = new Scanner(System.in);

        while(true){
            mod.setExpr(view.getExp());
            mod.setResult(log.cal(mod.getExpr()));
            view.display(mod.getResult());
            System.out.println("Continue(Y/N):");
            String choice = sc.nextLine();
            if(choice.equals("N") || choice.equals("n")) {
                System.out.println("End.");
                break;
            }
        }
    }
    public static void main(String args[]) {
        calControl calC = new calControl();
    }
}
