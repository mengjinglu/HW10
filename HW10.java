


import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 *
 * @author mengjinglu
 */
public class HW10 {

    
    public static void main(String[] args) throws  Throwable {
        
        File pluginFile = new File("/Users/mengjinglu/HW10/src/plugin");
        //pluginFile.createNewFile();
        File[] pluginlist = pluginFile.listFiles();
        
        System.out.println("Plu1gin:");
        for(int i = 0; i < pluginlist.length; i++){
            System.out.println((i+1)+". "+ pluginlist[i].getName());
        }
        
        //Users choose which one to plug in
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose a plugin that you want to use:");
        int num = scan.nextInt();
        //Test for valid input
        if(num < 0|| num > pluginlist.length){
            System.out.println("Invalid input!");
            System.exit(0);
        }
        //Get class name, and remove ".java"
        String pluginName = pluginlist[num - 1].getName().toString();
        pluginName = pluginName.replace(".java", "");        
        Class<?> myclass = Class.forName(pluginName);
        Object ins = myclass.newInstance();
        Method[] method = myclass.getMethods();
        //run all methods in the class that picked by user
        for(int i  = 0; i < 2; i++){
            method[i].invoke(ins);
        }
    }
    
}
