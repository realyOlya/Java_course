// от double/float к целому числу
double pi = 3.14159;
int integerPi = (int) pi;
System.out.println(integerPi);

// преобразование с потерей данных
int bigNumber = 130;
byte smallNumber = (byte) bigNumber;
System.out.println(smallNumber);