package kontr1;



import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;


public class MainBD {
    public static void main(String[] args) throws IOException {
        String[] channels = new String[9];
        int[] progsChan = new int[10];
        List<String> list = Files.readAllLines(new File("/Users/User/IdeaProjects/informatics/desembre02/src/main/java/kontr1/schedule.txt").toPath(), Charset.defaultCharset());
        int cnlcount = 0;
        int progs = 0;
        for (String s:list) {
            if (s.contains("#")) {
                channels[cnlcount] = s;
                cnlcount++;
                progsChan[cnlcount-1] = progs/2;
                progs =0;

            }
            progs++;
        }
        progsChan[cnlcount] = progs/2;
        for (int i: progsChan
        ) {
        }


        Map<String, List<Program>> programMap = new HashMap<>();//4
        List<Program> listprchan = new ArrayList<>();
        for (int i = 0; i < list.size(); i = i+2) {
            String str = list.get(i);
            String curChannel = "";
            if (str.contains("#")) {
                curChannel = str;
                if (i != 0) {
                    programMap.put(str, listprchan);
                }
                listprchan.clear();
                i++;
            }

            String[] time = list.get(i).split(":");
            byte hours = Byte.parseByte(time[0]);
            byte mins = Byte.parseByte(time[1]);
            BroadcastsTime curBT= new BroadcastsTime(hours, mins);
            listprchan.add(new Program(curChannel, curBT, list.get(i+1)));
        }
        List<Program> allprogs = new ArrayList<>();//5
        for (int i = 0; i < list.size(); i = i+2) {
            String str = list.get(i);
            String curChannel = "";
            if (str.contains("#")) {
                curChannel = str;
                i++;
            }
            String[] time = list.get(i).split(":");
            byte hours = Byte.parseByte(time[0]);
            byte mins = Byte.parseByte(time[1]);
            BroadcastsTime curBT= new BroadcastsTime(hours, mins);
            allprogs.add(new Program(curChannel, curBT, list.get(i+1)));
        }

        Collections.sort(allprogs, Comparator.comparing(Program::getTime));//6
        for (Program e: allprogs) {
            System.out.println(e);
        }

        BroadcastsTime currentTime = new BroadcastsTime((byte) 4, (byte) 50);//7

        for (String i: programMap.keySet()){
            for (int j = 0; j < programMap.get(i).size() - 1; j++){
                if (currentTime.between(programMap.get(i).get(j).getTime(), programMap.get(i).get(j + 1).getTime())){
                    System.out.println(programMap.get(i).get(j) + "-" + programMap.get(i).get(j + 1).getTime());
                }
            }
        }
        String curS = "Фартовый";//8
        for (Program i: allprogs){
            if (i.getName().contains(curS)){
                System.out.println(i);
            }
        }

        String searchChannel = "Название канала";//9
        List<Program> channelProgramsNow = allprogs.stream()
                .filter(program -> program.getChannel().equals(searchChannel))
                .filter(program -> program.getTime().equals(currentTime))
                .collect(Collectors.toList());

        BroadcastsTime startTime = new BroadcastsTime((byte) 15, (byte) 0);//10
        BroadcastsTime endTime = new BroadcastsTime((byte) 16, (byte) 0);
        List<Program> channelProgramsInTimeRange = allprogs.stream()
                .filter(program -> program.getChannel().equals(searchChannel))
                .filter(program -> program.getTime().between(startTime, endTime))
                .collect(Collectors.toList());


    }










}







