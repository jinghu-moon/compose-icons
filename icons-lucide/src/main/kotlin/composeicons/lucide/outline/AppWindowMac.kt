package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AppWindowMac: ImageVector
    get() {
        if (_appWindowMac != null) return _appWindowMac!!
        _appWindowMac = lucideOutlineIcon(
            name = "AppWindowMac",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 4h16c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-16C2.895 20 2 19.105 2 18v-12C2 4.895 2.895 4 4 4Z")
            addPathData("M6 8h.01")
            addPathData("M10 8h.01")
            addPathData("M14 8h.01")
        }
        return _appWindowMac!!
    }

private var _appWindowMac: ImageVector? = null
