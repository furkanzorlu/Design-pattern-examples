/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceng.anadolu.bim492;



/**
 *
 * @author HP
 */
public class BmwOrder  implements Observer{

	private Observable observable;

    @Override
    public void notify(String message) {
        System.out.println(" Bmw car "+message);
    }

    public void removeObserver(){
        observable.removeObserver(this);
    }

	
}
