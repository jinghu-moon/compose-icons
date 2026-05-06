package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MaskOff: ImageVector
    get() {
        if (_maskOff != null) return _maskOff!!
        _maskOff = tablerOutlineIcon(
            name = "MaskOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.42 19.41c-.376 .378-.887 .59-1.42 .59h-12C4.895 20 4 19.105 4 18v-12C4 5.446 4.225 4.945 4.588 4.583M8 4h10c1.105 0 2 .895 2 2v10")
            addPathData("M9.885 9.872c-.768 .756-1.071 1.866-.794 2.908 .277 1.041 1.091 1.855 2.133 2.13 1.042 .275 2.151-.029 2.907-.798M14.712 10.716c-.299-.63-.807-1.136-1.438-1.433")
            addPathData("M3 3 21 21")
        }
        return _maskOff!!
    }

private var _maskOff: ImageVector? = null
