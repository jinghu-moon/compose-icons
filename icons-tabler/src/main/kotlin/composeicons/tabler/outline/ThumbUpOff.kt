package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ThumbUpOff: ImageVector
    get() {
        if (_thumbUpOff != null) return _thumbUpOff!!
        _thumbUpOff = tablerOutlineIcon(
            name = "ThumbUpOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 11v8c0 .552-.448 1-1 1h-2C3.448 20 3 19.552 3 19v-7c0-.552 .448-1 1-1h3c1.061 .001 2.079-.421 2.828-1.172M11 7v-1c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v5h3c1.105 0 2 .895 2 2-.222 1.112-.39 1.947-.5 2.503M18.742 18.747C18.35 19.57 17.698 20.059 17 20h-7C8.343 20 7 18.657 7 17")
            addPathData("M3 3 21 21")
        }
        return _thumbUpOff!!
    }

private var _thumbUpOff: ImageVector? = null
