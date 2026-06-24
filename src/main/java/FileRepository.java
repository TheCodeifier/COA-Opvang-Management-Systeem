public class FileRepository {

    public void update(Refugee r, String update) {
        if (r == null || r.getFile() == null) return;

        r.getFile().addStatus(update);
    }
}