package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MirrorRound: ImageVector
    get() {
        if (_mirrorRound != null) return _mirrorRound!!
        _mirrorRound = lucideOutlineIcon(
            name = "MirrorRound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 6.6 8.6 8")
            addPathData("M12 18v4")
            addPathData("M15 7.5 9.5 13")
            addPathData("M7 22h10")
            addPathData("M20 10c0 4.418-3.582 8-8 8C7.582 18 4 14.418 4 10 4 5.582 7.582 2 12 2c4.418 0 8 3.582 8 8Z")
        }
        return _mirrorRound!!
    }

private var _mirrorRound: ImageVector? = null
