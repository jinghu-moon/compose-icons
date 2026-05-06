package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Footprints: ImageVector
    get() {
        if (_footprints != null) return _footprints!!
        _footprints = lucideOutlineIcon(
            name = "Footprints",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 16v-2.38C4 11.5 2.97 10.5 3 8 3.03 5.28 4.49 2 7.5 2 9.37 2 10 3.8 10 5.5c0 3.11-2 5.66-2 8.68v1.82c0 1.105-.895 2-2 2C4.895 18 4 17.105 4 16Z")
            addPathData("M20 20v-2.38C20 15.5 21.03 14.5 21 12 20.97 9.28 19.51 6 16.5 6 14.63 6 14 7.8 14 9.5c0 3.11 2 5.66 2 8.68v1.82c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2Z")
            addPathData("M16 17h4")
            addPathData("M4 13h4")
        }
        return _footprints!!
    }

private var _footprints: ImageVector? = null
