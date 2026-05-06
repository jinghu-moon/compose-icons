package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterT: ImageVector
    get() {
        if (_letterT != null) return _letterT!!
        _letterT = tablerOutlineIcon(
            name = "LetterT",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 4h12")
            addPathData("M12 4v16")
        }
        return _letterT!!
    }

private var _letterT: ImageVector? = null
