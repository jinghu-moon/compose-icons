package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FlagBolt: ImageVector
    get() {
        if (_flagBolt != null) return _flagBolt!!
        _flagBolt = tablerOutlineIcon(
            name = "FlagBolt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.673 15.36C13.663 15.192 12.73 14.717 12 14 10.056 12.094 6.944 12.094 5 14v-9C6.944 3.094 10.056 3.094 12 5c1.944 1.906 5.056 1.906 7 0v7")
            addPathData("M5 21v-7")
            addPathData("M19 16l-2 3h4l-2 3")
        }
        return _flagBolt!!
    }

private var _flagBolt: ImageVector? = null
