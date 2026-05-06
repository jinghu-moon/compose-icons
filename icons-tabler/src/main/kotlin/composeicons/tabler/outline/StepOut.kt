package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.StepOut: ImageVector
    get() {
        if (_stepOut != null) return _stepOut!!
        _stepOut = tablerOutlineIcon(
            name = "StepOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3v12")
            addPathData("M16 7 12 3")
            addPathData("M8 7 12 3")
            addPathData("M11 20c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
        }
        return _stepOut!!
    }

private var _stepOut: ImageVector? = null
