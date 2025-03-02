class HazardousWasteCollector extends WasteCollector {
    public void collectWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("hazardous") && container.isFull()) {
            System.out.println("Handling and disposing of hazardous waste carefully.");
        } else {
            super.collectWaste(container);
        }
    }
}