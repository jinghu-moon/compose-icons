package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterESmall: ImageVector
    get() {
        if (_letterESmall != null) return _letterESmall!!
        _letterESmall = tablerOutlineIcon(
            name = "LetterESmall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 8h-4v8h4")
            addPathData("M10 12h2.5")
        }
        return _letterESmall!!
    }

private var _letterESmall: ImageVector? = null
