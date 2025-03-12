package org.example.orlandocomputers;

import org.example.orlandocomputers.model.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriberRepository extends JpaRepository<Subscriber, Long> {
    // You can add custom queries here if needed
}
