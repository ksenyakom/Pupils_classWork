package com.company;


import entity.Pupil;
import entity.Sex;
import io.PupilsWriter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Pupil p1 = new Pupil("Ivan","Ivanov", Sex.MALE,8.1);
        Pupil p2 = new Pupil("Tatiana","Petrova", Sex.FEMALE,4);
        Pupil p3 = new Pupil("Vasya","Vasin", Sex.MALE,5.8);

        List<Pupil> pupils = new ArrayList<>();
        pupils.add(p1);
        pupils.add(p2);
        pupils.add(p3);
        System.out.println(pupils);

        PupilsWriter.writer(pupils);


    }
}
