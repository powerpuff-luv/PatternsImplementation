package com.powerpuff.composite.components;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс композита древовидной структуры
 */
public class Directory extends FileSystemComponent {
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public void add(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void remove(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "Directory: " + name);
        for (FileSystemComponent component : components) {
            component.display(indent + "    ");
        }
    }
}
