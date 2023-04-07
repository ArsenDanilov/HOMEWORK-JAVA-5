import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        HashMap <String, String> employeesList = new HashMap<>();
        employeesList.put("Петрова", "Светлана");
        employeesList.put("Белова", "Кристина");
        employeesList.put("Мусина", "Анна");
        employeesList.put("Крутова", "Анна");
        employeesList.put("Юрин", "Иван");
        employeesList.put("Лыков", "Петр");
        employeesList.put("Чернов", "Павел");
        employeesList.put("Чернышов", "Петр");
        employeesList.put("Федорова", "Мария");
        employeesList.put("Светлова", "Марина");
        employeesList.put("Савина", "Мария");
        employeesList.put("Рыкова", "Мария");
        employeesList.put("Лугова", "Марина");
        employeesList.put("Владимирова", "Анна");
        employeesList.put("Мечников", "Иван");
        employeesList.put("Петин", "Петр");
        employeesList.put("Ежов", "Иван");

        HashMap <String, Integer> sortedEmployeesList = new HashMap<>();
        employeesListSort(employeesList, sortedEmployeesList);
        




    }

    public static void employeesListSort(HashMap<String, String> employees, HashMap<String, Integer> newEmployees){
        int counter = 0;
       for (Map.Entry<String, String> entry1: employees.entrySet()){
            counter = 0;
            for (Map.Entry<String, String> entry2: employees.entrySet()){
                if (entry1.getValue() == entry2.getValue()){
                    counter+= 1;
                }
            }
            newEmployees.put(entry1.getValue(), counter);
       }

       System.out.println("Вывод списка повторяющихся имён с указанием количества: \n" + newEmployees);
    }

}
