package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Box: ImageVector
    get() {
        if (_box != null) return _box!!
        _box = tablerOutlineIcon(
            name = "Box",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3l8 4.5v9L12 21 4 16.5v-9L12 3")
            addPathData("M12 12 20 7.5")
            addPathData("M12 12v9")
            addPathData("M12 12 4 7.5")
        }
        return _box!!
    }

private var _box: ImageVector? = null
