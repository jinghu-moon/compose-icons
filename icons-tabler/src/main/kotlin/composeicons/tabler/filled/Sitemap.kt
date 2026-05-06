package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Sitemap: ImageVector
    get() {
        if (_sitemap != null) return _sitemap!!
        _sitemap = tablerFilledIcon(
            name = "Sitemap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 16.667C2 15.194 3.194 14 4.667 14h2.666C8.806 14 10 15.194 10 16.667v2.666C10 20.806 8.806 22 7.333 22h-2.666C3.194 22 2 20.806 2 19.333Z")
            addPathData("M14 16.667C14 15.194 15.194 14 16.667 14h2.666C20.806 14 22 15.194 22 16.667v2.666C22 20.806 20.806 22 19.333 22h-2.666C15.194 22 14 20.806 14 19.333Z")
            addPathData("M8 4.667C8 3.194 9.194 2 10.667 2h2.666C14.806 2 16 3.194 16 4.667v2.666C16 8.806 14.806 10 13.333 10h-2.666C9.194 10 8 8.806 8 7.333Z")
            addPathData("M12 8c-.552 0-1 .448-1 1v2h-3C6.355 11 5 12.355 5 14v1c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-1c0-.564 .436-1 1-1h8c.564 0 1 .436 1 1v1c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-1c0-1.645-1.355-3-3-3h-3v-2C13 8.448 12.552 8 12 8Z")
        }
        return _sitemap!!
    }

private var _sitemap: ImageVector? = null
