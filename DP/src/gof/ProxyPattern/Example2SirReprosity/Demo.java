/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.ProxyPattern.Example2SirReprosity;

/**
 *
 * @author fa20-bse-047
 */
public class Demo {
    public static void main(String[] args) {

        // 1. Proxy Pattern as Smart Reference by action verification
        //    Action: Only display image if supported type otherwise fake
        Image image = new ProxyImage("test_10mb.jpg","png");
        image.display("jpg");
        image.display("png");
        System.out.println("");

        // 2. Remote Proxy Image: If source is correct then load from it the real image,
        // otherwise fake image.
        RemoteProxyImage img = new RemoteProxyImage("subexpert.com");
        img.display("abc.com");
        img.display("subexpert.com");

        // 3. Protected Proxy: Real Image should load for authenticated user only
        Image protectedImage = new ProtectedProxyImage("Assad");
        protectedImage.display("png");
        protectedImage = new ProtectedProxyImage("ali");
        protectedImage.display("png");
    }
}