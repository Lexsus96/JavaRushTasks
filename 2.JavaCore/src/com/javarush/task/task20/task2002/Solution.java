package com.javarush.task.task20.task2002;

import com.sun.media.sound.SF2InstrumentRegion;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("C:\\Games\\a.txt", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User lesha = new User();
            lesha.setFirstName("Alex");
            lesha.setLastName("Vinokurov");
            lesha.setMale(true);
            lesha.setBirthDate(new SimpleDateFormat("d M y").parse("27 12 1996"));
            lesha.setCountry(User.Country.RUSSIA);
            javaRush.users.add(lesha);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            System.out.println(javaRush.equals(loadedObject));
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
            for(User user: users) {
                String s = user.getFirstName() + "&" + user.getLastName() + "&" + user.isMale() + "&" + user.getCountry().getDisplayName() + "&" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(user.getBirthDate()) + "\n";
                writer.write(s);
            }
            writer.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while (reader.ready()) {
                String[] user = reader.readLine().split("&");
                User newUser = new User();
                newUser.setFirstName(user[0]);
                newUser.setLastName(user[1]);
                newUser.setMale(Boolean.parseBoolean(user[2]));
                newUser.setCountry(user[3].equals("Russia")? User.Country.RUSSIA: user[3].equals("Ukraine")? User.Country.UKRAINE: User.Country.OTHER);
                newUser.setBirthDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").parse(user[4]));
                users.add(newUser);
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
