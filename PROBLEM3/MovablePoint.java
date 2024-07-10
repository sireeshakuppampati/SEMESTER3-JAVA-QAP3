public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {
        super();
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getters
    public float getXSpeed() { return xSpeed; }
    public float getYSpeed() { return ySpeed; }

    // Setters
    public void setXSpeed(float xSpeed) { this.xSpeed = xSpeed; }
    public void setYSpeed(float ySpeed) { this.ySpeed = ySpeed; }

    // Set both xSpeed and ySpeed
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Get both xSpeed and ySpeed
    public float[] getSpeed() {
        return new float[] {xSpeed, ySpeed};
    }

    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + "," + ySpeed + ")";
    }
}
