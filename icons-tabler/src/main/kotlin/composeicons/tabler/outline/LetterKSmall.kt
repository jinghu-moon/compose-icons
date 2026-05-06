package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterKSmall: ImageVector
    get() {
        if (_letterKSmall != null) return _letterKSmall!!
        _letterKSmall = tablerOutlineIcon(
            name = "LetterKSmall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.5 8v8")
            addPathData("M14.5 8l-3 4 3 4")
            addPathData("M10.5 12h1")
        }
        return _letterKSmall!!
    }

private var _letterKSmall: ImageVector? = null
