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
public class MercedesOrder implements Observer {

    private Observable observable;

    public MercedesOrder() {
    }

    public void setObservable(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void notify(String message) {
        System.out.println(" Mercedes car"+message);
    }

    public void removeObserver(){
        observable.removeObserver(this);
    }

}