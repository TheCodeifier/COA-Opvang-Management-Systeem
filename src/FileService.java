import java.util.ArrayList;
import java.util.List;

public class FileService implements Subject {

    private FileRepository fileRepository;
    private List<Observer> observers = new ArrayList<>();

    public FileService(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    public void updateFile(Refugee r, String update) {
        fileRepository.update(r, update);
        notifyObservers(update);
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String event) {
        for (Observer o : observers) {
            o.update(event);
        }
    }
}