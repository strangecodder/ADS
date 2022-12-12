package pract_4.task2;

public enum sizes {
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);
    private int euroSize;

    sizes() {
    }

    sizes(int euroSize) {
        this.euroSize = euroSize;
    }
}