package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HandMetal: ImageVector
    get() {
        if (_handMetal != null) return _handMetal!!
        _handMetal = lucideOutlineIcon(
            name = "HandMetal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 12.5v-2.5C18 8.895 17.105 8 16 8c-1.105 0-2 .895-2 2v1.4")
            addPathData("M14 11v-2C14 7.895 13.105 7 12 7c-1.105 0-2 .895-2 2v2")
            addPathData("M10 10.5v-5.5C10 3.895 9.105 3 8 3 6.895 3 6 3.895 6 5v9")
            addPathData("M7 15 5.24 13.24c-.789-.717-2.002-.69-2.757 .063-.755 .753-.787 1.966-.073 2.757l3.6 3.6C7.5 21.14 9.2 22 12 22h2c4.418 0 8-3.582 8-8v-7C22 5.895 21.105 5 20 5c-1.105 0-2 .895-2 2v5")
        }
        return _handMetal!!
    }

private var _handMetal: ImageVector? = null
