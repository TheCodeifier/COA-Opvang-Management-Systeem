public class FileService {

    private FileRepository fileRepository;

    public FileService(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    public void updateFile(Refugee r, String update) {
        fileRepository.update(r, update);
    }
}