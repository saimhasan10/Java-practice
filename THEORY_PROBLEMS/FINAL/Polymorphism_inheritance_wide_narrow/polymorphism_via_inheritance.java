
class Holiday {
    void celebrate() {
        System.out.println("Celebrating a holiday");
    }
}

class EidDay extends Holiday {

    @Override
    void celebrate() {
        System.out.println("Celebrating Eid Day");
    }
}

public class polymorphism_via_inheritance {
    public static void main(String[] args) {
        Holiday holiday = new Holiday();
        holiday.celebrate();

        System.out.println("---");
        // now pointing to the eid day
        holiday = new EidDay();
        holiday.celebrate();
    }
}
