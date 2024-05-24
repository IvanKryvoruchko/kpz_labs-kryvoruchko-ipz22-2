package org.example.lab2.factoryMethod.subscriptions;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.List;

public final class PremiumSubscription extends Subscription {
    public PremiumSubscription() {
        monthlyPayment = BigDecimal.valueOf(500);
        channels = List.of("PremSub1", "PremSub2", "PremSub3", "PremSub4", "PremSub5", "PremSub6");
        subscriptionPeriod = Duration.ofDays(90);
    }
}

