package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PrismOff: ImageVector
    get() {
        if (_prismOff != null) return _prismOff!!
        _prismOff = tablerOutlineIcon(
            name = "PrismOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12v10")
            addPathData("M17.957 17.952l-4.937 3.703c-.604 .453-1.436 .453-2.04 0L5 17.17c-.63-.472-1-1.213-1-2v-11.17M7 3h12c.552 0 1 .448 1 1v11.17c0 .25-.037 .495-.109 .729")
            addPathData("M12.688 8.7c.127-.056 .247-.128 .357-.214L19.7 3.3")
            addPathData("M3 3 21 21")
        }
        return _prismOff!!
    }

private var _prismOff: ImageVector? = null
