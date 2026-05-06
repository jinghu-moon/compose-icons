package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Timeline: ImageVector
    get() {
        if (_timeline != null) return _timeline!!
        _timeline = lucideOutlineIcon(
            name = "Timeline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12h.01")
            addPathData("M4 16h.01")
            addPathData("M4 20h.01")
            addPathData("M4 4h.01")
            addPathData("M4 8h.01")
            addPathData("M9.414 13.414c.375 .375 .884 .586 1.414 .586h8.172c.552 0 1-.448 1-1v-2c0-.552-.448-1-1-1h-8.172c-.53 0-1.039 .211-1.414 .586L8 12Z")
            addPathData("M9.414 21.414c.375 .375 .884 .586 1.414 .586h8.172c.552 0 1-.448 1-1v-2c0-.552-.448-1-1-1h-8.172c-.53 0-1.039 .211-1.414 .586L8 20Z")
            addPathData("M9.414 5.414c.375 .375 .884 .586 1.414 .586h8.172c.552 0 1-.448 1-1v-2C20 2.448 19.552 2 19 2h-8.172c-.53 0-1.039 .211-1.414 .586L8 4Z")
        }
        return _timeline!!
    }

private var _timeline: ImageVector? = null
