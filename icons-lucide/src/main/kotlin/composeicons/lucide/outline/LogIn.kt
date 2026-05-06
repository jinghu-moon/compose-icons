package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LogIn: ImageVector
    get() {
        if (_logIn != null) return _logIn!!
        _logIn = lucideOutlineIcon(
            name = "LogIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 17l5-5L10 7")
            addPathData("M15 12h-12")
            addPathData("M15 3h4c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-4")
        }
        return _logIn!!
    }

private var _logIn: ImageVector? = null
