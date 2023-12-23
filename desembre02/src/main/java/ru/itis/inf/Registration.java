package ru.itis.inf;

import dec9.TradeRequest;

import java.math.BigDecimal;

public class Registration {
    public static void main(String[] args) {
        TradeRequest tr = new TradeRequest(-2, BigDecimal.valueOf(10));
        try {
            registerTrade(tr);
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        } catch (InvalidTotalException e) {
            System.out.println("Total should be greater than 0");
        } catch (InvalidTotalScaleException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unknown error");
        }

    }

    public static void registerTrade(TradeRequest req) throws InvalidAmountException, InvalidTotalException, InvalidTotalScaleException{
        if (req.amount<=0){
            throw new InvalidAmountException();
        }
        if (req.total.intValue()<=0){
            throw new InvalidTotalException();
        }
        if (req.total.scale()>2){
            req.currentScale = req.total.scale();
            throw new InvalidTotalScaleException(req.total.scale());
        }

    }
}
