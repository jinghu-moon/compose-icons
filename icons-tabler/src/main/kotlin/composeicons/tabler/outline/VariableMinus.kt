package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.VariableMinus: ImageVector
    get() {
        if (_variableMinus != null) return _variableMinus!!
        _variableMinus = tablerOutlineIcon(
            name = "VariableMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 16c1.5 0 3-2 4-3.5C13 11 14.5 9 16 9")
            addPathData("M5 4C2.5 9 2.5 14 5 20M19 4c1.775 3.55 2.29 7.102 1.544 11.01M9 9h1c1 0 1 1 2.016 3.527 .782 1.966 .943 3 1.478 3.343")
            addPathData("M8 16c1.5 0 3-2 4-3.5C13 11 14.5 9 16 9")
            addPathData("M16 19h6")
        }
        return _variableMinus!!
    }

private var _variableMinus: ImageVector? = null
