package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EarScan: ImageVector
    get() {
        if (_earScan != null) return _earScan!!
        _earScan = tablerOutlineIcon(
            name = "EarScan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 15c0 1.105-.895 2-2 2-.732 0-1.555-.247-1.72-.98C10.646 13.22 8.11 13.392 8 11v-.5C7.999 8.859 9.139 7.438 10.74 7.082c1.602-.356 3.236 .448 3.931 1.935")
            addPathData("M4 8v-2C4 4.895 4.895 4 6 4h2")
            addPathData("M4 16v2c0 1.105 .895 2 2 2h2")
            addPathData("M16 4h2c1.105 0 2 .895 2 2v2")
            addPathData("M16 20h2c1.105 0 2-.895 2-2v-2")
            addPathData("M13 12v.01")
        }
        return _earScan!!
    }

private var _earScan: ImageVector? = null
