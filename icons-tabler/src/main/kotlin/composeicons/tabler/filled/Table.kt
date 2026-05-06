package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Table: ImageVector
    get() {
        if (_table != null) return _table!!
        _table = tablerFilledIcon(
            name = "Table",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 11h4c.552 0 1 .448 1 1v8c0 .552-.448 1-1 1h-2C4.411 21 3.098 19.762 3.005 18.176L3 18v-6c0-.552 .448-1 1-1Z")
            addPathData("M21 12v6c0 1.589-1.238 2.902-2.824 2.995L18 21h-6c-.552 0-1-.448-1-1v-8c0-.552 .448-1 1-1h8c.552 0 1 .448 1 1Z")
            addPathData("M18 3c1.589-0 2.902 1.238 2.995 2.824L21 6v2c0 .552-.448 1-1 1h-8C11.448 9 11 8.552 11 8v-4c0-.552 .448-1 1-1h6Z")
            addPathData("M9 4v4C9 8.552 8.552 9 8 9h-4C3.448 9 3 8.552 3 8v-2C3 4.411 4.238 3.098 5.824 3.005L6 3h2c.552 0 1 .448 1 1Z")
        }
        return _table!!
    }

private var _table: ImageVector? = null
