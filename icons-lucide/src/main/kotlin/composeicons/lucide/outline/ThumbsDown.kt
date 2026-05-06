package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) return _thumbsDown!!
        _thumbsDown = lucideOutlineIcon(
            name = "ThumbsDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 18.12 10 14h-5.83c-.63 0-1.222-.296-1.6-.8-.378-.504-.496-1.156-.32-1.76L4.58 3.44C4.829 2.587 5.611 2 6.5 2h13.5c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-2.76c-.759 0-1.452 .43-1.79 1.11L12 22c-.955-.012-1.853-.459-2.437-1.215C8.978 20.029 8.771 19.048 9 18.12Z")
            addPathData("M17 14v-12")
        }
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
