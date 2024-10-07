package classes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bot {

    public Bot() {
    }

    public void Botsitos() {
        String pythonFilePath = "Bot1.py";

        String command = "python " + pythonFilePath;

        try {
            ProcessBuilder processBuilder = new ProcessBuilder(command.split(" "));
            processBuilder.redirectErrorStream(true);

            Process process = processBuilder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String pythonFilePath2 = "Bot2.py";

        String command2 = "python " + pythonFilePath2;

        try {
            ProcessBuilder processBuilder = new ProcessBuilder(command2.split(" "));
            processBuilder.redirectErrorStream(true);

            Process process = processBuilder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String pythonFilePath3 = "Bot3.py";

        String command3 = "python " + pythonFilePath3;

        try {
            ProcessBuilder processBuilder = new ProcessBuilder(command3.split(" "));
            processBuilder.redirectErrorStream(true);

            Process process = processBuilder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
