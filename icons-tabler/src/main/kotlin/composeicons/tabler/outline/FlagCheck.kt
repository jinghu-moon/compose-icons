package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FlagCheck: ImageVector
    get() {
        if (_flagCheck != null) return _flagCheck!!
        _flagCheck = tablerOutlineIcon(
            name = "FlagCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.767 15.12C13.105 14.876 12.503 14.494 12 14 10.056 12.094 6.944 12.094 5 14v-9C6.944 3.094 10.056 3.094 12 5c1.944 1.906 5.056 1.906 7 0v8.5")
            addPathData("M5 21v-7")
            addPathData("M15 19l2 2 4-4")
        }
        return _flagCheck!!
    }

private var _flagCheck: ImageVector? = null
