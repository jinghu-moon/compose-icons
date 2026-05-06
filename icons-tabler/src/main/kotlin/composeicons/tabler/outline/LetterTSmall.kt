package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterTSmall: ImageVector
    get() {
        if (_letterTSmall != null) return _letterTSmall!!
        _letterTSmall = tablerOutlineIcon(
            name = "LetterTSmall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 8h4")
            addPathData("M12 8v8")
        }
        return _letterTSmall!!
    }

private var _letterTSmall: ImageVector? = null
