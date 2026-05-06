package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Store: ImageVector
    get() {
        if (_store != null) return _store!!
        _store = lucideOutlineIcon(
            name = "Store",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 21v-5c0-.552-.448-1-1-1h-4c-.552 0-1 .448-1 1v5")
            addPathData("M17.774 10.31c-.433-.415-1.116-.415-1.549 0-.966 .921-2.485 .921-3.451 0-.433-.414-1.115-.414-1.548 0-.966 .922-2.486 .922-3.452 0-.433-.415-1.116-.415-1.549 0-.931 .888-2.383 .925-3.358 .085C1.893 9.556 1.714 8.114 2.455 7.062L5.344 2.878C5.716 2.329 6.337 2 7 2h10c.661-0 1.28 .327 1.653 .873l2.895 4.192c.741 1.053 .561 2.496-.415 3.335-.976 .839-2.43 .8-3.359-.091")
            addPathData("M4 10.95v8.05c0 1.105 .895 2 2 2h12c1.105 0 2-.895 2-2v-8.05")
        }
        return _store!!
    }

private var _store: ImageVector? = null
