import java.util.*;

// @Override
class Vehicle {
    void start() {
        System.out.println("Транспорт заводится");
    }
}

class ElectricCar extends Vehicle {
    @Override
    void start() {
        System.out.println("Электромотор запущен 🔋");
    }
}

// @Deprecated
class FileManager {
    /**
     * @deprecated Используйте saveFile(String path, byte[] data, String charset)
     */
    @Deprecated
    public void saveFile(String path, String content) {
        System.out.println("Сохранено (устаревший метод)");
    }

    public void saveFile(String path, byte[] data, String charset) {
        System.out.println("Сохранено с кодировкой: " + charset);
    }
}

//  @SuppressWarnings
class DataProcessor {

    @SuppressWarnings("unchecked")
    public List<String> filterData(List rawInput) {
        List<String> result = new ArrayList<>();
        for (Object item : rawInput) {
            if (item instanceof String) {
                result.add((String) item);
            }
        }
        return result;
    }

    @SuppressWarnings("deprecation")
    public void legacySave(String path, String content) {
        FileManager fm = new FileManager();
        fm.saveFile(path, content);
    }
}

//  Demo
public class AnnotationsDemo {
    public static void main(String[] args) {
        // @Override
        Vehicle myCar = new ElectricCar();
        myCar.start(); // Электромотор запущен

        // @Deprecated (будет предупреждение)
        FileManager fm = new FileManager();
        fm.saveFile("/tmp/file.txt", "Hello");

        // @SuppressWarnings
        DataProcessor dp = new DataProcessor();
        List raw = Arrays.asList("A", 123, "B");
        List<String> filtered = dp.filterData(raw);
        System.out.println(filtered); // [A, B]

        dp.legacySave("/tmp/log.txt", "data");
    }
}