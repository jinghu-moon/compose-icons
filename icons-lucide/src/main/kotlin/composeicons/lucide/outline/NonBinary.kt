package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.NonBinary: ImageVector
    get() {
        if (_nonBinary != null) return _nonBinary!!
        _nonBinary = lucideOutlineIcon(
            name = "NonBinary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2v10")
            addPathData("M8.5 4l7 4")
            addPathData("M8.5 8l7-4")
            addPathData("M17 17c0 2.761-2.239 5-5 5C9.239 22 7 19.761 7 17c0-2.761 2.239-5 5-5 2.761 0 5 2.239 5 5Z")
        }
        return _nonBinary!!
    }

private var _nonBinary: ImageVector? = null
