package dev.wilders;

public class ITPersonRepair {

    public static String repairName(ITPerson person) {
        // Get the name of the ITPerson, repair it and return the new name
        // EG: person.getName() -> "Super_Admin" -> return "Super Admin"

        ITPerson corruptedName = person;
        // System.out.println(corruptedName.getName());
        String[] temp = corruptedName.getName().split("_");
        String firstPart = temp[0];
        String secondPart = temp[1];
        // System.out.println(firstPart + " " + secondPart);
        return (firstPart + " " + secondPart);
    }
}
