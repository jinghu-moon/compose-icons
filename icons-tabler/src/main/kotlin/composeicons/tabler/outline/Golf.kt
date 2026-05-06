package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Golf: ImageVector
    get() {
        if (_golf != null) return _golf!!
        _golf = tablerOutlineIcon(
            name = "Golf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 18v-15l7 4-7 4")
            addPathData("M9 17.67C8.38 18.03 8 18.49 8 19c0 1.1 1.8 2 4 2 2.2 0 4-.9 4-2 0-.5-.38-.97-1-1.33")
        }
        return _golf!!
    }

private var _golf: ImageVector? = null
