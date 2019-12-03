package DataEncapsulation;

public class DataEncapsulation {

    public static void main(String[] args) {

        Company company = new Company();
        // company.name = "Maison Neumann";
        company.setName("Maison Neumann");
        // company.employees.add("Kathia");
        // company.employees.add("Anthony");
        company.addEmployees("Kathia");
        company.addEmployees("Anthony");
        company.addEmployees(null);

        company.printSorted();

        // company.name = null;
        // company.printSorted();

        // company.employees = null;
        // company.employees.add("Sabine");
        company.printSorted();
    }
}
