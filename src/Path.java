public enum Path {
    WEAPONS("src/Files/Weapons.txt");
    DIALOGUE("src/Files/Dialogue.txt");
    // Add Narrator Path
    String path;

    Path(String path) {
        this.path = path;
    }
}
