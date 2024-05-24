package org.example.lab2.factoryMethod.platforms;


import org.example.lab2.factoryMethod.subscriptions.DomesticSubscription;
import org.example.lab2.factoryMethod.subscriptions.EducationalSubscription;
import org.example.lab2.factoryMethod.subscriptions.PremiumSubscription;

public final class ManagerCall extends SubscriptionCreator {
    @Override
    public EducationalSubscription createEducationalSubscription() {
        System.out.println("Creating educational subscription with ManagerCall");
        return super.createEducationalSubscription();
    }

    @Override
    public PremiumSubscription createPremiumSubscription() {
        System.out.println("Creating premium subscription with ManagerCall");
        return super.createPremiumSubscription();
    }

    @Override
    public DomesticSubscription createDomesticSubscription() {
        System.out.println("Creating domestic subscription with ManagerCall");
        return super.createDomesticSubscription();
    }
}
