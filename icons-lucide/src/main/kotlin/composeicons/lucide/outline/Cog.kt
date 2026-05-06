package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cog: ImageVector
    get() {
        if (_cog != null) return _cog!!
        _cog = lucideOutlineIcon(
            name = "Cog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 10.27 7 3.34")
            addPathData("M11 13.73 7 20.66")
            addPathData("M12 22v-2")
            addPathData("M12 2v2")
            addPathData("M14 12h8")
            addPathData("M17 20.66 16 18.93")
            addPathData("M17 3.34 16 5.07")
            addPathData("M2 12h2")
            addPathData("M20.66 17 18.93 16")
            addPathData("M20.66 7 18.93 8")
            addPathData("M3.34 17 5.07 16")
            addPathData("M3.34 7 5.07 8")
            addPathData("M14 12c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M20 12c0 4.418-3.582 8-8 8C7.582 20 4 16.418 4 12 4 7.582 7.582 4 12 4c4.418 0 8 3.582 8 8Z")
        }
        return _cog!!
    }

private var _cog: ImageVector? = null
