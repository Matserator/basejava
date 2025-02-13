package ru.javawebinar.basejava;

import ru.javawebinar.basejava.model.Resume;
import ru.javawebinar.basejava.storage.ArrayStorage;
import ru.javawebinar.basejava.storage.Storage;

/**
 *
 * Test for ArrayStorage
 */
public class MainArray {
    static ArrayStorage arrayStorage = new ArrayStorage();

    public static void main(String[] args) {
        Resume r1 = new Resume();
        r1.setUuid("uuid1");
        Resume r2 = new Resume();
        r2.setUuid("uuid2");
        Resume r3 = new Resume();
        r3.setUuid("uuid3");

        arrayStorage.save(r1);
        arrayStorage.save(r2);
        arrayStorage.save(r3);

        System.out.println("Get r1: " + arrayStorage.get(r1.getUuid()));
        System.out.println("Size: " + arrayStorage.size());

        printAll();
        arrayStorage.delete(r1.getUuid());
        printAll();
        arrayStorage.clear();
        printAll();

        System.out.println("Size: " + arrayStorage.size());
    }

    static void printAll() {
        System.out.println("\nGet All");
        for (Resume r : arrayStorage.getAll()) {
            System.out.println(r);
        }
    }
}
