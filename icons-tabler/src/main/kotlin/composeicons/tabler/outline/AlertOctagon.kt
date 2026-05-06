package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlertOctagon: ImageVector
    get() {
        if (_alertOctagon != null) return _alertOctagon!!
        _alertOctagon = tablerOutlineIcon(
            name = "AlertOctagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.802 2.165l5.575 2.389c.48 .206 .863 .589 1.07 1.07l2.388 5.574c.22 .512 .22 1.092 0 1.604l-2.389 5.575c-.206 .48-.589 .863-1.07 1.07l-5.574 2.388c-.512 .22-1.092 .22-1.604 0L5.623 19.446c-.481-.206-.864-.589-1.07-1.07L2.165 12.802c-.219-.512-.219-1.092 0-1.604L4.554 5.623c.206-.48 .589-.863 1.07-1.07L11.198 2.165c.512-.219 1.092-.219 1.604 0")
            addPathData("M12 8v4")
            addPathData("M12 16h.01")
        }
        return _alertOctagon!!
    }

private var _alertOctagon: ImageVector? = null
