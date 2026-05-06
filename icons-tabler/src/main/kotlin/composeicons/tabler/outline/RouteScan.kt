package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RouteScan: ImageVector
    get() {
        if (_routeScan != null) return _routeScan!!
        _routeScan = tablerOutlineIcon(
            name = "RouteScan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 8v-2C4 4.895 4.895 4 6 4h2")
            addPathData("M4 16v2c0 1.105 .895 2 2 2h2")
            addPathData("M16 4h2c1.105 0 2 .895 2 2v2")
            addPathData("M16 20h2c1.105 0 2-.895 2-2v-2")
            addPathData("M7 12v-3h3")
            addPathData("M14 9h3v3")
            addPathData("M7 9l4.414 4.414c.375 .375 .586 .884 .586 1.414v2.172")
            addPathData("M17 9l-4.414 4.414c-.375 .375-.586 .884-.586 1.414v2.172")
        }
        return _routeScan!!
    }

private var _routeScan: ImageVector? = null
