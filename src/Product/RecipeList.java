package Product;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class RecipeList {
       private final Set<Recipe> recipes = new HashSet<>();
    public void addRecipe (Recipe recipe){
        if (recipe == null){
                return;
            }
        if (this.recipes.contains(recipe)){
            throw new IllegalArgumentException("Такой рецепт уже существует");
        }else {
            this.recipes.add(recipe);
        }
    }
    public void removeRecipe(String name){
        Iterator<Recipe> recipeIterator = this.recipes.iterator();
        while (recipeIterator.hasNext()){
            if (recipeIterator.next().getName().equals(name)){
                recipeIterator.remove();
                break;
            }
        }
    }
        @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список рецептов: " ).append('\n');
            return stringBuilder.toString();
           }
}

