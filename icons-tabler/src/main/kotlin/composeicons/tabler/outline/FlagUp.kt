package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FlagUp: ImageVector
    get() {
        if (_flagUp != null) return _flagUp!!
        _flagUp = tablerOutlineIcon(
            name = "FlagUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.138 15.241C13.332 15.014 12.597 14.587 12 14 10.056 12.094 6.944 12.094 5 14v-9C6.944 3.094 10.056 3.094 12 5c1.944 1.906 5.056 1.906 7 0v7")
            addPathData("M5 21v-7")
            addPathData("M19 22v-6")
            addPathData("M22 19 19 16l-3 3")
        }
        return _flagUp!!
    }

private var _flagUp: ImageVector? = null
