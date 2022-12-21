interface Tossable {
    void toss();
}

abstract class Ball implements Tossable {
    String brandName;

    public Ball(String brandName) {
        this.brandName = brandName;
    }

    abstract String getBrandName();

    abstract void bounce();
}

class Baseball extends Ball {

    public Baseball(String brandName) {
        super(brandName);
    }

    @Override
    public void toss() {

    }

    @Override
    String getBrandName() {
        return this.brandName;
    }

    @Override
    void bounce() {

    }

}

class Football extends Ball {

    public Football(String brandName) {
        super(brandName);
    }

    @Override
    public void toss() {

    }

    @Override
    String getBrandName() {
        return this.brandName;
    }

    @Override
    void bounce() {

    }

}

class Rock implements Tossable {

    @Override
    public void toss() {

    }

}

public class _3_Sports {
    public static void main(String[] args) {

    }
}
