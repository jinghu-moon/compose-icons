package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SailboatOff: ImageVector
    get() {
        if (_sailboatOff != null) return _sailboatOff!!
        _sailboatOff = tablerOutlineIcon(
            name = "SailboatOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 20c.461 .643 1.209 1.017 2 1 .791 .017 1.539-.357 2-1 .461-.643 1.209-1.017 2-1 .791-.017 1.539 .357 2 1 .461 .643 1.209 1.017 2 1 .791 .017 1.539-.357 2-1 .461-.643 1.209-1.017 2-1 .791-.017 1.539 .357 2 1 .461 .643 1.209 1.017 2 1 .791 .017 1.539-.357 2-1")
            addPathData("M4 18 3 15h12M19 15h2l-.506 1.517")
            addPathData("M11 11v1h1M16 12h2L11 3v4")
            addPathData("M7.713 7.718 6 12")
            addPathData("M3 3 21 21")
        }
        return _sailboatOff!!
    }

private var _sailboatOff: ImageVector? = null
