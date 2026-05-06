package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Schema: ImageVector
    get() {
        if (_schema != null) return _schema!!
        _schema = tablerOutlineIcon(
            name = "Schema",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 2h5v4h-5v-4")
            addPathData("M15 10h5v4h-5v-4")
            addPathData("M5 18h5v4h-5v-4")
            addPathData("M5 10h5v4h-5v-4")
            addPathData("M10 12h5")
            addPathData("M7.5 6v4")
            addPathData("M7.5 14v4")
        }
        return _schema!!
    }

private var _schema: ImageVector? = null
