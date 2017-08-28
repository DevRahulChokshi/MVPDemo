package com.example.ebc003.mvpdemo;

/**
 * Created by EBC003 on 8/23/2017.
 */

public interface SayHelloContract {

    /** Represents the View in MVP. */
    interface View {
        void showMessage(String message);

        void showError(String error);
    }

    /** Represents the Presenter in MVP. */
    interface Presenter {
        void loadMessage();

        void saveName(String firstName, String lastName);
    }
}