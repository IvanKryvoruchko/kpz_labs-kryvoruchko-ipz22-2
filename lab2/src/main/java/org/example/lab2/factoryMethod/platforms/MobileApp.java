package org.example.lab2.factoryMethod.platforms;

import org.example.lab2.factoryMethod.subscriptions.DomesticSubscription;
import org.example.lab2.factoryMethod.subscriptions.EducationalSubscription;
import org.example.lab2.factoryMethod.subscriptions.PremiumSubscription;

public final class MobileApp extends SubscriptionCreator {
    @Override
    public EducationalSubscription createEducationalSubscription() {
        System.out.println("Creating educational subscription with MobileApp");
        return super.createEducationalSubscription();
    }

    @Override
    public PremiumSubscription createPremiumSubscription() {
        System.out.println("Creating premium subscription with MobileApp");
        return super.createPremiumSubscription();
    }

    @Override
    public DomesticSubscription createDomesticSubscription() {
        System.out.println("Creating domestic subscription with MobileApp");
        return super.createDomesticSubscription();
    }
}
