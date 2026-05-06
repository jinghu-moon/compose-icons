package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Ship: ImageVector
    get() {
        if (_ship != null) return _ship!!
        _ship = lucideOutlineIcon(
            name = "Ship",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 10.189v3.811")
            addPathData("M12 2v3")
            addPathData("M19 13v-6C19 5.895 18.105 5 17 5h-10C5.895 5 5 5.895 5 7v6")
            addPathData("M19.38 20C20.456 18.185 21.016 16.11 21 14L12.812 10.361c-.517-.23-1.107-.23-1.624 0L3 14c-.046 2.844 .954 5.605 2.81 7.76")
            addPathData("M2 21c.6 .5 1.2 1 2.5 1C7 22 7 20 9.5 20c1.3 0 1.9 .5 2.5 1 .6 .5 1.2 1 2.5 1 2.5 0 2.5-2 5-2 1.3 0 1.9 .5 2.5 1")
        }
        return _ship!!
    }

private var _ship: ImageVector? = null
