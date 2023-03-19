public class Ingredient {
    String ingredient;
    Integer qty;
    Integer minQty;
    Integer maxQty;

    // สูตรของอาหาร
    Ingredient(String ingre,Integer minQty,Integer maxQty){
        this.ingredient = ingre;
        this.minQty = minQty;
        this.maxQty = maxQty;
    }

    // input ที่ใส่มา
    Ingredient(String ingre,Integer qty){
        this.ingredient = ingre;
        this.qty = qty;
    }

    public String getIngredient() {
        return ingredient;
    }

    public Integer getMaxQty() {
        return maxQty;
    }

    public Integer getMinQty() {
        return minQty;
    }
    public Integer getQty() {
        return qty;
    }

}
