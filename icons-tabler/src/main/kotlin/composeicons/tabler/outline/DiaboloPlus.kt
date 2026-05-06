package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DiaboloPlus: ImageVector
    get() {
        if (_diaboloPlus != null) return _diaboloPlus!!
        _diaboloPlus = tablerOutlineIcon(
            name = "DiaboloPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6c0 1.657 3.582 3 8 3 4.418 0 8-1.343 8-3C20 4.343 16.418 3 12 3 7.582 3 4 4.343 4 6")
            addPathData("M4 6v.143c-0 .104 .016 .208 .048 .307L6 12 4.036 17.67c-.024 .086-.036 .175-.036 .265v.065c0 1.657 3.582 3 8 3 .17 0 .34-.002 .508-.006M18 12 19.952 6.45c.032-.099 .048-.203 .048-.307v-.143")
            addPathData("M6 12c0 1.105 2.686 2 6 2 3.314 0 6-.895 6-2")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _diaboloPlus!!
    }

private var _diaboloPlus: ImageVector? = null
