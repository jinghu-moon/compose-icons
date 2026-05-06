package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.IceCream: ImageVector
    get() {
        if (_iceCream != null) return _iceCream!!
        _iceCream = tablerOutlineIcon(
            name = "IceCream",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21.5v-4.5")
            addPathData("M8 17h8v-10C16 4.791 14.209 3 12 3 9.791 3 8 4.791 8 7v10")
            addPathData("M8 10.5 16 7")
            addPathData("M8 14.5 16 11")
        }
        return _iceCream!!
    }

private var _iceCream: ImageVector? = null
