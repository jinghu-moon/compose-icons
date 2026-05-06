package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cable: ImageVector
    get() {
        if (_cable != null) return _cable!!
        _cable = lucideOutlineIcon(
            name = "Cable",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 19c-.552 0-1-.448-1-1v-2c0-1.105 .895-2 2-2h2c1.105 0 2 .895 2 2v2c0 .552-.448 1-1 1Z")
            addPathData("M17 21v-2")
            addPathData("M19 14v-7.5C19 4.567 17.433 3 15.5 3 13.567 3 12 4.567 12 6.5v11C12 19.433 10.433 21 8.5 21 6.567 21 5 19.433 5 17.5v-7.5")
            addPathData("M21 21v-2")
            addPathData("M3 5v-2")
            addPathData("M4 10C2.895 10 2 9.105 2 8v-2C2 5.448 2.448 5 3 5h4c.552 0 1 .448 1 1v2c0 1.105-.895 2-2 2Z")
            addPathData("M7 5v-2")
        }
        return _cable!!
    }

private var _cable: ImageVector? = null
