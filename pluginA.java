
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author mengjinglu
 */
public class pluginA extends myplugin {
    public void whoSaysHello(){
        System.out.println("A says hello!");
    }
    
    @Override
    public void whoSaysBye(){
        System.out.println("A says bye!");
    }
}
