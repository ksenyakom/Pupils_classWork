package io;

import entity.Pupil;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class PupilsWriter {
    private static final String[] headers = {"First Name", "Last Name", "Sex", "Average Mark"};

    public static void writer(List<Pupil> pupils) {
        String headersString = renderHeaders();
        try (FileWriter writer = new FileWriter(IOConstants.FILENAME);) {

            writer.write(headersString);

            for (Pupil item : pupils) {
                String s = toCvsString(item);
                writer.write(s);
            }
            System.out.println("сохранено в файл");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static String toCvsString(Pupil pupil) {
        return pupil.getFirstName() + IOConstants.DELIMITER +
                pupil.getLastName() + IOConstants.DELIMITER +
                pupil.getSex() + IOConstants.DELIMITER +
                pupil.getAverageMark() + IOConstants.DELIMITER + "\n";
    }

    private static String renderHeaders() {
        return String.join(IOConstants.DELIMITER, headers) +"\n";
    }
}
