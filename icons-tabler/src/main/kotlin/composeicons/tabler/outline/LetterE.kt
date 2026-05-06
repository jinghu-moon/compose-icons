package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterE: ImageVector
    get() {
        if (_letterE != null) return _letterE!!
        _letterE = tablerOutlineIcon(
            name = "LetterE",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 4h-10v16h10")
            addPathData("M7 12h8")
        }
        return _letterE!!
    }

private var _letterE: ImageVector? = null
