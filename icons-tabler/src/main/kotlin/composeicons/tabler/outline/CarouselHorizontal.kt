package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CarouselHorizontal: ImageVector
    get() {
        if (_carouselHorizontal != null) return _carouselHorizontal!!
        _carouselHorizontal = tablerOutlineIcon(
            name = "CarouselHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 6C7 5.448 7.448 5 8 5h8c.552 0 1 .448 1 1v12c0 .552-.448 1-1 1h-8C7.448 19 7 18.552 7 18v-12")
            addPathData("M22 17h-1c-.552 0-1-.448-1-1v-8c0-.552 .448-1 1-1h1")
            addPathData("M2 17h1c.552 0 1-.448 1-1v-8C4 7.448 3.552 7 3 7h-1")
        }
        return _carouselHorizontal!!
    }

private var _carouselHorizontal: ImageVector? = null
