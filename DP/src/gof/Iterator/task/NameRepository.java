/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.Iterator.task;

/**
 *
 * @author elitebook g3
 */
public class NameRepository implements Container {
    public String[] names = {"Gojo", "Itadori", "Megumi", "Nobara", "Sukuna", "Satoru", "Kento", "Yuta", "Maki", "Panda", "Toge", "Kugisaki", "Todo", "Geto", "Mahito", "Jogo"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {

            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }

        @Override
        public boolean hasPrevious() {
            return index >= 0;
        }

        @Override
        public Object previous() {
            return names[index--];
        }

        @Override
        public Object moveTofirst() {
            index = 0;
            return names[0];
        }

        @Override
        public Object moveTolast() {
            index = names.length - 1;
            return names[index];
        }
    }
}