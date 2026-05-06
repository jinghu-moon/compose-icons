package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.StepInto: ImageVector
    get() {
        if (_stepInto != null) return _stepInto!!
        _stepInto = tablerOutlineIcon(
            name = "StepInto",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3v12")
            addPathData("M16 11l-4 4")
            addPathData("M8 11l4 4")
            addPathData("M11 20c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
        }
        return _stepInto!!
    }

private var _stepInto: ImageVector? = null
