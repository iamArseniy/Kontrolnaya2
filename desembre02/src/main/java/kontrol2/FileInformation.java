package kontrol2;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileInformation implements Runnable {
    private File file;

    private Map<Integer, byte[]> fragments;
    private int sz;
    private byte[] buffer;
    int even;
    int part;
    public FileInformation(File file, Map<Integer, byte[]> fragments) {
        this.file = file;
        this.fragments = fragments;
    }

    @Override
    public void run() {
        try(InputStream input = new FileInputStream(file);
            DataInputStream inst = new DataInputStream(input); ) {

            sz = inst.readInt();
            buffer = new byte[sz];

            inst.read(buffer);

            even = inst.readInt();
            part = inst.readInt();

            if (even == calculateEven(buffer)) {
               fragments.put(part, buffer);
            }else{
                System.out.println("контрольное число четности данных не совпали");
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private int calculateEven(byte[] data) {
        int even = 0;
        for (byte b : data) {
            int count = 0;
            for (int i = 0; i < 8; i++) {
                count += (b >> i & 1);
            }
            if (count % 2 == 0) {
                even += 0;
            } else {
                even += 1;
            }
        }
        return even % 2;
    }
}
