package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) return _graduationCap!!
        _graduationCap = lucideOutlineIcon(
            name = "GraduationCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21.42 10.922c.366-.161 .6-.525 .596-.925-.004-.4-.246-.759-.615-.913L12.83 5.18c-.527-.24-1.133-.24-1.66 0L2.6 9.08c-.364 .159-.599 .519-.599 .916 0 .397 .235 .757 .599 .916l8.57 3.908c.527 .24 1.133 .24 1.66 0Z")
            addPathData("M22 10v6")
            addPathData("M6 12.5v3.5c0 1.657 2.686 3 6 3 3.314 0 6-1.343 6-3v-3.5")
        }
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
