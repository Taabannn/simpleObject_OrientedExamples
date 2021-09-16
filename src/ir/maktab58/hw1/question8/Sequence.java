package ir.maktab58.hw1.question8;

public class Sequence {
    private char[] value;

    public char[] getValue() {
        return value;
    }

    public void setValue(char[] input) {
        value = new char[input.length];
        for (int i = 0; i < input.length; i++)
            value[i] = input[i];
    }

    public void concat(Sequence sequence) {
        char[] tempArray = sequence.getValue();
        char[] newValue = new char[tempArray.length + value.length];
        for (int i = 0; i < value.length; i++) {
            newValue[i] = value[i];
        }
        for (int i = value.length; i < newValue.length; i++) {
            newValue[i] = tempArray[i - value.length];
        }
        value = newValue;
    }

    public int indexOf(char character) {
        for (int i = 0; i < value.length; i++) {
            if (value[i] == character)
                return i;
        }
        return -1;
    }

    public void replace(Sequence oldChars, Sequence newChars) {
        if (oldChars.getValue().length == 0) {
            if (newChars.getValue().length == 0)
                return;
            char[] newCharArray = newChars.getValue();
            replaceIfOldCharsIsNull(newCharArray);
            return;
        }
        replaceIfOLdCharsExisted(oldChars.getValue(), newChars.getValue());
    }

    public void replaceIfOldCharsIsNull(char[] newCharsArray) {
        int newCharsLength = newCharsArray.length;
        char[] newValue = new char[value.length + (value.length + 1) * newCharsLength];
        for (int i = newCharsLength; i <= newValue.length; i += newCharsLength + 1) {
            for (int j = i - 1; j >= i - newCharsLength; j--) {
                newValue[j] = newCharsArray[j % (newCharsLength + 1)];
            }
            if (i == newValue.length)
                break;
            newValue[i] = value[i / (newCharsLength + 1)];
        }
        value = newValue;
    }

    public int getStartIndexOfOldChars(char[] oldCharsArray){
        for (int i = 0; i <= value.length - oldCharsArray.length;i++) {
            for (int j = 0; j < oldCharsArray.length; j++) {
                if (oldCharsArray[j] != value[i + j])
                    break;
                if (j == oldCharsArray.length - 1)
                    return i;
            }
        }
        return -1;
    }

    public void replaceIfOLdCharsExisted(char[] oldCharsArray, char[] newCharsArray){
        int index = getStartIndexOfOldChars(oldCharsArray);
        if (index == -1)
            return;

        char[] newValue = new char[value.length - oldCharsArray.length + newCharsArray.length];
        for (int i = 0; i < newValue.length; i++){
            if (i < index) {
                newValue[i] = value[i];
                continue;
            }
            if(i < index + newCharsArray.length){
                newValue[i] = newCharsArray[i-index];
                continue;
            }
            newValue[i] = value[i-newCharsArray.length+oldCharsArray.length];
        }
        value = newValue;
    }

    public boolean equals(Sequence otherSeq){
        if (otherSeq.getValue().length != value.length)
            return false;
        char[] otherSeqChars = otherSeq.getValue();
        for (int i = 0; i < value.length; i++){
            if (otherSeqChars[i] != value[i])
                return false;
        }
        return true;
    }
}
