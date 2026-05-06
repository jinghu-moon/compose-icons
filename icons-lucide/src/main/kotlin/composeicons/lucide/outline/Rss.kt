package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Rss: ImageVector
    get() {
        if (_rss != null) return _rss!!
        _rss = lucideOutlineIcon(
            name = "Rss",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 11c4.971 0 9 4.029 9 9")
            addPathData("M4 4c8.837 0 16 7.163 16 16")
            addPathData("M6 19c0 .552-.448 1-1 1C4.448 20 4 19.552 4 19c0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
        }
        return _rss!!
    }

private var _rss: ImageVector? = null
