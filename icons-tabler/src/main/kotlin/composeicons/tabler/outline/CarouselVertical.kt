package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CarouselVertical: ImageVector
    get() {
        if (_carouselVertical != null) return _carouselVertical!!
        _carouselVertical = tablerOutlineIcon(
            name = "CarouselVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 8v8c0 .552-.448 1-1 1h-12C5.448 17 5 16.552 5 16v-8C5 7.448 5.448 7 6 7h12c.552 0 1 .448 1 1")
            addPathData("M7 22v-1c0-.552 .448-1 1-1h8c.552 0 1 .448 1 1v1")
            addPathData("M17 2v1c0 .552-.448 1-1 1h-8C7.448 4 7 3.552 7 3v-1")
        }
        return _carouselVertical!!
    }

private var _carouselVertical: ImageVector? = null
