package org.example.lab2.factoryMethod.subscriptions;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.List;

public abstract class Subscription {
    protected BigDecimal monthlyPayment;
    protected List<String> channels;
    protected Duration subscriptionPeriod;

    public void printSubscriptionInfo() {
        System.out.println("=================== Information about subscription ===================");
        System.out.println("Subscription Type: " + getClass().getSimpleName());
        System.out.println("Monthly payment: " + monthlyPayment);
        System.out.println("Period of subscription: " + subscriptionPeriod);
        System.out.println("Channels available in subscription: " + String.join(", ", channels));
        System.out.println("======================================================================");
        System.out.println();
    }
}
