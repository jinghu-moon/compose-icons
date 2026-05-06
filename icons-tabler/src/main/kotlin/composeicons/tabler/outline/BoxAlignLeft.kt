package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BoxAlignLeft: ImageVector
    get() {
        if (_boxAlignLeft != null) return _boxAlignLeft!!
        _boxAlignLeft = tablerOutlineIcon(
            name = "BoxAlignLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.002 20.003v-16h-5c-.552 0-1 .448-1 1v14c0 .552 .448 1 1 1h5")
            addPathData("M15.002 20.003h-.01")
            addPathData("M20.003 20.003h-.011")
            addPathData("M20.003 15.002h-.011")
            addPathData("M20.003 9.002h-.011")
            addPathData("M20.003 4.002h-.011")
            addPathData("M15.002 4.002h-.01")
        }
        return _boxAlignLeft!!
    }

private var _boxAlignLeft: ImageVector? = null
