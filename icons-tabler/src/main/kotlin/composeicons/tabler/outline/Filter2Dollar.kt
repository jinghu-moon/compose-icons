package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Filter2Dollar: ImageVector
    get() {
        if (_filter2Dollar != null) return _filter2Dollar!!
        _filter2Dollar = tablerOutlineIcon(
            name = "Filter2Dollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6h16")
            addPathData("M6 12h10")
            addPathData("M9 18h4")
            addPathData("M21 15h-2M17 21h2M19 21v1M19 21h.5c.398 0 .779-.158 1.061-.439 .281-.281 .439-.663 .439-1.061 0-.398-.158-.779-.439-1.061C20.28 18.158 19.898 18 19.5 18h-1c-.398 0-.779-.158-1.061-.439C17.158 17.28 17 16.898 17 16.5c0-.398 .158-.779 .439-1.061 .281-.281 .663-.439 1.061-.439h.5M19 14v1")
        }
        return _filter2Dollar!!
    }

private var _filter2Dollar: ImageVector? = null
