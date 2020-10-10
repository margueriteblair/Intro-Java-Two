public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public void setBaseSalary(final int baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("salary cannot be 0 or less");
            this.baseSalary = baseSalary;
        }

        public int getBaseSalary() {
            return baseSalary;
        }

        public int getHourlyRate(){
            return hourlyRate;
        }

        public void setHourlyRate(final int hourlyRate) {
            if (hourlyRate <= 0) {
                throw new IllegalArgumentException("Hourly rate cannot be less than 0.");
            }
            this.hourlyRate = hourlyRate;
        }


    }

    public int calculateWage(final int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
}