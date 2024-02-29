package designPattern;


import java.util.ArrayList;
import java.util.List;

/** 복합체 패턴은 주로 트리 구조의 데이터를 처리하는데 사용된다. 데이터는 단순한 객체의 모음으로 이해된다.
 * <GoF의 디자인 패턴> 에서는 복합체 패턴을 일종의 부분-전체 계층 구조로 인식하는 트리 구조로 구성된 객체 컬렉션이며,
 * 복합체 패턴을 통해 코드 사용자로 대표되는 클라이언트가 개별 객체와 복합 객체의 처리 방식을 하나로 통합 할 수 있다고 정의한다.
 *
 * 다음의 기능을 쉽게 구현할 수 있는 클래스를 설계하라는 요구 사항이 있다고 가정해보자
 * 1. 디렉터리 다음의 하위 디렉터리나 파일을 동적으로 추가하거나 삭제할 수 있다.
 * 2. 지정된 디렉터리에 있는 파일의 수를 확인한다.
 * 3. 지정된 디렉터리에 있는 파일의 크기를 합산한다.
* */
public class FileSystemNode {
    private String path;
    private boolean isFile;
    private List<FileSystemNode> subNode = new ArrayList<>();

    public FileSystemNode(String path, boolean isFile) {
        this.path = path;
        this.isFile = isFile;
    }

    public int countNumOfFiles() {
        if (isFile) {
            return 1;
        }
        int numOfFiles = 0;
        for (FileSystemNode fileOrDir : subNode) {
            numOfFiles += fileOrDir.countNumOfFiles();
        }
        return numOfFiles;
    }

    public long countSizeOfFiles() {
        return 0L;
    }

    public String getPath() {
        return path;
    }

    public void addSubNode(FileSystemNode fileOrDir) {
        subNode.add(fileOrDir);
    }

    public void removeSubNode(FileSystemNode fileOrDir) {
        int size = subNode.size();
        int i = 0;
        for (; i < size; ++i) {
            if (subNode.get(i).getPath().equalsIgnoreCase(fileOrDir.getPath())) {
                break;
            }
        }
        if (i < size) {
            subNode.remove(i);
        }
    }
}
