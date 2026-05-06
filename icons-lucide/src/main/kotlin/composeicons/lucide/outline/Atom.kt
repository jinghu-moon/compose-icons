package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Atom: ImageVector
    get() {
        if (_atom != null) return _atom!!
        _atom = lucideOutlineIcon(
            name = "Atom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 12c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M20.2 20.2c2.04-2.03 .02-7.36-4.5-11.9C11.16 3.78 5.83 1.76 3.8 3.8 1.76 5.83 3.78 11.16 8.3 15.7c4.54 4.52 9.87 6.54 11.9 4.5Z")
            addPathData("M15.7 15.7C20.22 11.16 22.24 5.83 20.2 3.8 18.17 1.76 12.84 3.78 8.3 8.3 3.78 12.84 1.76 18.17 3.8 20.2c2.03 2.04 7.36 .02 11.9-4.5Z")
        }
        return _atom!!
    }

private var _atom: ImageVector? = null
