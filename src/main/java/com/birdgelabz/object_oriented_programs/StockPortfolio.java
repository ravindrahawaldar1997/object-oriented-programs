package com.birdgelabz.object_oriented_programs;

import java.util.ArrayList;
import java.util.Scanner;


public class StockPortfolio {
    ArrayList<Stock> stockList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    void add() {
        Stock stock = new Stock();
        System.out.println("Enter the name of the stock");
        stock.setStockName(sc.next());
        System.out.println("Enter the number of shares");
        stock.setNumberOfShares(sc.nextInt());
        System.out.println("Enter value of share");
        stock.setSharePrice(sc.nextDouble());
        stockList.add(stock);
    }

    boolean calculation() {
        double totalValue = 0;
        double valueOfStock;
        for (Stock x : stockList) {
            valueOfStock = x.getNumberOfShares() * x.getSharePrice();
            System.out.println("value of stock " + valueOfStock);
            totalValue += valueOfStock;
        }
        System.out.println("Total value of stock " + totalValue);
        return false;
    }

    void print() {
        System.out.println(calculation());
    }

    public static void main(String[] args) {
        StockPortfolio stockPortfolio = new StockPortfolio();

        stockPortfolio.calculation();
        boolean loop = true;
        while (true) {
            System.out.println("Enter the option which you want");
            System.out.println(" Press 1. add stock \n press 2. stockReport \n press 3. exit");
            final int addStock = 1, stockReport = 2, exit = 3;
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case addStock:
                    stockPortfolio.add();
                case stockReport:
                    stockPortfolio.calculation();
                case exit:
                    loop = false;
                default:
                    System.out.println("Invalid Entry");
            }
        }

    }

}



