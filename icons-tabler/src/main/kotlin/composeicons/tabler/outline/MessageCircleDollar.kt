package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MessageCircleDollar: ImageVector
    get() {
        if (_messageCircleDollar != null) return _messageCircleDollar!!
        _messageCircleDollar = tablerOutlineIcon(
            name = "MessageCircleDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.16 19.914C11.29 20.133 9.397 19.816 7.7 19L3 20 4.3 16.1C1.976 12.663 2.874 8.228 6.4 5.726 9.926 3.225 14.99 3.43 18.245 6.206c1.384 1.181 2.26 2.672 2.603 4.243")
            addPathData("M21 15h-2.5C17.672 15 17 15.672 17 16.5c0 .828 .672 1.5 1.5 1.5h1c.828 0 1.5 .672 1.5 1.5C21 20.328 20.328 21 19.5 21h-2.5")
            addPathData("M19 21v1M19 14v1")
        }
        return _messageCircleDollar!!
    }

private var _messageCircleDollar: ImageVector? = null
