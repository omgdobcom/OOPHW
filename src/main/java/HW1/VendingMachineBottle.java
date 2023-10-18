package HW1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineBottle extends VendingMachine {
    List<BottleOfWater> bottleOfWaterList = new ArrayList<>();


    public void initProduct() {
    }


    public void initProduct(List<BottleOfWater> bottle) {
        this.bottleOfWaterList = bottle;
    }


    public String getProduct() {
        return null;
    }


    public String getProduct(String name) {
        for (BottleOfWater el : bottleOfWaterList) {
            if (el.getName().equals(name)) return el.toString();
        }
        return "Не найдено";
    }
}
