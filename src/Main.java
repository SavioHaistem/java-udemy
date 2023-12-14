import entities.LegalPerson;
import entities.Person;
import entities.PhysicalPerson;

public class Main {
    public static void main(String[] args) {
        Person user = new PhysicalPerson("maria",50000.0,200.0);
        System.out.println(user.calculateTax());

        Person business = new LegalPerson("babadoforte",80000.0,11);
        System.out.println(business.calculateTax());
    }
}