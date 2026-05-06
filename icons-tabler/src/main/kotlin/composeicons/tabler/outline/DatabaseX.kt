package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DatabaseX: ImageVector
    get() {
        if (_databaseX != null) return _databaseX!!
        _databaseX = tablerOutlineIcon(
            name = "DatabaseX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6c0 1.657 3.582 3 8 3 4.418 0 8-1.343 8-3C20 4.343 16.418 3 12 3 7.582 3 4 4.343 4 6")
            addPathData("M4 6v6c0 1.657 3.582 3 8 3 .537 0 1.062-.02 1.57-.058")
            addPathData("M20 13.5v-7.5")
            addPathData("M4 12v6c0 1.657 3.582 3 8 3 .384 0 .762-.01 1.132-.03")
            addPathData("M22 22 17 17")
            addPathData("M17 22l5-5")
        }
        return _databaseX!!
    }

private var _databaseX: ImageVector? = null
