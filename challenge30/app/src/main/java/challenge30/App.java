/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge30;

import challenge30.structure.HashMap;

public class App {

    public static void main(String[] args) {
        HashMap<String, String> hashCode = new HashMap<>();
        hashCode.set("0", "Mohammad");
        hashCode.set("1", "emad");
        hashCode.set("2", "sara");
        hashCode.set("3", "iyad");
        System.out.println(hashCode.get("3"));
        System.out.println(hashCode.contains("1"));
//        System.out.println(hashCode.keys());
    }
}
