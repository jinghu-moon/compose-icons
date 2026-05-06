package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.KeyboardShow: ImageVector
    get() {
        if (_keyboardShow != null) return _keyboardShow!!
        _keyboardShow = tablerOutlineIcon(
            name = "KeyboardShow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 5C2 3.895 2.895 3 4 3h16c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-16C2.895 15 2 14.105 2 13v-8")
            addPathData("M6 7v.01")
            addPathData("M10 7v.01")
            addPathData("M14 7v.01")
            addPathData("M18 7v.01")
            addPathData("M6 11v.01")
            addPathData("M18 11v.01")
            addPathData("M10 11h4")
            addPathData("M10 19l2 2 2-2")
        }
        return _keyboardShow!!
    }

private var _keyboardShow: ImageVector? = null
