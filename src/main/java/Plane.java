import org.junit.Before;

public class Plane {

    private PlaneType plane;


    public Plane(PlaneType plane){
        this.plane = plane;
    }


    public PlaneType getPlane() {
        return this.plane;
    }

    public int getWeightFromEnum(){
        return this.plane.getWeight();
    }

    public int getCapacityFromEnum(){
        return this.plane.getCapacity();
    }
}
