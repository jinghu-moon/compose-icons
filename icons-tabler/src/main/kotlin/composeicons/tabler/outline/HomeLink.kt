package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeLink: ImageVector
    get() {
        if (_homeLink != null) return _homeLink!!
        _homeLink = tablerOutlineIcon(
            name = "HomeLink",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.085 11.085 12 3 3 12h2v7c0 1.105 .895 2 2 2h4.5")
            addPathData("M9 21v-6c0-1.105 .895-2 2-2h2c.773 0 1.476 .445 1.807 1.143")
            addPathData("M20 21c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M20 16c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M15 19c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M21 16l-5 3 5 2")
        }
        return _homeLink!!
    }

private var _homeLink: ImageVector? = null
