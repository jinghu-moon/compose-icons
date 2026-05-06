package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Snowboarding: ImageVector
    get() {
        if (_snowboarding != null) return _snowboarding!!
        _snowboarding = tablerOutlineIcon(
            name = "Snowboarding",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 3c0 .552 .448 1 1 1 .552 0 1-.448 1-1C17 2.448 16.552 2 16 2c-.552 0-1 .448-1 1")
            addPathData("M7 19l4-2.5L10.5 15")
            addPathData("M16 21 15 15 10.5 12 14 6")
            addPathData("M7 9 8.5 6h5.5l2 4 3 1")
            addPathData("M3 17c.399 1.154 .899 1.805 1.5 1.951 6 1.464 10.772 2.262 13.5 2.927 1.333 .325 2.333 0 3-.976")
        }
        return _snowboarding!!
    }

private var _snowboarding: ImageVector? = null
