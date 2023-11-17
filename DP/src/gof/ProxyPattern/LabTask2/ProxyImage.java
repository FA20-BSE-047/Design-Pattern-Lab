/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.ProxyPattern.LabTask2;

import gof.ProxyPattern.LabTaskProxy.Image;

/**
 *
 * @author fa20-bse-047
 */
public abstract class ProxyImage implements Image {

  private RealImage realImage;
  private String fileName;

  public ProxyImage(String fileName) {
    this.fileName = fileName;
  }

  public void display() {
    String extension = fileName.substring(fileName.lastIndexOf(".") + 1);
    if (!extension.equals("jpg")) {
     
    } else {
      if (realImage == null) {
        realImage = new RealImage(fileName);
      }
    }
    realImage.display();
  }

    private static class RealImage {

        public RealImage(String fileName) {
        }

        private void display() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}