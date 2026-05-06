package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SchemaOff: ImageVector
    get() {
        if (_schemaOff != null) return _schemaOff!!
        _schemaOff = tablerOutlineIcon(
            name = "SchemaOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 2h4v4M6 6h-1v-1")
            addPathData("M15 11v-1h5v4h-2")
            addPathData("M5 18h5v4h-5v-4")
            addPathData("M5 10h5v4h-5v-4")
            addPathData("M10 12h2")
            addPathData("M7.5 7.5v2.5")
            addPathData("M7.5 14v4")
            addPathData("M3 3 21 21")
        }
        return _schemaOff!!
    }

private var _schemaOff: ImageVector? = null
