package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Drone: ImageVector
    get() {
        if (_drone != null) return _drone!!
        _drone = lucideOutlineIcon(
            name = "Drone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 10 7 7")
            addPathData("M10 14 7 17")
            addPathData("M14 10 17 7")
            addPathData("M14 14l3 3")
            addPathData("M14.205 4.139c1.04-1.016 2.549-1.387 3.942-.971 1.393 .417 2.45 1.556 2.761 2.976 .311 1.42-.173 2.897-1.263 3.858")
            addPathData("M19.637 14c1.1 .957 1.592 2.438 1.283 3.863-.308 1.425-1.368 2.57-2.765 2.987-1.397 .417-2.911 .041-3.95-.982")
            addPathData("M4.367 10C3.266 9.042 2.774 7.56 3.083 6.134 3.393 4.708 4.455 3.563 5.854 3.148c1.399-.415 2.913-.036 3.951 .99")
            addPathData("M9.795 19.862c-1.043 1.009-2.55 1.375-3.939 .955C4.467 20.397 3.414 19.258 3.105 17.841c-.309-1.418 .173-2.892 1.261-3.852")
            addPathData("M11 8h2c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-6c0-.552 .448-1 1-1Z")
        }
        return _drone!!
    }

private var _drone: ImageVector? = null
