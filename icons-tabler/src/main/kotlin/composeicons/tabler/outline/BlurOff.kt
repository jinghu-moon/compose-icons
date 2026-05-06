package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BlurOff: ImageVector
    get() {
        if (_blurOff != null) return _blurOff!!
        _blurOff = tablerOutlineIcon(
            name = "BlurOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3v5M12 12v8")
            addPathData("M5.641 5.631C2.123 9.143 2.119 14.842 5.631 18.36c3.512 3.517 9.211 3.522 12.729 .009M20.04 16.051C21.79 12.584 21.119 8.386 18.376 5.638 15.633 2.889 11.436 2.21 7.966 3.953")
            addPathData("M16 12h5")
            addPathData("M13 9h7")
            addPathData("M12 6h6")
            addPathData("M12 18h6")
            addPathData("M12 15h3M19 15h1")
            addPathData("M3 3 21 21")
        }
        return _blurOff!!
    }

private var _blurOff: ImageVector? = null
