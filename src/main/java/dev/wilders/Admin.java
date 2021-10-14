package dev.wilders;

import java.time.LocalDate;

public class Admin extends ITPerson {

    protected LocalDate lastCertified;

    public Admin(String name, LocalDate lastCertified) {
        super(name);
        this.lastCertified = lastCertified;
    }

    public void setLastCertified(LocalDate lastCertified) {
        this.lastCertified = lastCertified;
    }

    @Override
    public boolean hasReadAccess() {
        // Add logic to evaluate Read access for Admin here.
        // => no logic needed because Admin has always read access
        return true;
    }

    @Override
    public boolean hasWriteAccess() {
        // Add logic to evaluate Write access for Admin here.
        if (this.lastCertified.isAfter(LocalDate.now().minusYears(1))) {
            return true;
        } else {
            return false;
        }
    }
}
