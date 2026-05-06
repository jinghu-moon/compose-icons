package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterY: ImageVector
    get() {
        if (_letterY != null) return _letterY!!
        _letterY = tablerOutlineIcon(
            name = "LetterY",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 4l5 9L17 4")
            addPathData("M12 13v7")
        }
        return _letterY!!
    }

private var _letterY: ImageVector? = null
