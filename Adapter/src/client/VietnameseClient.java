package client;

import adaptee.JapaneseAdaptee;
import adapter.TranslatorAdapter;
import target.VietnameseTarget;

public class VietnameseClient {
    public static void main(String[] args) {
        VietnameseTarget client = new TranslatorAdapter(new JapaneseAdaptee());
        client.send("Xin chào");
    }
}
