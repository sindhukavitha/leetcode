class Solution {
    public List<String> fullJustify(final String[] words, final int maxWidth) {
        final int n = words.length;
        final List<String> res = new ArrayList<>();

        int idx = 0;

        while(idx < n) {
            int start = idx, length = 0;

            while(idx < n && length + words[idx].length() + idx - start <= maxWidth)
                length += words[idx++].length();

            length = maxWidth - length;

            final int size = idx - start;
            final StringBuilder sb = new StringBuilder();

            int extra = 0, spaces = 0, end = 0;

            if(idx >= n || size == 1) {
                end = length - size + 1;
                spaces = 1;
            } else {
                spaces = length / (size - 1);
                extra = length % (size - 1);
            }

            for(int i = start; i < idx - 1; ++i) {
                sb.append(words[i]);

                for(int j = 0; j < spaces; ++j)
                    sb.append(" ");

                if(extra-- > 0)
                    sb.append(" ");
            }

            sb.append(words[idx - 1]);

            for(int i = 0; i < end; ++i)
                sb.append(" ");

            res.add(sb.toString());
        }

        return res;
    }
}