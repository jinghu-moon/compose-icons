package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FireExtinguisher: ImageVector
    get() {
        if (_fireExtinguisher != null) return _fireExtinguisher!!
        _fireExtinguisher = tablerOutlineIcon(
            name = "FireExtinguisher",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 7c2.209 0 4 1.791 4 4v9c0 .552-.448 1-1 1h-6C8.448 21 8 20.552 8 20v-9C8 8.791 9.791 7 12 7")
            addPathData("M9 16h6")
            addPathData("M12 7v-3")
            addPathData("M16 5 12 4 16 3")
            addPathData("M12 4h-3C7.343 4 6 5.343 6 7")
        }
        return _fireExtinguisher!!
    }

private var _fireExtinguisher: ImageVector? = null
