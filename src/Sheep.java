import java.util.Arrays;

public class Sheep {

   enum Animal {sheep, goat};
   
   public static void main (String[] param) {

      Animal[] animals = {Animal.sheep, Animal.sheep, Animal.sheep, Animal.sheep, Animal.goat};

      reorder(animals);
   }
   
   public static void reorder (Animal[] animals) {
      Integer animal = 0;

      for (int i =0; i < animals.length; i++){
         if (animals[i] == Animal.goat){
            animal++;
         }
      }

      int animal_index = 0;
      for (int i = 0; i < animal; i++){
         animals[animal_index] = Animal.goat;
         animal_index++;
      }
      for (int i = 0; i < animals.length-animal; i++){
         animals[animal_index] = Animal.sheep;
         animal_index++;
      }
   }
}

