/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.Prototype.LabWork;

/**
 *
 * @author fa20-bse-047
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());

        
        Avatar fishAvatar = new Avatar();
        fishAvatar.setAvatarType("Fish");
        Avatar clonedFishAvatar = (Avatar) fishAvatar.clone();

        Avatar humanAvatar = new Avatar();
        humanAvatar.setAvatarType("Human");
        Avatar clonedHumanAvatar = (Avatar) humanAvatar.clone();

        
        System.out.println("Fish Avatars are equal: " + fishAvatar.equals(clonedFishAvatar));
        System.out.println("Human Avatars are equal: " + humanAvatar.equals(clonedHumanAvatar));
    }
}