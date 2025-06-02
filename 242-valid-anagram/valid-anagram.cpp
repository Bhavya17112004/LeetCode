#include <unordered_map>
#include <string>
using namespace std;

class Solution {
public:
    bool isAnagram(string s, string t) {
        if (s.size() != t.size())
            return false;

        unordered_map<char, int> seen;

        // Count characters in string s
        for (int i = 0; i < s.size(); i++) {
            seen[s[i]]++;
        }

        // Decrease the count based on characters in string t
        for (int j = 0; j < t.size(); j++) {
            if (seen.find(t[j]) != seen.end()) {
                seen[t[j]]--;
                if (seen[t[j]] == 0) {
                    seen.erase(t[j]);
                }
            } else {
                return false; // Character in t not found in s
            }
        }

        return true;
    }
};
