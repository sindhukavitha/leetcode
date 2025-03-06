class Solution {
    public boolean isNumber(String s) {
        if (s == null || s.isEmpty()) return false;
        return s.matches("[-+]?(\\d+(\\.\\d*)?|\\.\\d+)([eE][-+]?\\d+)?");
    }
}
