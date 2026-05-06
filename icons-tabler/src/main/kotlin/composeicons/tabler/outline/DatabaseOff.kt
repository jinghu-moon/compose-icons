package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DatabaseOff: ImageVector
    get() {
        if (_databaseOff != null) return _databaseOff!!
        _databaseOff = tablerOutlineIcon(
            name = "DatabaseOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.983 8.978C16.938 8.796 20 7.532 20 6 20 4.343 16.418 3 12 3 10.339 3 8.796 3.19 7.517 3.515M4.734 4.743C4.263 5.125 4 5.551 4 6 4 7.22 5.944 8.271 8.734 8.74")
            addPathData("M4 6v6c0 1.657 3.582 3 8 3 .986 0 1.93-.067 2.802-.19M17.989 13.99C19.24 13.46 20 12.762 20 12v-6")
            addPathData("M4 12v6c0 1.657 3.582 3 8 3 3.217 0 5.991-.712 7.261-1.74M20 16v-4")
            addPathData("M3 3 21 21")
        }
        return _databaseOff!!
    }

private var _databaseOff: ImageVector? = null
