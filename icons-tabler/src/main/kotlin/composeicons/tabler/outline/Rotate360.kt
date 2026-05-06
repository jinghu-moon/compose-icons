package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Rotate360: ImageVector
    get() {
        if (_rotate360 != null) return _rotate360!!
        _rotate360 = tablerOutlineIcon(
            name = "Rotate360",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 16h4v4")
            addPathData("M19.458 11.042c.86-2.366 .722-4.58-.6-5.9C16.586 2.868 11.673 4.097 7.885 7.885 4.097 11.673 2.868 16.586 5.141 18.859c2.227 2.226 6.987 1.093 10.74-2.515")
        }
        return _rotate360!!
    }

private var _rotate360: ImageVector? = null
