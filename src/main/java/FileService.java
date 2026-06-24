public class FileService {

    private final FileRepository fileRepository;

    public FileService(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    public void updateFile(Refugee r, String update) {
        fileRepository.update(r, update);
    }
}