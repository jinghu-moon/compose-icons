package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.VariablePlus: ImageVector
    get() {
        if (_variablePlus != null) return _variablePlus!!
        _variablePlus = tablerOutlineIcon(
            name = "VariablePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 4C2.5 9 2.5 14 5 20M19 4c1.38 2.76 2 5.52 1.855 8.448M9 9h1c1 0 1 1 2.016 3.527 .785 1.972 .944 3.008 1.483 3.346")
            addPathData("M8 16c1.5 0 3-2 4-3.5C13 11 14.5 9 16 9")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _variablePlus!!
    }

private var _variablePlus: ImageVector? = null
