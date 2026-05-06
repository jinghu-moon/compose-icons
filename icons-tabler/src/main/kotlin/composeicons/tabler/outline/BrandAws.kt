package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAws: ImageVector
    get() {
        if (_brandAws != null) return _brandAws!!
        _brandAws = tablerOutlineIcon(
            name = "BrandAws",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 18.5c-2.298 1.089-4.832 1.584-7.37 1.44C7.208 19.532 4.928 18.521 3 17")
            addPathData("M19.5 21c.907-1.411 1.451-3.323 1.5-5-1.197-.773-2.577-.935-4-1")
            addPathData("M3 11v-4.5C3 5.672 3.672 5 4.5 5 5.328 5 6 5.672 6 6.5v4.5")
            addPathData("M3 9h3")
            addPathData("M9 5l1.2 6L12 7l1.8 4L15 5")
            addPathData("M18 10.25c0 .414 .336 .75 .75 .75h1.25c.552 0 1-.448 1-1v-1C21 8.448 20.552 8 20 8h-1C18.448 8 18 7.552 18 7v-1c0-.552 .448-1 1-1h1.25c.414 0 .75 .336 .75 .75")
        }
        return _brandAws!!
    }

private var _brandAws: ImageVector? = null
