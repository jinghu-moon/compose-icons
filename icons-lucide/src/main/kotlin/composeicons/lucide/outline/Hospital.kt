package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Hospital: ImageVector
    get() {
        if (_hospital != null) return _hospital!!
        _hospital = lucideOutlineIcon(
            name = "Hospital",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 7v4")
            addPathData("M14 21v-3c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2v3")
            addPathData("M14 9h-4")
            addPathData("M18 11h2c1.105 0 2 .895 2 2v6c0 1.105-.895 2-2 2h-16C2.895 21 2 20.105 2 19v-9C2 8.895 2.895 8 4 8h2")
            addPathData("M18 21v-16C18 3.895 17.105 3 16 3h-8C6.895 3 6 3.895 6 5v16")
        }
        return _hospital!!
    }

private var _hospital: ImageVector? = null
