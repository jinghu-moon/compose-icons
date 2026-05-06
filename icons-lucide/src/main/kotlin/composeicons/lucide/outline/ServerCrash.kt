package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ServerCrash: ImageVector
    get() {
        if (_serverCrash != null) return _serverCrash!!
        _serverCrash = lucideOutlineIcon(
            name = "ServerCrash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 10h-2C2.895 10 2 9.105 2 8v-4C2 2.895 2.895 2 4 2h16c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-2")
            addPathData("M6 14h-2c-1.105 0-2 .895-2 2v4c0 1.105 .895 2 2 2h16c1.105 0 2-.895 2-2v-4c0-1.105-.895-2-2-2h-2")
            addPathData("M6 6h.01")
            addPathData("M6 18h.01")
            addPathData("M13 6 9 12h6l-4 6")
        }
        return _serverCrash!!
    }

private var _serverCrash: ImageVector? = null
