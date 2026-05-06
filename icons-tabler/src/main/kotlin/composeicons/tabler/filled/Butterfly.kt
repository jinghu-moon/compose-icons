package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Butterfly: ImageVector
    get() {
        if (_butterfly != null) return _butterfly!!
        _butterfly = tablerFilledIcon(
            name = "Butterfly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.117 6.244l.228 .076c1.955 .695 3.352 2.43 3.614 4.488 .262 2.058-.656 4.088-2.374 5.25l-.063 .039 .02 .034c.58 1.098 .618 2.404 .101 3.533l-.093 .19c-.505 .967-1.384 1.685-2.432 1.989-1.048 .304-2.174 .166-3.118-.381v-14.857c1.274-.651 2.751-.78 4.118-.36")
            addPathData("M8.505 6c.885 0 1.736 .21 2.495 .597v14.87c-.317 .182-.658 .32-1.012 .41l-.196 .045C8.318 22.218 6.802 21.662 5.869 20.483 4.936 19.305 4.742 17.702 5.368 16.335l.118-.238-.035-.023C3.721 14.916 2.794 12.881 3.054 10.816l.034-.233C3.535 7.939 5.824 6.003 8.505 6")
            addPathData("M14.445 2.168c.46-.307 1.08-.183 1.387 .277 .307 .46 .183 1.08-.277 1.387l-3 2c-.336 .224-.774 .224-1.11 0l-3-2C7.985 3.525 7.861 2.905 8.168 2.445c.307-.46 .927-.584 1.387-.277l2.444 1.63Z")
        }
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
