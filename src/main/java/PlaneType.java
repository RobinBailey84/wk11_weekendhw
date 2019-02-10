public enum PlaneType {
    AIRBUSA380(560, 850),
    BOEING737(200, 99),
    BOEING747(450, 330),
    AIRBUSA300(200, 120),
    BRITISHAIRWAYSBAC1(150, 80),
    TESTPLANE(100, 2);

    private final int weight;
    private final int capacity;

    PlaneType(int weight , int capacity) {this.weight = weight; this.capacity = capacity; }

    public int getWeight() { return weight; }
    public int getCapacity() { return capacity; }

}
