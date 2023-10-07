
package gof.decorater.filedecoraters;

/**
 *
 * @author elitebook g3
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}