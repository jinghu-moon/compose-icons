package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.VibrateOff: ImageVector
    get() {
        if (_vibrateOff != null) return _vibrateOff!!
        _vibrateOff = lucideOutlineIcon(
            name = "VibrateOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 8l2 2L2 12l2 2L2 16")
            addPathData("M22 8l-2 2 2 2-2 2 2 2")
            addPathData("M8 8v10c0 .55 .45 1 1 1h6c.55 0 1-.45 1-1v-2")
            addPathData("M16 10.34v-4.34C16 5.45 15.55 5 15 5h-4.34")
            addPathData("M2 2 22 22")
        }
        return _vibrateOff!!
    }

private var _vibrateOff: ImageVector? = null
