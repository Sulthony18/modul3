/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

/**
 *
 * @author ASUS
 */
public class Gajah extends Hewan {

    public static void testClassMethod() {
        System.out.println("the class method in Hewan...");
    }

    public void testInstanceMethod() {
        System.out.println("The instance method in Gajah...");
    }

    public static void main(String[] args) {
        Gajah myGajah = new Gajah();
        Hewan myHewan = new Hewan();
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
}
