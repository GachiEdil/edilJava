package com.company;

public class Validator {


        public boolean checkAge(int age) {
            if(age<18){
                System.out.println("Вы не достигли совершеннолетия!");
                return false;
            }
            else {
                return true;
            }
        }

        public boolean checkGender(String gender){
            if (!gender.equals("М") && !gender.equals("Ж")){
                System.out.println("Введите М или Ж");
                return false;
            }
            else {
                return true;
            }
        }

        public boolean checkPassword(String password){
            char[] charArr = password.toCharArray();
            boolean[] checking = new boolean[5];

            if(password.length() >= 8){
                checking[0] = true;
            }

            for (char a : charArr){
                if(Character.isDigit(a)){
                    checking[1] = true;
                }
                if(Character.isUpperCase(a)){
                    checking[2] = true;
                }
                if(Character.isLowerCase(a)){
                    checking[3] = true;
                }
                if(!Character.isLetterOrDigit(a)){
                    checking[4] = true;
                }
            }
            for (boolean d : checking){
                if (!d){
                    System.out.println("Пароль введен неправильно! Условия введения пароля следующие: кол-во символов должно быть не меньше 8, должно быть не менее 1 числа, 1 большой буквы, 1 маленькой буквы и 1 спеиального символа");
                    return false;
                }
            }

            return true;
        }

        public boolean checkDateOfBirth(String dateOfBirth){
            char[] charArr = dateOfBirth.toCharArray();

            if(dateOfBirth.length() != 10){
                System.out.println("Дата рождения введена неправильно! Пожалуйста, введите следующим образом: dd/mm/yyyy");
                return false;
            }


            int dd = Integer.parseInt(dateOfBirth.substring(0,2));
            int mm = Integer.parseInt(dateOfBirth.substring(3,5));

            if(dd>0){
                if(mm == 4 || mm == 6 || mm == 9 || mm == 7 || mm == 11){
                    if (dd>30) {
                        System.out.println("В этом месяце ровно 30 дней!");
                        return false;
                    }
                }
                else if(mm==2){
                    if (dd>29){
                        System.out.println("Дата введена неправильно! в этом месяце только 29 дней");
                        return false;
                    }
                }
                else if (dd<0){
                    System.out.println("Дата введена неправильно");
                    return false;
                }

                if (mm<0 || mm>12){
                    System.out.println("Дата введена неправильно!");
                    return false;
                }

                for (int i=0; i<10; i++){
                    if (i!=2 && i!=5){
                        if(!Character.isDigit(charArr[i])){
                            System.out.println("Дата рождения введена неправильно! Пожалуйста, введите следующим образом: dd/mm/yyyy");
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }


