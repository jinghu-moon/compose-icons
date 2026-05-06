package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandQq: ImageVector
    get() {
        if (_brandQq != null) return _brandQq!!
        _brandQq = tablerOutlineIcon(
            name = "BrandQq",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 9.748c3.824 1.687 8.185 1.668 11.995-.052C18.27 .46 6.891-1.56 6 9.748")
            addPathData("M18 10c.984 2.762 1.949 4.765 2 7.153 .014 .688-.664 1.346-1.184 .303C18.47 16.76 17.864 16.275 17 16")
            addPathData("M17 16c.031 1.831 .147 3.102-1 4")
            addPathData("M8 20C6.901 19.13 7.086 17.76 7 16")
            addPathData("M6 10c-.783 2.338-1.742 4.12-1.968 6.43-.217 2.227 .716 1.644 1.16 .917C5.488 16.86 6.09 16.413 7 16")
            addPathData("M15.898 13l-.476-2")
            addPathData("M8 20 6.5 21C6 21.5 6 22 7 22h10c1 0 1-.5 .5-1L16 20")
            addPathData("M12.75 7c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M9.25 7c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
        }
        return _brandQq!!
    }

private var _brandQq: ImageVector? = null
