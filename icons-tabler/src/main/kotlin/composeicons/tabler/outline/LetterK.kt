package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterK: ImageVector
    get() {
        if (_letterK != null) return _letterK!!
        _letterK = tablerOutlineIcon(
            name = "LetterK",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 4v16")
            addPathData("M7 12h2L17 4")
            addPathData("M9 12l8 8")
        }
        return _letterK!!
    }

private var _letterK: ImageVector? = null
