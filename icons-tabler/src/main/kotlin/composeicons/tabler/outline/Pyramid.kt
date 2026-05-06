package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pyramid: ImageVector
    get() {
        if (_pyramid != null) return _pyramid!!
        _pyramid = tablerOutlineIcon(
            name = "Pyramid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.105 21.788c.563 .283 1.226 .283 1.789 0l8.092-4.054c.538-.27 .718-.951 .385-1.452L12.831 2.446c-.185-.279-.497-.446-.832-.446-.335 0-.647 .167-.832 .446L2.627 16.282c-.158 .239-.207 .535-.133 .813 .074 .277 .263 .51 .519 .639l8.092 4.054")
            addPathData("M12 2v20")
        }
        return _pyramid!!
    }

private var _pyramid: ImageVector? = null
