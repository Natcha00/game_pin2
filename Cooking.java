import java.util.ArrayList;

public class Cooking {

    public String cook(ArrayList<Ingredient> ingredientsInput){
        //สูตรอาหารที่มี

        // CAKE
        ArrayList<Ingredient> cakeIngredient = new ArrayList<>();
        cakeIngredient.add(new Ingredient("FLOUR", 2, 999)); // 999 คือ ไม่จำกัด
        cakeIngredient.add(new Ingredient("EGG", 1, 3));
        cakeIngredient.add(new Ingredient("MILK", 1, 5));
        cakeIngredient.add(new Ingredient("SUGAR", 1, 5));
        cakeIngredient.add(new Ingredient("BUTTER", 1, 5));

        // OMELET
        ArrayList<Ingredient> omeletIngredient = new ArrayList<>();
        omeletIngredient.add(new Ingredient("EGG", 1, 999));
        omeletIngredient.add(new Ingredient("BUTTER", 1, 5));
        omeletIngredient.add(new Ingredient("RICE", 1, 999));

        // FIREDRICE
        ArrayList<Ingredient> firedRiceIngredients = new ArrayList<>();
        firedRiceIngredients.add(new Ingredient("RICE", 1, 999));
        firedRiceIngredients.add(new Ingredient("EGG", 1, 999));
        firedRiceIngredients.add(new Ingredient("MEAT", 1, 999));
        firedRiceIngredients.add(new Ingredient("LETTUCE", 1, 999));

        // SANDWICH
        ArrayList<Ingredient> sandwichIngredients = new ArrayList<>();
        sandwichIngredients.add(new Ingredient("BREAD", 1, 999));
        sandwichIngredients.add(new Ingredient("LETTUCE", 1, 999));
        sandwichIngredients.add(new Ingredient("MEAT", 1, 999));

        // STEAK
        ArrayList<Ingredient> steakIngredients = new ArrayList<>();
        steakIngredients.add(new Ingredient("MEAT", 1, 999));
        steakIngredients.add(new Ingredient("BUTTER", 2, 999));

        // เช็คว่า วัตถุดิบที่ใส่เข้ามาถูกต้องหรือไม่ เทียบกับที่สูตรอาหารมี
        if(checkRecipe(ingredientsInput,cakeIngredient)){
            return "Cake";
        }
        if(checkRecipe(ingredientsInput,omeletIngredient)){
            return "Omelet";
        }
        if(checkRecipe(ingredientsInput,firedRiceIngredients)){
            return "FiredRice";
        }
        if(checkRecipe(ingredientsInput,sandwichIngredients)){
            return "Sandwich";
        }
        if(checkRecipe(ingredientsInput,steakIngredients)){
            return "Steak";
        }

        return "FAILED";
    }

    public boolean checkRecipe(ArrayList<Ingredient> ingredientsInput, ArrayList<Ingredient> ingredientsRecipe){
        Boolean isComplete = true;
        ArrayList<String> RecipeList = new ArrayList<>();
        for(Ingredient ingredient:ingredientsRecipe){
            RecipeList.add(ingredient.getIngredient());
        }
        for (Ingredient ingreInput:ingredientsInput){
            for(Ingredient ingreRecipe:ingredientsRecipe){
                if(ingreInput.getIngredient().equals(ingreRecipe.getIngredient())){
                    int maxQty = ingreRecipe.getMaxQty();
                    int minQty = ingreRecipe.getMinQty();
                    int qty = ingreInput.getQty();
                    // System.out.println(maxQty);
                    // System.out.println(minQty);
                    // System.out.println(ingreInput.getIngredient());
                    if(qty<minQty || qty>= maxQty){
                        isComplete = false;
                    }
                }else{
                    if(!RecipeList.contains(ingreInput.getIngredient())){
                        isComplete = false;
                    }
                }
            }
            
        }
        return isComplete;
    }
}
