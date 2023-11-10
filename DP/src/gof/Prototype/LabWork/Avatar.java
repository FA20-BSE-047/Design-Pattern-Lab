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
public class Avatar implements Cloneable {

    private String avatarType;

    public String getAvatarType() {
        return avatarType;
    }

    public void setAvatarType(String avatarType) {
        this.avatarType = avatarType;
    }

    @Override
    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }

    public boolean equals(Avatar otherAvatar) {
        return this.avatarType.equals(otherAvatar.avatarType);
    }
}