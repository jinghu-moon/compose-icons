package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Caravan: ImageVector
    get() {
        if (_caravan != null) return _caravan!!
        _caravan = lucideOutlineIcon(
            name = "Caravan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 19v-10C18 6.791 16.209 5 14 5h-8C3.791 5 2 6.791 2 9v8c0 1.105 .895 2 2 2h2")
            addPathData("M2 9h3c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-3")
            addPathData("M22 17v1c0 .552-.448 1-1 1h-11v-9c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v9")
            addPathData("M10 19c0 1.105-.895 2-2 2C6.895 21 6 20.105 6 19c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _caravan!!
    }

private var _caravan: ImageVector? = null
