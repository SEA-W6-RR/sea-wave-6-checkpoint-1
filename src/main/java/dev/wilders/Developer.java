package dev.wilders;

import java.time.LocalDate;
import java.time.Period;

public class Developer extends ITPerson {

    protected LocalDate employmentDate;

    public Developer(String name, LocalDate employmentDate) {
        super(name);
        this.employmentDate = employmentDate;
    }

    @Override
    public boolean hasReadAccess() {
        // Add logic to evaluate Read access for Developer here.
        // => no logic needed because Developer has always read access
        return true;
    }

    @Override
    public boolean hasWriteAccess() {
        // Add logic to evaluate Write access for Developer here.
        if (Period.between(this.employmentDate, LocalDate.now().minusMonths(6)).getDays() >= 0) {
            return true;
        } else {
            return false;
        }
    }
}
