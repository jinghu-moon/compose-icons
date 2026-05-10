package composeicons.scanner.plugin

/**
 * Levenshtein edit distance computation for spelling suggestions.
 */
object Levenshtein {

    /**
     * Compute the edit distance between [a] and [b].
     */
    fun distance(a: String, b: String): Int {
        val m = a.length
        val n = b.length
        val dp = Array(m + 1) { IntArray(n + 1) }

        for (i in 0..m) dp[i][0] = i
        for (j in 0..n) dp[0][j] = j

        for (i in 1..m) {
            for (j in 1..n) {
                val cost = if (a[i - 1] == b[j - 1]) 0 else 1
                dp[i][j] = minOf(
                    dp[i - 1][j] + 1,      // deletion
                    dp[i][j - 1] + 1,      // insertion
                    dp[i - 1][j - 1] + cost, // substitution
                )
            }
        }
        return dp[m][n]
    }

    /**
     * Find the top [count] closest matches to [query] in [candidates].
     * Returns pairs of (candidate, distance), sorted by distance ascending.
     */
    fun suggest(query: String, candidates: Collection<String>, count: Int = 3): List<Pair<String, Int>> {
        return candidates
            .map { it to distance(query.lowercase(), it.lowercase()) }
            .sortedBy { it.second }
            .take(count)
            .filter { it.second <= maxOf(3, query.length / 2) } // threshold: max 3 edits or half the length
    }
}
