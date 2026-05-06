package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SwatchBook: ImageVector
    get() {
        if (_swatchBook != null) return _swatchBook!!
        _swatchBook = lucideOutlineIcon(
            name = "SwatchBook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 17c0 2.209-1.791 4-4 4C4.791 21 3 19.209 3 17v-12C3 3.895 3.895 3 5 3h4c1.105 0 2 .895 2 2Z")
            addPathData("M16.7 13h2.3c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-12")
            addPathData("M7 17h.01")
            addPathData("M11 8 13.3 5.7c.451-.453 1.064-.707 1.703-.706 .639 .001 1.251 .256 1.701 .71l1.896 1.896c.466 .448 .731 1.065 .736 1.712 .005 .646-.251 1.267-.71 1.722L9.9 19.8")
        }
        return _swatchBook!!
    }

private var _swatchBook: ImageVector? = null
