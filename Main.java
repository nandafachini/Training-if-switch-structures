package nanda.mypackage;

/** this project has the main goal to train the if and switch structures,
 * avoiding a "dirty" code
 */

public class Main {

    public static void main(String[] args) {

        ifArrow();
        ifGoodWay();
        switchVacation();

        }

    private static void ifArrow() {

/** note that this bloc tends to "fall"to the left, like an arrow,
 * this kind of code is harder to read or comprehend
  */
        int month = 10;

        if (month == 1) {
            System.out.println("January");
        } else {
            if (month == 2) {
                System.out.println("February");
            } else {
                if (month == 3) {
                    System.out.println("March");
                } else {
                    if (month == 4) {
                        System.out.println("April");
                    } else {
                        if (month == 5) {
                            System.out.println("May");
                        } else {
                            if (month == 6) {
                                System.out.println("June");
                            } else {
                                if (month == 7) {
                                    System.out.println("July");
                                } else {
                                    if (month == 8) {
                                        System.out.println("August");
                                    } else {
                                        if (month == 9) {
                                            System.out.println("September");
                                        } else {
                                            if (month == 10) {
                                                System.out.println("October");
                                            } else {
                                                if (month == 11) {
                                                    System.out.println("November");
                                                } else {
                                                    if (month == 12) {
                                                        System.out.println("December");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static void ifGoodWay() {

/** here we have an alternative way to build the code with the same idea;
 * note that the code is straight and better to read
 */

    int month = 10;

    if (month == 1) {
        System.out.println("January");
    } else if (month == 2) {
        System.out.println("February");
    } else if (month == 3) {
        System.out.println("March");
    } else if (month == 4) {
        System.out.println("April");
    } else if (month == 5) {
        System.out.println("May");
    } else if (month == 6) {
        System.out.println("June");
    } else if (month == 7) {
        System.out.println("July");
    } else if (month == 8) {
        System.out.println("August");
    } else if (month == 9) {
        System.out.println("September");
    } else if (month == 10) {
        System.out.println("October");
    } else if (month == 11) {
        System.out.println("November");
    } else if (month == 12) {
        System.out.println("December");
    }



    }

    private static void switchVacation () {
/** here we have build a code using the switch structure, that its main goal is to print "Vacation time!"
 * in case month fits the right conditions, or print "Unfortunately is not vacation time." in case it's not
 */
        String month = "May";

        switch (month) {
            case "December":
            case "July":
            case  "January":
                System.out.println("Vacation time!");
                break;
            default:
                System.out.println("Unfortunately is not vacation time.");
        }
    }
}

