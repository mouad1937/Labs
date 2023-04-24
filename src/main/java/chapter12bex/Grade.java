package chapter12bex;

import java.util.Map;

public class Grade {
    public static void main(String[] args) {
        Map<String, Integer> fGrade = TestResults.getOriginalGrades();
        Map<String, Integer> sGrade = TestResults.getMakeUpGrades();
      System.out.println(fGrade);
        System.out.println(sGrade);
        for (var student: sGrade.entrySet()) {
            Integer firstGrade = fGrade.get(student.getKey());
            Integer secondGrade = sGrade.get(student.getKey());
            if (secondGrade > firstGrade){
                fGrade.put(student.getKey(), secondGrade);

            }
            fGrade.forEach(
                    (k,v)-> System.out.println(" Name : " + k + ",   best grade : " + v )
            );
        }
        }




    }







