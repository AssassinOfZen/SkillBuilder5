/**
 * This class provides various Skill Builder 5 - Array
 * exercises.
 *
 * @author (you)
 * @version (a version number or a date)
 */
public class SkillBuilder5 {
    /**
     * Calculates the prefix average of array data and returns the prefex average
     * in a new array.  The parameter data is never touched and left intact.
     *
     * @param data array of double values on which to calculate the prefix average.
     * @return returns an array containing the prefix average values calculated
     * from data.
     */
    public static double[] prefixAverage(double[] data) {
        //TODO: replace this line with your code.
        int length = data.length;
        double[] prefixAverage = new double[length];
        double sum = 0;
        for (int i = 0; i < length; i++) {
            prefixAverage[i] = (data[i] + sum) / (i + 1);
            sum = sum + data[i];
        }
        return prefixAverage;
    }

    /**
     * Finds the location in array anArray where value is located.  If anArray
     * does not contain an element equal to value a -1 is returned; otherwise a
     * positive or zero index value is returned.
     *
     * @param searchValue value to look for in the array
     * @param anArray     array in which to look for a value
     * @returns index of the value in the array; -1 otherwise.
     */
    public static int indexOf(int searchValue, int[] anArray) {
        //TODO: replace this line with your code.
        int result = -1;
        for (int i = 0; result == -1 && i < anArray.length; i++) {
            if (searchValue == anArray[i]) {
                result = i;
            }
        }
        return result;
    }


    /**
     * Finds the location in array anArray where string s is located.  If anArray
     * does not contain an element equal to s a -1 is returned; otherwise a
     * positive or zero index value is returned.
     *
     * @param s       a string to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the string s in the array; -1 otherwise.
     */
    public static int indexOf(String s, String[] anArray) {
        //TODO: replace this line with your code.
        int result = -1;
        for (int i = 0; result == -1 && i < anArray.length; i++) {
            if (s.equals(anArray[i])) {
                result = i;
            }
        }
        return result;
    }

    /**
     * Finds all occurrence of string s in anArray and removes them, returning
     * a new array with all occurrences of s removed.
     *
     * @param s       string to search for in array
     * @param anArray array in which to search and remove s
     * @return An array with all occurrences of s removed.
     */
    public static String[] remove(String s, String[] anArray) {
        // add your code here
        int counter = 0;
        int i;
        for (i = 0; i < anArray.length; i++) {
            if (!s.equals(anArray[i])) {
                counter += 1;
            }
        }
        String[] newAnArray = new String[counter];
        i = 0;
        for (int ii = 0; ii < anArray.length && i < newAnArray.length; ii++) {
            if (!s.equals(anArray[ii])) {
                newAnArray[i] = anArray[ii];
                i += 1;
            } else if (anArray[ii].equals(s)) {
                ii += 1;
                newAnArray[i] = anArray[ii];
                i += 1;
                }
            }
            return newAnArray;
        }


        /**
         * Reverses an array of integers.
         * @param anArray the array whose contents should be reversed.
         */
        public static void reverse ( int[] anArray)
        {
            // add your code here
            int[] reversed = new int[anArray.length];
            int i = 0;
            for (int ii = anArray.length-1; ii >= 0; ii--){
                reversed[i] = anArray[ii];
                i += 1;
            }
            for (int iii = 0; iii < anArray.length; iii++){
                anArray[iii] = reversed[iii];
            }
        }
    }
