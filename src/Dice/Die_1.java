package Dice;

 /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Class        Die
 * File         Die.java
 * Description  A class representing a die used in a rolling dice simulation.
 * Project      Dice Simulation
 * Environment  PC, Windows 10, NetBeans IDE 11.3, jdk 1.8.0_241
 * Date         11/23/2020
 * @author      <i>FALLDIUSA ESTAVAN</i>
 * @version:    %1% %2%
 * @see:        javax.swing
 * @see:        java.text.DecimalFormat;
 * </pre>
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class Die_1 
{
    // Class instance variables
    int num = 0; 
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor  Die()
     * Description  Default constructor. Sets die face to 1.
     * @author      <i>FALLDIUSA ESTAVAN</i>
     * @see         java.awt.Toolkit
     * Date         11/24/2020
     *</pre>
     * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Die_1()
    {
            num = 1;
    }  
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor  Die()
     * Description  Overloded constructor. Sets die face to num.
     * @param       num int
     * @author      <i>FALLDIUSA ESTAVAN</i>
     * @see         java.awt.Toolkit
     * Date         11/24/2020
     *</pre>
     * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Die_1(int num)
    {
        this.num = num;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       roll()
     * Description  method to rolls a die--returns the number rolled.
     * @author      <i>FALLDIUSA ESTAVAN/i>
     * @see         java.awt.Toolkit
     * @return      num int 1-6
     * Date         11/24/2020
     *</pre>
     * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static int roll()
    {
        return (int)Math.floor(6 * Math.random() + 1);
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       roll()
     * Description  Getter method to return the number on the die.
     * @author      <i>FALLDIUSA ESTAVAN</i> 
     * @see         java.awt.Toolkit
     * @return      num int 1-6
     * Date         11/24/2020
     *</pre>
     * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public int getSide()
    {
        return num;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       roll()
     * Description  Setter method to set the number on the die with num.
     * @param       num int
     * @author      <i>FALLDIUSA ESTAVAN</i>
     * @see         java.awt.Toolkit*
     * Date         11/24/2020
     *</pre>
     * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setSide(int num)
    {
        this.num = num;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       toString()
     * Description  Method to display die.
     * @author      <i>FALLDIUSA ESTAVAN</i>
     * @see         java.awt.Toolkit
     * Date         11/24/2020
     *</pre>
     * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public String toString()
    {
        return "Die{" + "num=" + num + '}';
    }
}
