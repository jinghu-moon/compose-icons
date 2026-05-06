package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Flower: ImageVector
    get() {
        if (_flower != null) return _flower!!
        _flower = lucideOutlineIcon(
            name = "Flower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 12c0 1.657-1.343 3-3 3C10.343 15 9 13.657 9 12 9 10.343 10.343 9 12 9c1.657 0 3 1.343 3 3Z")
            addPathData("M12 16.5C12 18.985 9.985 21 7.5 21 5.015 21 3 18.985 3 16.5 3 14.015 5.015 12 7.5 12 5.015 12 3 9.985 3 7.5 3 5.015 5.015 3 7.5 3 9.985 3 12 5.015 12 7.5 12 5.015 14.015 3 16.5 3 18.985 3 21 5.015 21 7.5 21 9.985 18.985 12 16.5 12 18.985 12 21 14.015 21 16.5 21 18.985 18.985 21 16.5 21 14.015 21 12 18.985 12 16.5")
            addPathData("M12 7.5v1.5")
            addPathData("M7.5 12h1.5")
            addPathData("M16.5 12h-1.5")
            addPathData("M12 16.5v-1.5")
            addPathData("M8 8 9.88 9.88")
            addPathData("M14.12 9.88 16 8")
            addPathData("M8 16 9.88 14.12")
            addPathData("M14.12 14.12 16 16")
        }
        return _flower!!
    }

private var _flower: ImageVector? = null
