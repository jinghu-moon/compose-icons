package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CaptionsOff: ImageVector
    get() {
        if (_captionsOff != null) return _captionsOff!!
        _captionsOff = lucideOutlineIcon(
            name = "CaptionsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.5 5h8.5c1.105 0 2 .895 2 2v8.5")
            addPathData("M17 11h-.5")
            addPathData("M19 19h-14C3.895 19 3 18.105 3 17v-10C3 5.895 3.895 5 5 5")
            addPathData("M2 2 22 22")
            addPathData("M7 11h4")
            addPathData("M7 15h2.5")
        }
        return _captionsOff!!
    }

private var _captionsOff: ImageVector? = null
