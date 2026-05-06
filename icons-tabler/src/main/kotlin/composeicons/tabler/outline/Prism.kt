package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Prism: ImageVector
    get() {
        if (_prism != null) return _prism!!
        _prism = tablerOutlineIcon(
            name = "Prism",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 9v13")
            addPathData("M19 17.17l-5.98 4.485c-.604 .453-1.436 .453-2.04 0L5 17.17c-.63-.472-1-1.213-1-2v-11.17C4 3.448 4.448 3 5 3h14c.552 0 1 .448 1 1v11.17c0 .787-.37 1.528-1 2")
            addPathData("M4.3 3.3l6.655 5.186c.614 .479 1.476 .479 2.09 0L19.7 3.3")
        }
        return _prism!!
    }

private var _prism: ImageVector? = null
