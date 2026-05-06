package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MicOff: ImageVector
    get() {
        if (_micOff != null) return _micOff!!
        _micOff = lucideOutlineIcon(
            name = "MicOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 19v3")
            addPathData("M15 9.34v-4.34C14.992 3.613 14.034 2.413 12.684 2.097 11.334 1.781 9.943 2.431 9.32 3.67")
            addPathData("M16.95 16.95c-2.002 2.002-5.013 2.601-7.629 1.518C6.705 17.384 5 14.831 5 12v-2")
            addPathData("M18.89 13.23c.073-.406 .11-.818 .11-1.23v-2")
            addPathData("M2 2 22 22")
            addPathData("M9 9v3c.001 1.213 .732 2.305 1.852 2.769 1.12 .464 2.41 .208 3.268-.649")
        }
        return _micOff!!
    }

private var _micOff: ImageVector? = null
