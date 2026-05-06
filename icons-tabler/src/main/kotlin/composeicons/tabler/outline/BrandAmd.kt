package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAmd: ImageVector
    get() {
        if (_brandAmd != null) return _brandAmd!!
        _brandAmd = tablerOutlineIcon(
            name = "BrandAmd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 16v-7C16 8.434 15.566 8 15 8h-7L3 3h17c.566 0 1 .434 1 1v17L16 16")
            addPathData("M11.293 20.707 16 16h-7C8.448 16 8 15.552 8 15v-7L3.293 12.707c-.188 .187-.293 .442-.293 .707v6.586c0 .552 .448 1 1 1h6.586c.265-0 .52-.105 .707-.293")
        }
        return _brandAmd!!
    }

private var _brandAmd: ImageVector? = null
