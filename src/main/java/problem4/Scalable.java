/**
 * Interface that can be scaled
 * Any class that implements this must provide an implementation of the scale method
 */

package problem4;

public interface Scalable {
    /**
     * Scales the object by the given factor
     * @param factor The scaling factor to apply
     */
    void scale(double factor);
}