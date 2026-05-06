package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sql: ImageVector
    get() {
        if (_sql != null) return _sql!!
        _sql = tablerOutlineIcon(
            name = "Sql",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 8c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2v-4c0-1.105 .895-2 2-2")
            addPathData("M17 8v8h4")
            addPathData("M13 15l1 1")
            addPathData("M3 15c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-2C7 12.448 6.552 12 6 12h-2C3.448 12 3 11.552 3 11v-2C3 8.448 3.448 8 4 8h2c.552 0 1 .448 1 1")
        }
        return _sql!!
    }

private var _sql: ImageVector? = null
