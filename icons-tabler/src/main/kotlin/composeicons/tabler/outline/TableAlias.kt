package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TableAlias: ImageVector
    get() {
        if (_tableAlias != null) return _tableAlias!!
        _tableAlias = tablerOutlineIcon(
            name = "TableAlias",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12v-7C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-7")
            addPathData("M3 10h18")
            addPathData("M10 3v10")
            addPathData("M2 17c0-.552 .448-1 1-1h4c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4C2.448 22 2 21.552 2 21v-4")
        }
        return _tableAlias!!
    }

private var _tableAlias: ImageVector? = null
