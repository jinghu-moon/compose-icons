package composeicons.generator.core

object IconNameCollisionDetector {

    fun detect(entries: List<SvgIconEntry>): List<IconNameCollision> {
        return entries
            .groupBy { entry -> entry.style.name to IconNameMapper.toKotlinName(entry.fileName) }
            .values
            .filter { grouped -> grouped.size > 1 }
            .map { grouped ->
                IconNameCollision(
                    kotlinName = IconNameMapper.toKotlinName(grouped.first().fileName),
                    entries = grouped.sortedBy { it.fileName },
                )
            }
            .sortedBy { collision -> collision.kotlinName }
    }
}

