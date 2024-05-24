package org.example.lab2.factoryMethod.platforms;


import org.example.lab2.factoryMethod.subscriptions.DomesticSubscription;
import org.example.lab2.factoryMethod.subscriptions.EducationalSubscription;
import org.example.lab2.factoryMethod.subscriptions.PremiumSubscription;

public abstract class SubscriptionCreator {
    public EducationalSubscription createEducationalSubscription() {
        return new EducationalSubscription();
    }

    public PremiumSubscription createPremiumSubscription() {
        return new PremiumSubscription();
    }

    public DomesticSubscription createDomesticSubscription() {
        return new DomesticSubscription();
    }
}
