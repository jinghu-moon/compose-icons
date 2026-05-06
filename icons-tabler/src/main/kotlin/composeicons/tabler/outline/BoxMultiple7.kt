package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BoxMultiple7: ImageVector
    get() {
        if (_boxMultiple7 != null) return _boxMultiple7!!
        _boxMultiple7 = tablerOutlineIcon(
            name = "BoxMultiple7",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 5C7 3.895 7.895 3 9 3h10c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-10C7.895 17 7 16.105 7 15v-10")
            addPathData("M12 6h4l-2 8")
            addPathData("M17 17v2c0 1.105-.895 2-2 2h-10C3.895 21 3 20.105 3 19v-10C3 7.895 3.895 7 5 7h2")
        }
        return _boxMultiple7!!
    }

private var _boxMultiple7: ImageVector? = null
