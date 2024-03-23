/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.a18delsol.dataneitor9000.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author heart
 */
@RestController
public class DataController {

    @GetMapping("/")
    public String test() {
        return "it's funny how one verse can fuck up the game";
    }
}
