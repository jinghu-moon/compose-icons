package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PyramidPlus: ImageVector
    get() {
        if (_pyramidPlus != null) return _pyramidPlus!!
        _pyramidPlus = tablerOutlineIcon(
            name = "PyramidPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.719 11.985 12.83 2.446c-.185-.279-.497-.446-.832-.446-.335 0-.647 .167-.832 .446L2.626 16.282c-.158 .239-.207 .535-.133 .813 .074 .277 .263 .51 .519 .639l8.092 4.054c.563 .283 1.226 .283 1.789 0l.149-.074")
            addPathData("M12 2v20")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _pyramidPlus!!
    }

private var _pyramidPlus: ImageVector? = null
