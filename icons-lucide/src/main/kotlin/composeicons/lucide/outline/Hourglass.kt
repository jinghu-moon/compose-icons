package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Hourglass: ImageVector
    get() {
        if (_hourglass != null) return _hourglass!!
        _hourglass = lucideOutlineIcon(
            name = "Hourglass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 22h14")
            addPathData("M5 2h14")
            addPathData("M17 22v-4.172c-0-.53-.211-1.039-.586-1.414L12 12 7.586 16.414c-.375 .375-.586 .884-.586 1.414v4.172")
            addPathData("M7 2v4.172c0 .53 .211 1.039 .586 1.414L12 12 16.414 7.586c.375-.375 .586-.884 .586-1.414v-4.172")
        }
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
