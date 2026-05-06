package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HeartOff: ImageVector
    get() {
        if (_heartOff != null) return _heartOff!!
        _heartOff = lucideOutlineIcon(
            name = "HeartOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.5 4.893c.403 .261 .77 .574 1.091 .931 .106 .113 .254 .177 .409 .177 .155 0 .303-.064 .409-.177C13.927 4.118 16.343 3.53 18.475 4.347c2.132 .817 3.536 2.869 3.525 5.153 0 1.872-1.002 3.356-2.187 4.655")
            addPathData("M16.967 16.967l-3.459 3.346c-.377 .433-.922 .683-1.496 .687-.574 .004-1.122-.24-1.504-.668L5 15C3.5 13.5 2 11.8 2 9.5 2 7.536 3.047 5.722 4.747 4.739")
            addPathData("M2 2 22 22")
        }
        return _heartOff!!
    }

private var _heartOff: ImageVector? = null
