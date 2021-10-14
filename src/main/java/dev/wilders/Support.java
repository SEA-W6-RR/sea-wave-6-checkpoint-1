package dev.wilders;

public class Support extends ITPerson {

    protected int level;

    public Support(String name, int level) {
        super(name);
        this.level = level;
    }

    @Override
    public boolean hasReadAccess() {
        // Add logic to evaluate Read access for Support here.
        if (this.level == 0) {
            return false;
        } else if (this.level == 1) {
            return true;
        } else if (this.level == 2){
            return true;
        } else {
            System.out.println("undefined level");
            return false;
        }
    }

    @Override
    public boolean hasWriteAccess() {
        // Add logic to evaluate Write access for Admin here.
        if (this.level == 0) {
            return false;
        } else if (this.level == 1) {
            return false;
        } else if (this.level == 2){
            return true;
        } else {
            System.out.println("undefined level");
            return false;
        }
    }
}
