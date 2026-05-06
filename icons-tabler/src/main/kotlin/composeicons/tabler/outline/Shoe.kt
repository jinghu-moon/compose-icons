package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Shoe: ImageVector
    get() {
        if (_shoe != null) return _shoe!!
        _shoe = tablerOutlineIcon(
            name = "Shoe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6h5.426c.355 0 .684 .189 .863 .496l1.064 1.823c.413 .708 1.098 1.217 1.896 1.407l4.677 1.114c1.802 .429 3.073 2.038 3.074 3.89v2.27c0 .552-.448 1-1 1h-16C3.448 18 3 17.552 3 17v-10C3 6.448 3.448 6 4 6")
            addPathData("M14 13l1-2")
            addPathData("M8 18v-1C8 14.791 6.209 13 4 13h-1")
            addPathData("M10 12 11.5 9")
        }
        return _shoe!!
    }

private var _shoe: ImageVector? = null
