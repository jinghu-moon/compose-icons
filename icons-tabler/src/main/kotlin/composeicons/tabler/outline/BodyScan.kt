package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BodyScan: ImageVector
    get() {
        if (_bodyScan != null) return _bodyScan!!
        _bodyScan = tablerOutlineIcon(
            name = "BodyScan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 8v-2C4 4.895 4.895 4 6 4h2")
            addPathData("M4 16v2c0 1.105 .895 2 2 2h2")
            addPathData("M16 4h2c1.105 0 2 .895 2 2v2")
            addPathData("M16 20h2c1.105 0 2-.895 2-2v-2")
            addPathData("M11 8c0 .552 .448 1 1 1 .552 0 1-.448 1-1C13 7.448 12.552 7 12 7c-.552 0-1 .448-1 1")
            addPathData("M10 17v-1c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v1")
            addPathData("M8 10c.666 .666 1.334 1 2 1h4c.666 0 1.334-.334 2-1")
            addPathData("M12 11v3")
        }
        return _bodyScan!!
    }

private var _bodyScan: ImageVector? = null
