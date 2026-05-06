package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Edit: ImageVector
    get() {
        if (_edit != null) return _edit!!
        _edit = tablerOutlineIcon(
            name = "Edit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 7h-1C4.895 7 4 7.895 4 9v9c0 1.105 .895 2 2 2h9c1.105 0 2-.895 2-2v-1")
            addPathData("M20.385 6.585c.82-.82 .82-2.15 0-2.97-.82-.82-2.15-.82-2.97 0L9 12v3h3L20.385 6.585")
            addPathData("M16 5l3 3")
        }
        return _edit!!
    }

private var _edit: ImageVector? = null
