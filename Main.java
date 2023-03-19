import java.util.ArrayList;
public class Main {
   public static void main(String[] args) {
        //ส่งชื่อวัตถุดิบ กับ จำนวน
        ArrayList<Ingredient> inputIngredient = new ArrayList<>();
        inputIngredient.add(new Ingredient("MEAT",1)); 
        inputIngredient.add(new Ingredient("BUTTER",2)); 
        // inputIngredient.add(new Ingredient("FLOUR",12)); 
        // inputIngredient.add(new Ingredient("EGG", 1));
        // inputIngredient.add(new Ingredient("MILK", 1));
        // inputIngredient.add(new Ingredient("SUGAR", 1));

        //ส่งวัตถุดิบไปทำอาหาร
        Cooking cooking = new Cooking();
        String result = cooking.cook(inputIngredient);
        System.out.println(result);

        // display ตามผลลัพธ์ที่ได้จากการทำอาหาร
        new Window(result);
   }
}