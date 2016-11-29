package flexbox;

/**
 * @author tom_m
 * @author danni
 */
public class BoxType {

    private double cost = 0.0;
    private String ComboBoxGrade = "0";
    private float area = (float) 0.0;
    private String ColourPicker = "0";
    private int boxType = 0;
    private String ReinforcedBoxBottom = "No";
    private String ReinforcedBoxCorner = "No";
    private String SealableBox = "No";

    /*
    * Constructor for class BoxType
    */
    public BoxType() {
        area = (float) 10.0;
        ComboBoxGrade = "1";

    }

    /*
    * Initialises the paramaters
    */
    public BoxType(float area, String cmg, String cp, String rbb, String rbc, String sb) {
        this.area = area;
        this.ComboBoxGrade = cmg;
        this.ColourPicker = cp;
        this.ReinforcedBoxBottom = rbb;
        this.ReinforcedBoxCorner = rbc;
        this.SealableBox = sb;
    }

    public void createBox() {
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
                break;
            case "1":
                if ("2".equals(ComboBoxGrade) || "3".equals(ComboBoxGrade) || "4".equals(ComboBoxGrade)) {
                    boxType = 2;
                } else {
                    boxType = 6;
                }
                cost = (cost * 1.13);
                break;
            case "2":
                if ("2".equals(ComboBoxGrade)) {
                    boxType = 3;
                }
                if ("3".equals(ComboBoxGrade) || "4".equals(ComboBoxGrade) || "5".equals(ComboBoxGrade)) {
                    boxType = 5;
                }
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
                break;
            case "No":
                if (boxType == 3) {
                    boxType = 3;
                }
                if (boxType == 4 || boxType == 5) {
                    boxType = 6;
                }
                break;
        }

        switch (ReinforcedBoxCorner) {
            case "Yes":
                if (boxType != 5) {
                    boxType = 6;
                }

                cost = (cost * 1.10);
                break;
            case "No":
                if (boxType == 5) {
                    boxType = 6;
                }
                break;
        }

        switch (SealableBox) {
            case "Yes":
                cost = (cost * 1.08);
                break;
            case "No":
                break;
        }
    }

    public double getCost() {
        return this.cost;
    }

    public int getType() {
        return this.boxType;
    }
}