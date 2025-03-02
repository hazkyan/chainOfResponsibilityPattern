class WasteContainer {
    private String type;
    private int capacity;
    private boolean isFull;

    public WasteContainer(String type, int capacity, boolean isFull) {
        this.type = type;
        this.capacity = capacity;
        this.isFull = isFull;
    }

    public String getType() { return type; }
    public int getCapacity() { return capacity; }
    public boolean isFull() { return isFull; }
}