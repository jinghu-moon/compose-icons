package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ColorSwatchOff: ImageVector
    get() {
        if (_colorSwatchOff != null) return _colorSwatchOff!!
        _colorSwatchOff = tablerOutlineIcon(
            name = "ColorSwatchOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 13v4c-0 1.619 .976 3.078 2.472 3.697 1.496 .619 3.217 .275 4.36-.872M21 17v-12C21 3.895 20.105 3 19 3h-4c-1.105 0-2 .895-2 2v4")
            addPathData("M13 7.35l-2-2C10.447 4.797 9.623 4.617 8.89 4.889M6.76 6.763 5.344 8.178c-.781 .781-.781 2.047 0 2.828l9 9")
            addPathData("M7.3 13h-2.3c-1.105 0-2 .895-2 2v4c0 1.105 .895 2 2 2h12")
            addPathData("M17 17v.01")
            addPathData("M3 3 21 21")
        }
        return _colorSwatchOff!!
    }

private var _colorSwatchOff: ImageVector? = null
