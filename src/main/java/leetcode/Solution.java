package main.java.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("s = ");
		var s = br.readLine();
		System.out.println(lengthOfLongestSubstring(s));
	}

	public static int lengthOfLongestSubstring(String s) {
		var hs = new HashMap<Character, Integer>();
		var maxLength = 0;
		for (var i = 0; i < s.length(); i++) {
			if (hs.get(s.charAt(i)) != null) {
				i = hs.get(s.charAt(i)) + 1;
				maxLength = Math.max(hs.size(), maxLength);
				hs.clear();
			}
			hs.put(s.charAt(i), i);
		}
		return Math.max(hs.size(), maxLength);
	}
}
