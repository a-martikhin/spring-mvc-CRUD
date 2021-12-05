package web.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    @NotEmpty(message = "Имя пользователя не может быть пустым! Введите имя")
    @Size(min = 2, max = 52, message = "Имя не может быть короче 2 и длиннее 52 знаков! Повторите ввод.")
    private String name;

    @Column(name = "surname")
    @NotEmpty(message = "Фамилия пользователя не может быть пустой! Введите фамилию")
    @Size(min = 2, max = 52, message = "Фамилия не может быть короче 2 и длиннее 52 знаков! Повторите ввод.")
    private String surname;

    @Column(name = "age")
    @Min(value = 0, message = "Возраст некорректен! Повторите ввод.")
    @Max(value = 123, message = "Возраст некорректен! Повторите ввод.")
    private int age;

    @Column(name = "city")
    @NotEmpty(message = "Название города проживания пользователя не может быть пустым! Введите название города")
    @Size(min = 2, max = 52, message = "Название города не может быть короче 2 и длиннее 52 знаков! Повторите ввод.")
    private String city;

    @Column(name = "email")
    @NotEmpty(message = "Поле ввода электронной почты не может быть пустым! Введите адрес электронной почты.")
    @Email(message = "Некорректный адрес электронной почты! Повторите ввод!")
    private String email;

    public User() {
    }

    public User(String name, String surname, int age, String city, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
