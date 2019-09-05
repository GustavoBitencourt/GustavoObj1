package com.company.control;

import com.company.model.Dependente;

import java.util.*;

public class DependenteController {
    public static void main(String[] args) {
        Dependente dependente1 = new Dependente();
        Dependente dependente2 = new Dependente(2, "Augusto", "Silva", "Augusto@hotmail.com", "99547391");
        System.out.println(dependente2);
        Dependente dependente3= new Dependente();
        Dependente dependente4= new Dependente(4, "Joana", "Rosa", "joana@hotmail.com", "994324324");
        System.out.println(dependente4);
        Dependente dependente5 = new Dependente(5, "Cézar");
        System.out.println(dependente5);
        Dependente dependente6 = new Dependente(6, "Maria");
        System.out.println(dependente6);


        dependente1.setId(1);
        dependente1.setNome("João");
        dependente1.setSobrenome("Garcia");
        dependente1.setEmail("João@hotmail.com");
        dependente1.setTelefone("77312383");
        System.out.println(dependente1);

        dependente3.setId(3);
        dependente3.setNome("Samuel");
        dependente3.setSobrenome("Garcia");
        dependente3.setEmail("samuel@hotmail.com");
        dependente3.setTelefone("773122383");
        System.out.println(dependente3);


        List<Dependente> dependenteList = new ArrayList<>();
        dependenteList.add(dependente6);
        dependenteList.add(dependente5);
        dependenteList.add(dependente4);
        dependenteList.add(dependente3);
        dependenteList.add(dependente2);
        dependenteList.add(dependente1);

        System.out.println("\nUtilizando List:");
        System.out.println(dependenteList);

        dependenteList.forEach(f -> {
            if(f.getId() == 4){
                System.out.print("\nObjeto de id 4\n");
                System.out.println(f);
            }
        });

        System.out.println("Ordenando");
        Collections.sort(dependenteList);
        System.out.println(dependenteList);
        //ordena a List inline
        dependenteList.sort((c1, c2) -> {
            if(c1.getId() < c2.getId()){
                return 1;
            }else if(c1.getId() > c2.getId()){
                return -1;
            }
            return 0;
        });
        System.out.println(dependenteList);



        Map<Integer, Dependente> funcionarioMap = new HashMap<>();
        funcionarioMap.put(dependente1.hashCode(), dependente1);
        funcionarioMap.put(dependente2.hashCode(), dependente2);
        funcionarioMap.put(dependente3.hashCode(), dependente3);
        funcionarioMap.put(dependente4.hashCode(), dependente4);
        funcionarioMap.put(dependente5.hashCode(), dependente5);
        funcionarioMap.put(dependente6.hashCode(), dependente6);


        System.out.println("\nUtilizando Map");
        System.out.println(funcionarioMap);

        System.out.print("\n\nObjeto de id 4\n");
        System.out.println(funcionarioMap.get(dependente4.hashCode()));


    }
}
