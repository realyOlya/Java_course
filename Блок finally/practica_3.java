try {
    System.out.println("try");
} finally {
    System.out.println("первый finally");
} finally {   // Ошибка: 'finally' already defined
    System.out.println("второй finally");
}
//Нет, блок finally может быть только один.
//Наличие двух и более блоков finally вызовет ошибку компиляции.