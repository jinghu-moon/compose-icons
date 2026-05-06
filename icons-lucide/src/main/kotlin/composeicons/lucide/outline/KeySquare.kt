package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.KeySquare: ImageVector
    get() {
        if (_keySquare != null) return _keySquare!!
        _keySquare = lucideOutlineIcon(
            name = "KeySquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.4 2.7c.959-.889 2.441-.889 3.4 0l5.5 5.5c.889 .959 .889 2.441 0 3.4l-3.7 3.7c-.959 .889-2.441 .889-3.4 0L8.7 9.8c-.889-.959-.889-2.441 0-3.4Z")
            addPathData("M14 7l3 3")
            addPathData("M9.4 10.6 2.586 17.414c-.375 .375-.586 .884-.586 1.414v2.172c0 .552 .448 1 1 1h3c.552 0 1-.448 1-1v-1c0-.552 .448-1 1-1h1c.552 0 1-.448 1-1v-1c0-.552 .448-1 1-1h.172c.53-0 1.039-.211 1.414-.586l.814-.814")
        }
        return _keySquare!!
    }

private var _keySquare: ImageVector? = null
