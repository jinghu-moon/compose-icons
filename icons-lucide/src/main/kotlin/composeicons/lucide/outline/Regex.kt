package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Regex: ImageVector
    get() {
        if (_regex != null) return _regex!!
        _regex = lucideOutlineIcon(
            name = "Regex",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 3v10")
            addPathData("M12.67 5.5l8.66 5")
            addPathData("M12.67 10.5l8.66-5")
            addPathData("M9 17C9 15.895 8.105 15 7 15h-2c-1.105 0-2 .895-2 2v2c0 1.105 .895 2 2 2h2c1.105 0 2-.895 2-2v-2Z")
        }
        return _regex!!
    }

private var _regex: ImageVector? = null
