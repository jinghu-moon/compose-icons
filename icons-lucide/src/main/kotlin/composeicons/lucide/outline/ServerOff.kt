package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ServerOff: ImageVector
    get() {
        if (_serverOff != null) return _serverOff!!
        _serverOff = lucideOutlineIcon(
            name = "ServerOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 2h13c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-5")
            addPathData("M10 10 2.5 2.5C2 2 2 2.5 2 5v3c0 1.105 .895 2 2 2h6Z")
            addPathData("M22 17v-1c0-1.105-.895-2-2-2h-1")
            addPathData("M4 14c-1.105 0-2 .895-2 2v4c0 1.105 .895 2 2 2h16.5l1-.5L22 22 14 14h-10Z")
            addPathData("M6 18h.01")
            addPathData("M2 2 22 22")
        }
        return _serverOff!!
    }

private var _serverOff: ImageVector? = null
