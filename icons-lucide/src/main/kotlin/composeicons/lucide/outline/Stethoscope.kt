package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) return _stethoscope!!
        _stethoscope = lucideOutlineIcon(
            name = "Stethoscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 2v2")
            addPathData("M5 2v2")
            addPathData("M5 3h-1C2.895 3 2 3.895 2 5v4c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-4C14 3.895 13.105 3 12 3h-1")
            addPathData("M8 15c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-3")
            addPathData("M22 10c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
