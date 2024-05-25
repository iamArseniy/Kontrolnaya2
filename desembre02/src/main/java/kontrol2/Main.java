package kontrol2;


import java.io.*;
import java.util.*;


public class Main {



    public static void main(String[] args) throws InterruptedException {
        String directoryPath = "/Users/User/IdeaProjects/informatics/desembre02/src/main/java/kontrol2/v3";

        File directory = new File(directoryPath);

        File[] files = directory.listFiles();

        Map<Integer, byte[]> fragments = new HashMap<>();

        if (files != null) {
            List<Thread> threads = new ArrayList<>();

            for (File file : files) {

                Thread thread = new Thread(new FileInformation(file, fragments));
                threads.add(thread);
                thread.start();

            }

            for (Thread thread : threads) {
                thread.join();
            }
        }
        List<Integer> keys = new ArrayList<>(fragments.keySet());
        Collections.sort(keys);

        try (FileOutputStream writer = new FileOutputStream("/Users/User/IdeaProjects/informatics/desembre02/src/main/java/kontrol2/v3.png")) {
            for (int key : keys) {
                writer.write(fragments.get(key));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
