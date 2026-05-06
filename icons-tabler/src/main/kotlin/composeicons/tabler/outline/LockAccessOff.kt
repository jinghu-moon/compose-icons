package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LockAccessOff: ImageVector
    get() {
        if (_lockAccessOff != null) return _lockAccessOff!!
        _lockAccessOff = tablerOutlineIcon(
            name = "LockAccessOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 8v-2C4 5.446 4.225 4.945 4.588 4.583")
            addPathData("M4 16v2c0 1.105 .895 2 2 2h2")
            addPathData("M16 4h2c1.105 0 2 .895 2 2v2")
            addPathData("M16 20h2c.55 0 1.05-.222 1.41-.582")
            addPathData("M15 11c.552 0 1 .448 1 1M15.71 15.704c-.188 .189-.443 .296-.71 .296h-6C8.448 16 8 15.552 8 15v-3c0-.552 .448-1 1-1h2")
            addPathData("M10 11v-1M11.182 7.174c.619-.277 1.336-.222 1.906 .147 .569 .369 .913 1.001 .912 1.679v1")
            addPathData("M3 3 21 21")
        }
        return _lockAccessOff!!
    }

private var _lockAccessOff: ImageVector? = null
