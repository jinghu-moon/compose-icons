package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CodeCircle2: ImageVector
    get() {
        if (_codeCircle2 != null) return _codeCircle2!!
        _codeCircle2 = tablerOutlineIcon(
            name = "CodeCircle2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.5 13.5 7 12 8.5 10.5")
            addPathData("M15.5 10.5 17 12l-1.5 1.5")
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M13 9.5 11 15")
        }
        return _codeCircle2!!
    }

private var _codeCircle2: ImageVector? = null
