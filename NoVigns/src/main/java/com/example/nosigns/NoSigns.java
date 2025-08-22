package com.example.nosigns;

import net.fabricmc.api.ClientModInitializer;

public class NoSigns implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("[NoSigns] Таблички отключены!");
    }
}
