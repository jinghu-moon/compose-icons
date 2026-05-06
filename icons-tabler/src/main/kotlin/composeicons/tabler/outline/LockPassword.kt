package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LockPassword: ImageVector
    get() {
        if (_lockPassword != null) return _lockPassword!!
        _lockPassword = tablerOutlineIcon(
            name = "LockPassword",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 13c0-1.105 .895-2 2-2h10c1.105 0 2 .895 2 2v6c0 1.105-.895 2-2 2h-10C5.895 21 5 20.105 5 19v-6")
            addPathData("M8 11v-4C8 4.791 9.791 3 12 3c2.209 0 4 1.791 4 4v4")
            addPathData("M15 16h.01")
            addPathData("M12.01 16h.01")
            addPathData("M9.02 16h.01")
        }
        return _lockPassword!!
    }

private var _lockPassword: ImageVector? = null
