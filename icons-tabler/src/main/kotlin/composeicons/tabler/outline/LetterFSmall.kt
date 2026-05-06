package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterFSmall: ImageVector
    get() {
        if (_letterFSmall != null) return _letterFSmall!!
        _letterFSmall = tablerOutlineIcon(
            name = "LetterFSmall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12h3")
            addPathData("M14 8h-4v8")
        }
        return _letterFSmall!!
    }

private var _letterFSmall: ImageVector? = null
