package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Broadcast: ImageVector
    get() {
        if (_broadcast != null) return _broadcast!!
        _broadcast = tablerOutlineIcon(
            name = "Broadcast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.364 19.364c3.515-3.515 3.515-9.213-0-12.728C14.849 3.121 9.151 3.121 5.636 6.636 2.121 10.151 2.121 15.849 5.636 19.364")
            addPathData("M15.536 16.536c1.952-1.953 1.952-5.118-.001-7.071C13.583 7.513 10.417 7.513 8.465 9.465c-1.953 1.952-1.953 5.118-.001 7.071")
            addPathData("M11 13c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
        }
        return _broadcast!!
    }

private var _broadcast: ImageVector? = null
