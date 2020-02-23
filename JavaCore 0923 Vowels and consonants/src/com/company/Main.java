package com.company;

/*

0922 What day is it today
Enter the date in the format "08/18/2013" using the keyboard
Display this date in the form “AUG 18, 2013”.
Take advantage of the Date object and SimpleDateFormat.

Requirements:
1. The program should read data from the keyboard.
2. A variable of type SimpleDateFormat must be declared in the program.
3. The program must be declared a variable of type Date.
4. All variables must be initialized.
5. The program should display data on the screen.
6. The conclusion should correspond to the task.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        StringBuilder builderVowels = new StringBuilder();
        StringBuilder builderOther = new StringBuilder();
        for (char letter : line.toCharArray()) {
            if (isVowel(letter)) {
                builderVowels.append(letter + " ");
            } else if (letter != ' '){
                builderOther.append(letter + " ");
            }
        }

        System.out.println(builderVowels.toString());
        System.out.println(builderOther.toString());
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}







