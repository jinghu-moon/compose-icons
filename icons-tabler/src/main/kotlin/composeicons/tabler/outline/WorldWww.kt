package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WorldWww: ImageVector
    get() {
        if (_worldWww != null) return _worldWww!!
        _worldWww = tablerOutlineIcon(
            name = "WorldWww",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.5 7C17.827 4.496 15.012 2.994 12 3 8.993 2.998 6.185 4.499 4.516 7")
            addPathData("M11.5 3C10.721 4.249 10.107 5.593 9.674 7")
            addPathData("M12.5 3c.78 1.249 1.395 2.593 1.828 4")
            addPathData("M19.5 17C17.827 19.504 15.012 21.006 12 21 8.993 21.002 6.185 19.501 4.516 17")
            addPathData("M11.5 21C10.721 19.751 10.107 18.407 9.674 17")
            addPathData("M12.5 21c.78-1.249 1.395-2.593 1.828-4")
            addPathData("M2 10l1 4L4.5 10 6 14 7 10")
            addPathData("M17 10l1 4 1.5-4L21 14l1-4")
            addPathData("M9.5 10l1 4L12 10l1.5 4 1-4")
        }
        return _worldWww!!
    }

private var _worldWww: ImageVector? = null
