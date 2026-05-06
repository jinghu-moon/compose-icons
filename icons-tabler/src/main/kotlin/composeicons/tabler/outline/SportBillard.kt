package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SportBillard: ImageVector
    get() {
        if (_sportBillard != null) return _sportBillard!!
        _sportBillard = tablerOutlineIcon(
            name = "SportBillard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 10c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C14 8.895 13.105 8 12 8c-1.105 0-2 .895-2 2")
            addPathData("M10 14c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M4 12c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C20 7.582 16.418 4 12 4 7.582 4 4 7.582 4 12")
        }
        return _sportBillard!!
    }

private var _sportBillard: ImageVector? = null
