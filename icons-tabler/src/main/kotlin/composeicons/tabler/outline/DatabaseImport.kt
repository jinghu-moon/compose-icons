package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DatabaseImport: ImageVector
    get() {
        if (_databaseImport != null) return _databaseImport!!
        _databaseImport = tablerOutlineIcon(
            name = "DatabaseImport",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6c0 1.657 3.582 3 8 3 4.418 0 8-1.343 8-3C20 4.343 16.418 3 12 3 7.582 3 4 4.343 4 6")
            addPathData("M4 6v6c0 1.657 3.582 3 8 3 .856 0 1.68-.05 2.454-.144M20 12v-6")
            addPathData("M4 12v6c0 1.657 3.582 3 8 3 .171 0 .341-.002 .51-.006")
            addPathData("M19 22v-6")
            addPathData("M22 19 19 16l-3 3")
        }
        return _databaseImport!!
    }

private var _databaseImport: ImageVector? = null
