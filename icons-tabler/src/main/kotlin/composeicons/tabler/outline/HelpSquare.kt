package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HelpSquare: ImageVector
    get() {
        if (_helpSquare != null) return _helpSquare!!
        _helpSquare = tablerOutlineIcon(
            name = "HelpSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14")
            addPathData("M12 16v.01")
            addPathData("M12 13c.926 .003 1.733-.63 1.95-1.53 .217-.9-.211-1.831-1.036-2.252-.819-.42-1.819-.219-2.414 .483")
        }
        return _helpSquare!!
    }

private var _helpSquare: ImageVector? = null
