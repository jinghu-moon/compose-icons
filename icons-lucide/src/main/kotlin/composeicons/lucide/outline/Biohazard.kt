package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Biohazard: ImageVector
    get() {
        if (_biohazard != null) return _biohazard!!
        _biohazard = lucideOutlineIcon(
            name = "Biohazard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 11.9c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M6.7 3.4c-.9 2.5 0 5.2 2.2 6.7C6.5 9 3.7 9.6 2 11.6")
            addPathData("M8.9 10.1l1.4 .8")
            addPathData("M17.3 3.4c.9 2.5 0 5.2-2.2 6.7C17.5 8.9 20.3 9.5 22 11.6")
            addPathData("M15.1 10.1l-1.4 .8")
            addPathData("M16.7 20.8C14.1 20.4 12.1 18.2 12 15.5c-.2 2.6-2.1 4.8-4.7 5.2")
            addPathData("M12 13.9v1.6")
            addPathData("M13.5 5.4c-1-.2-2-.2-3 0")
            addPathData("M17 16.4c.7-.7 1.2-1.6 1.5-2.5")
            addPathData("M5.5 13.9c.3 .9 .8 1.8 1.5 2.5")
        }
        return _biohazard!!
    }

private var _biohazard: ImageVector? = null
