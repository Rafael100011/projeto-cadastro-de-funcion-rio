package Aplication;

import Entities.Employed;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Employed> func = new ArrayList<>();

        System.out.print("Quantos funcionários deseja contratar? ");
        int n = sc.nextInt();

        for(int i =0; i <n; i++) {
            System.out.println(+i+1+": funcionário");
            System.out.print("digite o código do funcionário: ");
            Integer id = sc.nextInt();

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salario: ");
            Double salary = sc.nextDouble();

            Employed Emp = new Employed(id,name,salary);
            func.add(Emp);
        }

        System.out.print("Digite o código do funcionário que deseja aumentar o Salário: ");
        Integer idBusca = sc.nextInt();
        Employed funcionarioEncontrado = null;
        for (Employed x : func){
            if(x.getId().equals(idBusca)){
                funcionarioEncontrado = x;
                break;
            }
        }
        if(funcionarioEncontrado != null) {
            System.out.print("Digite o percentual que deseja: ");
            Double percent = sc.nextDouble();
            funcionarioEncontrado.increaseSalary(percent);

        }else{
            System.out.println("O funcionário não existe!");
            System.out.println();
        }

        for(Employed x : func){

            System.out.println(x);

        }
        sc.close();
    }

}
