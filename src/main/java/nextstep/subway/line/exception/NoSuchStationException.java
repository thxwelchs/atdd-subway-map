package nextstep.subway.line.exception;


public class NoSuchStationException extends RuntimeException {
    public NoSuchStationException(String msg) {
        super(msg);
    }
}