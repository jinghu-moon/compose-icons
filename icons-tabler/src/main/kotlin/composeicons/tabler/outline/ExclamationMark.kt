package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ExclamationMark: ImageVector
    get() {
        if (_exclamationMark != null) return _exclamationMark!!
        _exclamationMark = tablerOutlineIcon(
            name = "ExclamationMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 19v.01")
            addPathData("M12 15v-10")
        }
        return _exclamationMark!!
    }

private var _exclamationMark: ImageVector? = null
