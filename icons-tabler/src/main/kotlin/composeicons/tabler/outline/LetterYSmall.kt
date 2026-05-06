package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterYSmall: ImageVector
    get() {
        if (_letterYSmall != null) return _letterYSmall!!
        _letterYSmall = tablerOutlineIcon(
            name = "LetterYSmall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 8l2 5L14 8")
            addPathData("M12 16v-3")
        }
        return _letterYSmall!!
    }

private var _letterYSmall: ImageVector? = null
