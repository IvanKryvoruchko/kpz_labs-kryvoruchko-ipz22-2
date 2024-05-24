package org.example.lab2.factoryMethod.subscriptions;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.List;

public final class EducationalSubscription extends Subscription {
    public EducationalSubscription() {
        monthlyPayment = BigDecimal.valueOf(100);
        channels = List.of("EduSub1", "EduSub2", "EduSub3", "EduSub4");
        subscriptionPeriod = Duration.ofDays(60);
    }
}
