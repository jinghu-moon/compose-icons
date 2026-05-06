package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Blur: ImageVector
    get() {
        if (_blur != null) return _blur!!
        _blur = tablerOutlineIcon(
            name = "Blur",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21c.783 .001 1.563-.101 2.32-.302 3.61-.96 6.252-4.051 6.638-7.767C21.345 9.216 19.395 5.648 16.06 3.965 12.738 2.289 8.727 2.83 5.967 5.326 3.208 7.823 2.27 11.76 3.606 15.233 4.943 18.706 8.279 20.998 12 21")
            addPathData("M12 3v17")
            addPathData("M12 12h9")
            addPathData("M12 9h8")
            addPathData("M12 6h6")
            addPathData("M12 18h6")
            addPathData("M12 15h8")
        }
        return _blur!!
    }

private var _blur: ImageVector? = null
