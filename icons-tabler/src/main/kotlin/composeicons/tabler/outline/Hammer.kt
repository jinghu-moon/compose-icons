package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Hammer: ImageVector
    get() {
        if (_hammer != null) return _hammer!!
        _hammer = tablerOutlineIcon(
            name = "Hammer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.414 10 4.031 17.418c-.395 .393-.617 .927-.617 1.484 0 .557 .222 1.091 .617 1.483 .823 .819 2.153 .819 2.976 0L14.414 13")
            addPathData("M18.121 15.293l2.586-2.586c.39-.391 .39-1.023 0-1.414L13.121 3.707c-.391-.39-1.024-.39-1.414 0L9.121 6.293c-.39 .39-.39 1.023 0 1.414l7.586 7.586c.39 .39 1.023 .39 1.414 0")
        }
        return _hammer!!
    }

private var _hammer: ImageVector? = null
