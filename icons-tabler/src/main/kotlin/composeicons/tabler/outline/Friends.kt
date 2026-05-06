package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Friends: ImageVector
    get() {
        if (_friends != null) return _friends!!
        _friends = tablerOutlineIcon(
            name = "Friends",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 5c0 1.105 .895 2 2 2C8.105 7 9 6.105 9 5 9 3.895 8.105 3 7 3 5.895 3 5 3.895 5 5")
            addPathData("M5 22v-5L4 16v-4c0-.552 .448-1 1-1h4c.552 0 1 .448 1 1v4L9 17v5")
            addPathData("M15 5c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C19 3.895 18.105 3 17 3c-1.105 0-2 .895-2 2")
            addPathData("M15 22v-4h-2l2-6c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1l2 6h-2v4")
        }
        return _friends!!
    }

private var _friends: ImageVector? = null
