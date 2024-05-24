package org.example.lab2.factoryMethod;

import org.example.lab2.factoryMethod.platforms.ManagerCall;
import org.example.lab2.factoryMethod.platforms.MobileApp;
import org.example.lab2.factoryMethod.platforms.SubscriptionCreator;
import org.example.lab2.factoryMethod.platforms.WebSite;

public class App {

    public static void main(String[] args) {
        createSubscription(MobileApp.class);
        createSubscription(ManagerCall.class);
        createSubscription(WebSite.class);
    }

    private static <T extends SubscriptionCreator> void createSubscription(Class<T> creatorClass) {
        try {
            T subscriptionCreator = creatorClass.getDeclaredConstructor().newInstance();

            subscriptionCreator.createEducationalSubscription().printSubscriptionInfo();
            subscriptionCreator.createPremiumSubscription().printSubscriptionInfo();
            subscriptionCreator.createDomesticSubscription().printSubscriptionInfo();
        } catch (Exception e) {
            System.out.println("Error to create subscription[" + creatorClass + "]");
        }
    }
}
