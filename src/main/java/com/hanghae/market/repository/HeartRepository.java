package com.hanghae.market.repository;

import com.hanghae.market.domain.Heart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeartRepository extends JpaRepository<Heart, Long> {
    Heart findByBoardIdAndUserId(Long board_id, Long user_id);
}
