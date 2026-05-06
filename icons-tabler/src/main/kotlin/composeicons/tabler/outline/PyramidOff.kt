package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PyramidOff: ImageVector
    get() {
        if (_pyramidOff != null) return _pyramidOff!!
        _pyramidOff = tablerOutlineIcon(
            name = "PyramidOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21.384 17.373c.211-.334 .206-.762-.013-1.091L12.831 2.446c-.185-.279-.497-.446-.832-.446-.335 0-.647 .167-.832 .446L9.367 5.363M7.836 7.843 2.627 16.282c-.158 .239-.207 .535-.133 .813 .074 .277 .263 .51 .519 .639l8.092 4.054c.563 .283 1.226 .283 1.789 0l5.903-2.958")
            addPathData("M12 2v6M12 12v10")
            addPathData("M3 3 21 21")
        }
        return _pyramidOff!!
    }

private var _pyramidOff: ImageVector? = null
