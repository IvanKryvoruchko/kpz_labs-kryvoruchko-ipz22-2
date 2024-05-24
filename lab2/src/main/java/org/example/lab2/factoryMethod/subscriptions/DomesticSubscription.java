package org.example.lab2.factoryMethod.subscriptions;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.List;

public final class DomesticSubscription extends Subscription {
    public DomesticSubscription() {
        monthlyPayment = BigDecimal.valueOf(300);
        channels = List.of("DomSub1", "DomSub2", "DomSub3");
        subscriptionPeriod = Duration.ofDays(60);
    }
}
