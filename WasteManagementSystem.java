public class WasteManagementSystem {
    public static void main(String[] args) {
        WasteCollector organicCollector = new OrganicWasteCollector();
        WasteCollector recyclableCollector = new RecyclableWasteCollector();
        WasteCollector hazardousCollector = new HazardousWasteCollector();

        organicCollector.setNextCollector(recyclableCollector);
        recyclableCollector.setNextCollector(hazardousCollector);

        // Create waste containers
        WasteContainer organicBin = new WasteContainer("organic", 50, true);
        WasteContainer recyclableBin = new WasteContainer("recyclable", 30, true);
        WasteContainer hazardousBin = new WasteContainer("hazardous", 10, true);

        // Trigger waste collection
        organicCollector.collectWaste(organicBin);
        organicCollector.collectWaste(recyclableBin);
        organicCollector.collectWaste(hazardousBin);
    }
}
