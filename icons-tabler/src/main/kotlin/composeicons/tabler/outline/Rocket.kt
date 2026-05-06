package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Rocket: ImageVector
    get() {
        if (_rocket != null) return _rocket!!
        _rocket = tablerOutlineIcon(
            name = "Rocket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 13c3.67 .436 6.564 3.33 7 7 1.797-1.036 2.932-2.927 3-5 3.434-1.208 5.802-4.365 6-8C20 5.343 18.657 4 17 4c-3.635 .198-6.792 2.566-8 6-2.073 .068-3.964 1.203-5 3")
            addPathData("M7 14C4.871 15.202 3.684 17.576 4 20c2.424 .316 4.798-.871 6-3")
            addPathData("M14 9c0 .552 .448 1 1 1 .552 0 1-.448 1-1C16 8.448 15.552 8 15 8c-.552 0-1 .448-1 1")
        }
        return _rocket!!
    }

private var _rocket: ImageVector? = null
