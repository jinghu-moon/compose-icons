package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BabyBottle: ImageVector
    get() {
        if (_babyBottle != null) return _babyBottle!!
        _babyBottle = tablerOutlineIcon(
            name = "BabyBottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 10h14")
            addPathData("M12 2v2")
            addPathData("M12 4c2.761 0 5 2.239 5 5v11c0 1.105-.895 2-2 2h-6C7.895 22 7 21.105 7 20v-11C7 6.239 9.239 4 12 4")
        }
        return _babyBottle!!
    }

private var _babyBottle: ImageVector? = null
