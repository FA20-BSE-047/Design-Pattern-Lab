/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.ProxyPattern.LabTask;

import gof.ProxyPattern.Example2SirReprosity.Image;

/**
 *
 * @author fa20-bse-047
 */
public class UnsupportedImageProxy implements Image {

  private String fileName;

  public UnsupportedImageProxy(String fileName) {
    this.fileName = fileName;
  }

    

  public void display() {
    System.out.println("Unsupported image format: " + fileName);
  }

    @Override
    public void display(String imageType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}