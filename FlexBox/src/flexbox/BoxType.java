/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flexbox;

/**
 *  Let's pretend we know what is going on
 * 
 *  FlexBoxUI (possibly calls the BoxType class to decide which is needed)
 *      -> boxType.getBoxRequired(height, width etc..) - would return like boxType1 etc..
 *      -> Then you can create a new box via the boxType class which would already have the 
 *         required box type defined, so it'd be as simple as calling boxType.createBox() (possibly)
 *         then being able to do the boxType.getType() etc to check if the box is proper or not
 *         Not sure if this makes sense or not but um
 * 
 *  BoxType (main class)
 *      -> boxType1 (sub class, extends main class)
 *      -> boxType2 (sub class, extends main class)
 *      -> boxType3 (sub class, extends main class)
 *      -> boxType4 (sub class, extends main class)
 *      -> boxType5 (sub class, extends main class)
 * 
 * Within boxType itself there will be a method like getType, so you'd be able to 
 * still compare by doing like
 * boxType.getType() 
 * 
 **/


/**
 *
 * @author danni
 */
public class BoxType {
    private double cost = 0.0;
    private String ComboBoxGrade = "0";
    private float area = (float)0.0;
    private String ColourPicker = "0";
    private int boxType = 0;
    private String ReinforcedBoxBottom = "No"; // Just set it to no by default is easier
    private String ReinforcedBoxCorner = "No";
    private String SealableBox = "No";
    
    // Constructor
    public BoxType(){
        area = (float)10.0; // that'll do for now
        ComboBoxGrade = "1"; // just to test
        
    }
    
    // Param Constructor
    public BoxType(float area, String cmg, String cp, String rbb, String rbc, String sb){
        this.area = area;
        this.ComboBoxGrade = cmg;
        this.ColourPicker = cp;
        this.ReinforcedBoxBottom = rbb;
        this.ReinforcedBoxCorner = rbc;
        this.SealableBox = sb;
    }
    
    public void createBox(){
        switch (ComboBoxGrade) {
            case "1":
                cost = (area * 0.5);
                break;
            case "2":
                cost = (area * 0.6);
                break;
            case "3":
                cost = (area * 0.72);
                break;
            case "4":
                cost = (area * 0.9);
                break;
            case "5":
                cost = (area * 1.4);
                break;
        }
        
        switch (ColourPicker) {
            case "0":
                if ("1".equals(ComboBoxGrade) || "2".equals(ComboBoxGrade) || "3".equals(ComboBoxGrade)) {
                    boxType = 1;
                } else {
                    boxType = 6; //Setting it to 6 returns an error.
                }
                //Result1.setText(String.valueOf(result));
                break;
            case "1":
                if ("2".equals(ComboBoxGrade) || "3".equals(ComboBoxGrade) || "4".equals(ComboBoxGrade)) {
                    boxType = 2;
                } else {
                    boxType = 6;
                }
                //Result1.setText(String.valueOf(Math.round(result * 1.13)));
                cost = (cost * 1.13);
                break;
            case "2":
                if ("2".equals(ComboBoxGrade)) {
                    boxType = 3;
                }
                if ("3".equals(ComboBoxGrade) || "4".equals(ComboBoxGrade) || "5".equals(ComboBoxGrade)) {
                    boxType = 5;
                }
                //Result1.setText(String.valueOf(Math.round((result * 1.16))));
                cost = (cost * 1.16);
                break;
        }
        
        switch (ReinforcedBoxBottom) {
            case "Yes":
                if (boxType == 1) {
                    boxType = 6;
                }
                if (boxType == 2) {
                    boxType = 6;
                }
                if (boxType == 3) {
                    boxType = 4;
                }
                cost = (cost * 1.14);
                //Result1.setText(String.valueOf((result)));
                break; // wait what does this bit do? why do you change the box type?  Only certain types can have reinforced bottom, so it checks what type it is 
                // if is the correct type it moves it to a type that has a reinforced bottom, or if its wrong it gives an error boxType = 6 prints an error
                // oh i getcha
            case "No":
                if (boxType == 3) {
                    boxType = 3;
                }
                if (boxType == 4 || boxType == 5) {
                    boxType = 6;
                }
                //Result1.setText(String.valueOf((result)));
                break;
        }
        
        switch (ReinforcedBoxCorner) {
            case "Yes":
                if (boxType != 5) {
                    boxType = 6;
                }

                cost = (cost * 1.10);
                //Result1.setText(String.valueOf((result)));
                break;
            case "No":
                if (boxType == 5) {
                    boxType = 6;
                }
                //Result1.setText(String.valueOf((result)));
                break;
        }

        //String SealableBox = (String) SealableTopsBox.getSelectedItem();
        switch (SealableBox) {
            case "Yes":
                cost = (cost * 1.08);
                //Result1.setText(String.valueOf((result)));
                break;
            case "No":
                //Result1.setText(String.valueOf((result)));
                break;
        }
    }
    
    // Now you should be able to do
    // BoxType box = new BoxType();
    // Then box.createBox();
    // Then do box.getCost();
    
    // It's like the initial create a box / OOP way of doing it? Lets test D:
    // That looks right because 10*0.5=5
    // ok imstarting to get it now. but how do we move things from ui to here
    // Lets give it a go ;)
    //kill mefirst pls
    //wait it should be as easy as putting everything in createBox
    // I think let's try
    
    
    public double getCost(){
        return this.cost;
    }
    
    public int getType(){
        return this.boxType;
    }
}
