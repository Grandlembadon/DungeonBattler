public enum Path {
    WEAPONS("src/Files/Weapons.txt"),
    DIALOGUE("src/Files/Dialogue.txt"),
    CLASSES("src/Files/ClassInfo.txt"),
    SKILLS("src/Files/SKillLIst.txt"),
    ENEMYWEAPONS("src/Files/EnemyWeaponList.txt");
    String path;

    Path(String path) {
        this.path = path;
    }

}
