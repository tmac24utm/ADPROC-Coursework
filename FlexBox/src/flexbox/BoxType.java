package flexbox;

/**
 * @author 777900
 */
public class BoxType {

    private double baseCost = 0.0;
    private double finalCost = 0.0;
    private String ComboBoxGrade = "0";
    private float area = (float) 0.0;
    private String ColourPicker = "0";
    private int boxType = 0;
    private String ReinforcedBoxBottom = "No";
    private String ReinforcedBoxCorner = "No";
    private String SealableBox = "No";

    /**
     * Initialises the parameters
     *
     * @param area
     * @param cbg
     * @param cp
     * @param rbb
     * @param rbc
     * @param sb
     */
    public BoxType(float area, String cbg, String cp, String rbb, String rbc, String sb) {
        this.area = area;
        this.ComboBoxGrade = cbg;
        this.ColourPicker = cp;
        this.ReinforcedBoxBottom = rbb;
        this.ReinforcedBoxCorner = rbc;
        this.SealableBox = sb;
    }
   
    /**
     * Method to calculate the boxType
     */
    public void createBox() {  
        double percentageAddon = 0.0;
        switch (ComboBoxGrade) {
            case "1":
                baseCost += (area * 0.5);
                break;
            case "2":
                baseCost += (area * 0.6);
                break;
            case "3":
                baseCost += (area * 0.72);
                break;
            case "4":
                baseCost += (area * 0.9);
                break;
            case "5":
                baseCost += (area * 1.4);
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
                percentageAddon += (baseCost * 0.13);
                break;
            case "2":
                if ("2".equals(ComboBoxGrade)) {
                    boxType = 3;
                }
                if ("3".equals(ComboBoxGrade) || "4".equals(ComboBoxGrade) || "5".equals(ComboBoxGrade)) {
                    boxType = 5;
                }
                percentageAddon += (baseCost * 0.16);
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
                percentageAddon += (baseCost * 0.14);
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

                percentageAddon += (baseCost * 0.10);
                break;
            case "No":
                if (boxType == 5) {
                    boxType = 6;
                }
                break;
        }

        switch (SealableBox) {
            case "Yes":
                percentageAddon += (baseCost * 0.08);
                break;
            case "No":
                break;
        }
        
        this.finalCost = this.baseCost + percentageAddon;
    }

    /**
     * @return cost
     */
    public double getCost() {
        return this.finalCost;
    }

    /**
     * @return boxType
     */
    public int getType() {
        return this.boxType;
    }
}