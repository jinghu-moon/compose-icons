package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cat: ImageVector
    get() {
        if (_cat != null) return _cat!!
        _cat = lucideOutlineIcon(
            name = "Cat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 5c.67 0 1.35 .09 2 .26C15.78 3.26 19.03 2.42 20.42 3 21.82 3.58 20 10 20 10c.57 1.07 1 2.24 1 3.44C21 17.9 16.97 21 12 21 7.03 21 3 18 3 13.44 3 12.19 3.5 11.04 4 10 4 10 2.11 3.58 3.5 3 4.89 2.42 8.22 3.23 10 5.23c.656-.151 1.327-.228 2-.23Z")
            addPathData("M8 14v.5")
            addPathData("M16 14v.5")
            addPathData("M11.25 16.25h1.5L12 17l-.75-.75Z")
        }
        return _cat!!
    }

private var _cat: ImageVector? = null
