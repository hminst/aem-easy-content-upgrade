aecu.contentUpgradeBuilder()
    .forDescendantResourcesOf("/content/we-retail/us/en")
    .filterByNodeName("hero_image")
    .printPath()
    .run()
