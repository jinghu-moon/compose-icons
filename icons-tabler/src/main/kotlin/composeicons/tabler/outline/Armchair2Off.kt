package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Armchair2Off: ImageVector
    get() {
        if (_armchair2Off != null) return _armchair2Off!!
        _armchair2Off = tablerOutlineIcon(
            name = "Armchair2Off",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 10v-4c-0-.294 .043-.587 .128-.869M7.166 3.118C7.43 3.04 7.71 3 8 3h8c1.657 0 3 1.343 3 3v4")
            addPathData("M16.124 12.145c.409-1.372 1.73-2.265 3.156-2.131 1.426 .134 2.558 1.256 2.704 2.681 .146 1.424-.735 2.753-2.104 3.174M19 19h-14v-3C3.343 16 2 14.657 2 13 2 11.343 3.343 10 5 10c1.657 0 3 1.343 3 3v2")
            addPathData("M8 12h4")
            addPathData("M7 19v2")
            addPathData("M17 19v2")
            addPathData("M3 3 21 21")
        }
        return _armchair2Off!!
    }

private var _armchair2Off: ImageVector? = null
