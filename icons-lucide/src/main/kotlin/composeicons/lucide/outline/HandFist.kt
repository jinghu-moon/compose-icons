package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HandFist: ImageVector
    get() {
        if (_handFist != null) return _handFist!!
        _handFist = lucideOutlineIcon(
            name = "HandFist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.035 17.012c0-1.657-1.343-3-3-3l-.311-.002c-.29-.002-.551-.178-.662-.446-.11-.269-.049-.577 .157-.783L9.414 11.586c.375-.375 .884-.586 1.414-.586h1.172c1.105 0 2-.895 2-2C14 7.895 13.105 7 12 7h-2.757C8.447 7 7.684 7.316 7.121 7.879L4.414 10.586C3.509 11.492 3 12.72 3 14c0 4.418 3.582 8 8 8h2c4.418 0 8-3.582 8-8v-7C21 5.895 20.105 5 19 5c-1.105 0-2 .895-2 2v2c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M13.888 9.662c.613 .41 1.403 .45 2.054 .102C16.593 9.416 17 8.738 17 8v-3C17 3.895 16.105 3 15 3c-1.105 0-2 .895-2 2")
            addPathData("M9 5C9 3.895 8.105 3 7 3 5.895 3 5 3.895 5 5v5")
            addPathData("M9 7v-3C9 2.895 9.895 2 11 2c1.105 0 2 .895 2 2v3.268")
        }
        return _handFist!!
    }

private var _handFist: ImageVector? = null
