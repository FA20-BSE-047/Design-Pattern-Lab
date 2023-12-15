/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.State;

/**
 *
 * @author elitebook g3
 */



public class StopState extends State {

    public StopState(Player player) {
        super(player);
        UI.changeLabelState("Stopped");
    }

    @Override
    public String onLock() {
        player.changeState(new LockedState(player));
        player.setLocked(true);
        return "Locked...";
    }

    @Override
    public String onPlay() {
        player.changeState(new ReadyState(player));
        player.setLocked(false);
        return "Ready...";
    }

    @Override
    public String onNext() {
        return "Stopped...";
    }

    @Override
    public String onPrevious() {
        return "Stopped...";
    }
}