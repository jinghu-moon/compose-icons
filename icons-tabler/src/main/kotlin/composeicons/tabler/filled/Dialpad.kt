package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Dialpad: ImageVector
    get() {
        if (_dialpad != null) return _dialpad!!
        _dialpad = tablerFilledIcon(
            name = "Dialpad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 2h-2C2.895 2 2 2.895 2 4v2c0 1.105 .895 2 2 2h2C7.105 8 8 7.105 8 6v-2C8 2.895 7.105 2 6 2Z")
            addPathData("M20 2h-2c-1.105 0-2 .895-2 2v2c0 1.105 .895 2 2 2h2c1.105 0 2-.895 2-2v-2C22 2.895 21.105 2 20 2Z")
            addPathData("M13 2h-2C9.895 2 9 2.895 9 4v2c0 1.105 .895 2 2 2h2c1.105 0 2-.895 2-2v-2C15 2.895 14.105 2 13 2Z")
            addPathData("M6 9h-2C2.895 9 2 9.895 2 11v2c0 1.105 .895 2 2 2h2c1.105 0 2-.895 2-2v-2C8 9.895 7.105 9 6 9Z")
            addPathData("M20 9h-2c-1.105 0-2 .895-2 2v2c0 1.105 .895 2 2 2h2c1.105 0 2-.895 2-2v-2C22 9.895 21.105 9 20 9Z")
            addPathData("M13 9h-2C9.895 9 9 9.895 9 11v2c0 1.105 .895 2 2 2h2c1.105 0 2-.895 2-2v-2C15 9.895 14.105 9 13 9Z")
            addPathData("M13 16h-2c-1.105 0-2 .895-2 2v2c0 1.105 .895 2 2 2h2c1.105 0 2-.895 2-2v-2c0-1.105-.895-2-2-2Z")
        }
        return _dialpad!!
    }

private var _dialpad: ImageVector? = null
