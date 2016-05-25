package com.cert.comparable;

/**
 * Created by sridhar on 16/2/16.
 */
public final class CaseInsensitiveString implements Comparable<CaseInsensitiveString> {
    private String s;

    public CaseInsensitiveString(String s) {
        this.s = s;
    }
    @Override
    public boolean equals(Object o){
        return o instanceof CaseInsensitiveString &&
                ((CaseInsensitiveString)o).s.equalsIgnoreCase(s);
    }

    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";
        System.out.println(new CaseInsensitiveString(s).equals(cis) + " are equal " + cis.equals(s) );

    }

    @Override
    public int compareTo(CaseInsensitiveString cis) {
        return String.CASE_INSENSITIVE_ORDER.compare(s, cis.s);
    }
}
