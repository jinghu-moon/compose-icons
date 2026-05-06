package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FlagPause: ImageVector
    get() {
        if (_flagPause != null) return _flagPause!!
        _flagPause = tablerOutlineIcon(
            name = "FlagPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.536 15.029C12.964 14.785 12.443 14.436 12 14 10.056 12.094 6.944 12.094 5 14v-9C6.944 3.094 10.056 3.094 12 5c1.944 1.906 5.056 1.906 7 0v8.5")
            addPathData("M5 21v-7")
            addPathData("M17 17v5")
            addPathData("M21 17v5")
        }
        return _flagPause!!
    }

private var _flagPause: ImageVector? = null
