package com.powerpuff.composite.components;

/**
 * Класс листа древовидной структуры
 */
public class File extends FileSystemComponent {
    public File(String name) {
        super(name);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "File: " + name);
    }
}
