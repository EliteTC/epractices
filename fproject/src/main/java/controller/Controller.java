package controller;

import model.entity.Bouquet;
import service.BouqetManager;
import view.View;
import static view.Constants.*;
import java.util.Scanner;
import static model.repository.AccessoriesRepo.*;
import static model.repository.BouquetRepo.*;
import static model.repository.FlowersRepo.*;

public class Controller {
    public void mainMenu(){

        while(true){
            View.print(MAIN_MENU);
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            switch (i){
                case 1:
                    Bouquet bouqet = new Bouquet();
                    bouqetMenu(bouqet);
                    break;
                case 2:
                    View.print(CHOOSE_BOUQET);
                    View.printBooqets();
                    int bouquetIndex = scanner.nextInt();
                    bouqetMenu(bouquets.get(bouquetIndex));
                    break;
                case 3: default:
                    System.exit(0);
                    break;
            }
        }
    }
    private void bouqetMenu(Bouquet b){
            View.print(BOQUET_MENU);
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            switch (i){
                case 1:
                    View.print(CHOOSE_FLOWER);
                    View.printFlowers();
                    int flowerIndex = scanner.nextInt();
                    b.addFlower(flowers.get(flowerIndex));
                    View.print(b);
                    bouqetMenu(b);
                    break;
                case 2:
                    View.print(CHOOSE_ACCESSORY);
                    View.printAccessories();
                    int accIndex = scanner.nextInt();
                    b.addAccessories(accessories.get(accIndex));
                    View.print(b);
                    bouqetMenu(b);
                    break;
                case 3:
                    BouqetManager.sortByFreshness(b);
                    View.print(b);
                    bouqetMenu(b);
                    break;
                case 4:
                    View.print(INPUT_RANGE_LO);
                    int lo = scanner.nextInt();
                    View.print(INPUT_RANGE_HI);
                    int hi = scanner.nextInt();
                    View.print(BouqetManager.getFlowerByStemHeight(b,lo,hi));
                    bouqetMenu(b);
                    break;
                case 5: default:
                    break;
            }


    }
}
