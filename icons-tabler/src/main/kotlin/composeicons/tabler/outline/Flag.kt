package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Flag: ImageVector
    get() {
        if (_flag != null) return _flag!!
        _flag = tablerOutlineIcon(
            name = "Flag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 5C6.944 3.094 10.056 3.094 12 5c1.944 1.906 5.056 1.906 7 0v9c-1.944 1.906-5.056 1.906-7 0C10.056 12.094 6.944 12.094 5 14v-9")
            addPathData("M5 21v-7")
        }
        return _flag!!
    }

private var _flag: ImageVector? = null
