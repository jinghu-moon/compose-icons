package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PrismPlus: ImageVector
    get() {
        if (_prismPlus != null) return _prismPlus!!
        _prismPlus = tablerOutlineIcon(
            name = "PrismPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 9v13")
            addPathData("M13.02 21.655c-.604 .453-1.436 .453-2.04 0L5 17.17c-.63-.472-1-1.213-1-2v-11.17C4 3.448 4.448 3 5 3h14c.552 0 1 .448 1 1v8")
            addPathData("M4.3 3.3l6.655 5.186c.614 .479 1.476 .479 2.09 0L19.7 3.3")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _prismPlus!!
    }

private var _prismPlus: ImageVector? = null
