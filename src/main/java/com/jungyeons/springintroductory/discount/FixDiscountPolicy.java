package com.jungyeons.springintroductory.discount;

import com.jungyeons.springintroductory.member.Grade;
import com.jungyeons.springintroductory.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("fixDiscountPolicy")
public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade()== Grade.VIP){
            return discountFixAmount;
        }else {
            return 0;
        }

    }
}
