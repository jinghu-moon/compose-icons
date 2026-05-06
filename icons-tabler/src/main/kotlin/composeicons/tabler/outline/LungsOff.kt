package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LungsOff: ImageVector
    get() {
        if (_lungsOff != null) return _lungsOff!!
        _lungsOff = tablerOutlineIcon(
            name = "LungsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.583 6.608C5.377 7.666 4.513 9.234 3.65 12.057c-.42 1.37-.636 2.962-.648 4.775-.012 1.675 1.261 3.054 2.877 3.161L6.082 20C7.693 20 9 18.665 9 17.02v-8.02")
            addPathData("M15 11v-3.743C15 6.563 15.552 6 16.233 6c.204 0 .405 .052 .584 .15l.13 .083c1.46 1.059 2.432 2.647 3.405 5.824 .42 1.37 .636 2.962 .648 4.775 0 .063 0 .125 0 .187M19.545 19.529c-.417 .265-.9 .43-1.419 .464L17.924 20c-1.613 0-2.92-1.335-2.92-2.98v-2.02")
            addPathData("M9 12c.801 .001 1.569-.32 2.132-.89")
            addPathData("M12 4v4")
            addPathData("M3 3 21 21")
        }
        return _lungsOff!!
    }

private var _lungsOff: ImageVector? = null
