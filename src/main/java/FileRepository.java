public class FileRepository {

    public void update(Refugee r, String update) {
        r.getFile().getStatusHistory().add(update);
    }
}