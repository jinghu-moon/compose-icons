package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Moped: ImageVector
    get() {
        if (_moped != null) return _moped!!
        _moped = tablerOutlineIcon(
            name = "Moped",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M5 16v1c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-5h-3C4.343 12 3 13.343 3 15v1h10c.756-2.186 2.702-3.742 5-4v-5C18 5.895 17.105 5 16 5h-1")
            addPathData("M6 9h3")
        }
        return _moped!!
    }

private var _moped: ImageVector? = null
