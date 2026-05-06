package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Van: ImageVector
    get() {
        if (_van != null) return _van!!
        _van = lucideOutlineIcon(
            name = "Van",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 6v5c0 .552 .448 1 1 1h6.102c.268 0 .524 .107 .712 .298l.898 .91c.184 .187 .288 .439 .288 .702v3.09c0 .552-.448 1-1 1h-3")
            addPathData("M5 18h-2C2.448 18 2 17.552 2 17v-9C2 6.895 2.895 6 4 6h12c1.1 0 2.1 .8 2.4 1.8L19.576 12")
            addPathData("M9 18h5")
            addPathData("M18 18c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M9 18c0 1.105-.895 2-2 2C5.895 20 5 19.105 5 18c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _van!!
    }

private var _van: ImageVector? = null
