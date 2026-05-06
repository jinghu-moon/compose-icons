package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HelpOctagon: ImageVector
    get() {
        if (_helpOctagon != null) return _helpOctagon!!
        _helpOctagon = tablerOutlineIcon(
            name = "HelpOctagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.802 2.165l5.575 2.389c.48 .206 .863 .589 1.07 1.07l2.388 5.574c.22 .512 .22 1.092 0 1.604l-2.389 5.575c-.206 .48-.589 .863-1.07 1.07l-5.574 2.388c-.512 .22-1.092 .22-1.604 0L5.623 19.446c-.481-.206-.864-.589-1.07-1.07L2.165 12.802c-.219-.512-.219-1.092 0-1.604L4.554 5.623c.206-.48 .589-.863 1.07-1.07L11.198 2.165c.512-.219 1.092-.219 1.604 0")
            addPathData("M12 16v.01")
            addPathData("M12 13c.926 .003 1.733-.63 1.95-1.53 .217-.9-.211-1.831-1.036-2.252-.819-.42-1.819-.219-2.414 .483")
        }
        return _helpOctagon!!
    }

private var _helpOctagon: ImageVector? = null
