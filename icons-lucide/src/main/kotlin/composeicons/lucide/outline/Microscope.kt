package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Microscope: ImageVector
    get() {
        if (_microscope != null) return _microscope!!
        _microscope = lucideOutlineIcon(
            name = "Microscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 18h8")
            addPathData("M3 22h18")
            addPathData("M14 22c3.866 0 7-3.134 7-7C21 11.134 17.866 8 14 8h-1")
            addPathData("M9 14h2")
            addPathData("M9 12C7.895 12 7 11.105 7 10v-4h6v4c0 1.105-.895 2-2 2Z")
            addPathData("M12 6v-3C12 2.448 11.552 2 11 2h-2C8.448 2 8 2.448 8 3v3")
        }
        return _microscope!!
    }

private var _microscope: ImageVector? = null
