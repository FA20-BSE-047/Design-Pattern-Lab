import gof.FA23finalExam.CommunicatingObject;
import java.util.ArrayList;
import java.util.List;

public class Polling implements CommunicatingObject {
    private List<String> options;

    public Polling(List<String> options) {
        this.options = new ArrayList<>(options);
    }

  
    public String getContent() {
        StringBuilder pollingContent = new StringBuilder();
        pollingContent.append("Polling Options:\n");
        for (int i = 0; i < options.size(); i++) {
            pollingContent.append(i + 1).append(". ").append(options.get(i)).append("\n");
        }
        return pollingContent.toString();
    }

    // Additional methods to handle polling-specific functionalities if needed
}
