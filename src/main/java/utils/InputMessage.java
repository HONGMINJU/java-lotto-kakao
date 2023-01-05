package utils;

public enum InputMessage {
    INPUT_MONEY("구매금액을 입력해 주세요."),
    INPUT_WINNING_LOTTO_NUMBERS("지난 주 당첨 번호를 입력해 주세요."),
    INPUT_BONUS_NUMBER("보너스 볼을 입력해 주세요."),
    ;

    private String message;

    InputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}