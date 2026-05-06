package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DatabaseExclamation: ImageVector
    get() {
        if (_databaseExclamation != null) return _databaseExclamation!!
        _databaseExclamation = tablerOutlineIcon(
            name = "DatabaseExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6c0 1.657 3.582 3 8 3 4.418 0 8-1.343 8-3C20 4.343 16.418 3 12 3 7.582 3 4 4.343 4 6")
            addPathData("M4 6v6c0 1.657 3.582 3 8 3 1.118 0 2.182-.086 3.148-.241M20 12v-6")
            addPathData("M4 12v6c0 1.657 3.582 3 8 3 1.064 0 2.079-.078 3.007-.22")
            addPathData("M19 16v3")
            addPathData("M19 22v.01")
        }
        return _databaseExclamation!!
    }

private var _databaseExclamation: ImageVector? = null
