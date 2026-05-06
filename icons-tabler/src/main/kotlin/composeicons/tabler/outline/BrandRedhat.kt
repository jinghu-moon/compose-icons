package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandRedhat: ImageVector
    get() {
        if (_brandRedhat != null) return _brandRedhat!!
        _brandRedhat = tablerOutlineIcon(
            name = "BrandRedhat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 10.5l1.436-4C7.754 5.624 8.164 5.198 8.795 5.198c.219 0 1.054 .365 1.88 .583 .825 .219 .733-.329 .908-.487C11.759 5.136 11.938 5 12.193 5c.242 0 .553 .048 1.692 .448 .759 .267 1.493 .574 2.204 .922 1.175 .582 1.426 .913 1.595 1.507l.816 4.623c2.086 .898 3.5 2.357 3.5 3.682C22 17.867 20.8 20 16.043 20 9.837 20 2 15.958 2 12.68 2 11.636 3.333 10.91 6 10.5")
            addPathData("M6 10.5C6 11.469 10.39 14 15.5 14c1.314 0 3 .063 3-1.5")
        }
        return _brandRedhat!!
    }

private var _brandRedhat: ImageVector? = null
