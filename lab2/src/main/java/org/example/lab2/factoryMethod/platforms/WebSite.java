package org.example.lab2.factoryMethod.platforms;

import org.example.lab2.factoryMethod.subscriptions.DomesticSubscription;
import org.example.lab2.factoryMethod.subscriptions.EducationalSubscription;
import org.example.lab2.factoryMethod.subscriptions.PremiumSubscription;

public final class WebSite extends SubscriptionCreator {
    @Override
    public EducationalSubscription createEducationalSubscription() {
        System.out.println("Creating educational subscription with WebSite");
        return super.createEducationalSubscription();
    }

    @Override
    public PremiumSubscription createPremiumSubscription() {
        System.out.println("Creating premium subscription with WebSite");
        return super.createPremiumSubscription();
    }

    @Override
    public DomesticSubscription createDomesticSubscription() {
        System.out.println("Creating domestic subscription with WebSite");
        return super.createDomesticSubscription();
    }
}
