class OrganicWasteCollector extends WasteCollector {
    public void collectWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("organic") && container.isFull()) {
            System.out.println("Collecting and disposing of organic waste.");
        } else {
            super.collectWaste(container);
        }
    }
}