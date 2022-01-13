/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.wheel;

import java.util.UUID;

/**
 *
 * @author Hung Nguyen
 */
public class WheelType {
    
    UUID id;
    String name;

    public WheelType(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
    
    
    
    
}
