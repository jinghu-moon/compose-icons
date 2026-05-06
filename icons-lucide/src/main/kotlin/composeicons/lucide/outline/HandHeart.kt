package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HandHeart: ImageVector
    get() {
        if (_handHeart != null) return _handHeart!!
        _handHeart = lucideOutlineIcon(
            name = "HandHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 14h2c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2h-3c-.6 0-1.1 .2-1.4 .6L3 16")
            addPathData("M14.45 13.39 19.5 8.696C20.196 8 21 6.85 21 5.75 21 4.61 20.298 3.589 19.233 3.181c-1.064-.408-2.269-.116-3.03 .732-.052 .057-.126 .089-.203 .089-.077 0-.151-.032-.203-.089C15.036 3.065 13.831 2.774 12.767 3.181 11.702 3.589 11 4.61 11 5.75c0 1.2 .802 2.248 1.5 2.946L16 11.95")
            addPathData("M2 15l6 6")
            addPathData("M7 20 8.6 18.6C8.9 18.2 9.4 18 10 18h4c1.1 0 2.1-.4 2.8-1.2l4.6-4.4c.804-.759 .839-2.026 .08-2.83-.759-.804-2.026-.839-2.83-.08")
        }
        return _handHeart!!
    }

private var _handHeart: ImageVector? = null
