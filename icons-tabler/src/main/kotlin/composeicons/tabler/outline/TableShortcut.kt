package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TableShortcut: ImageVector
    get() {
        if (_tableShortcut != null) return _tableShortcut!!
        _tableShortcut = tablerOutlineIcon(
            name = "TableShortcut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 13v-8C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-8")
            addPathData("M3 10h18")
            addPathData("M10 3v11")
            addPathData("M2 22 7 17")
            addPathData("M7 21.5v-4.5h-4.5")
        }
        return _tableShortcut!!
    }

private var _tableShortcut: ImageVector? = null
