package Electrodomestics;

public class Television extends Electrodomestic {
    private double resolution;
    private boolean dttTuner;
    private final double DEFAULT_RESOLUTION = 20;
    private final boolean DEFAULT_DTT_TUNER = false;

    public Television() {
        super();
        resolution = DEFAULT_RESOLUTION;
        dttTuner = DEFAULT_DTT_TUNER;
    }

    public Television(double priceBase, double weight) {
        super(priceBase, weight);
        resolution = DEFAULT_RESOLUTION;
        dttTuner = DEFAULT_DTT_TUNER;
    }

    public Television(double priceBase, String color, char energeticConsumption, double weight, double resolution, boolean dttTuner) {
        super(priceBase, color, energeticConsumption, weight);
        this.resolution = resolution;
        this.dttTuner = dttTuner;
    }

    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }

    public boolean isDttTuner() {
        return dttTuner;
    }

    public void setDttTuner(boolean dttTuner) {
        this.dttTuner = dttTuner;
    }
}
