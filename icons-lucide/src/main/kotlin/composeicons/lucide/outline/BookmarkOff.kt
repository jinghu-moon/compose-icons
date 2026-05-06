package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BookmarkOff: ImageVector
    get() {
        if (_bookmarkOff != null) return _bookmarkOff!!
        _bookmarkOff = lucideOutlineIcon(
            name = "BookmarkOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 19v1c-0 .356-.19 .686-.498 .865-.308 .179-.688 .18-.998 .003L12.992 18.29c-.615-.351-1.369-.351-1.984 0L6.496 20.868c-.309 .177-.69 .175-.998-.003C5.19 20.686 5 20.356 5 20v-15")
            addPathData("M2 2 22 22")
            addPathData("M8.656 3h8.344c1.105 0 2 .895 2 2v8.344")
        }
        return _bookmarkOff!!
    }

private var _bookmarkOff: ImageVector? = null
