public enum Path {
    WEAPONS("src/Files/Weapons.txt"),
    DIALOGUE("src/Files/Dialogue.txt"),
    CLASSES("src/Files/ClassInfo.txt");
    // Add Narrator Path
    String path;

    Path(String path) {
        this.path = path;
    }

}
