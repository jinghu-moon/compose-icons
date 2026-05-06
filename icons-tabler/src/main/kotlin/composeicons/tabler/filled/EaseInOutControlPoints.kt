package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.EaseInOutControlPoints: ImageVector
    get() {
        if (_easeInOutControlPoints != null) return _easeInOutControlPoints!!
        _easeInOutControlPoints = tablerFilledIcon(
            name = "EaseInOutControlPoints",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 17c1.526 0 2.808 1.145 2.98 2.661 .172 1.516-.821 2.92-2.307 3.262C18.187 23.266 16.68 22.438 16.171 21h-1.171c-.552 0-1-.448-1-1 0-.552 .448-1 1-1h1.17c.424-1.199 1.558-2.001 2.83-2M5 1c1.306 0 2.418 .835 2.83 2h1.17c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-1.171C7.321 6.439 5.813 7.268 4.326 6.925 2.838 6.583 1.845 5.178 2.017 3.662 2.19 2.145 3.474 1 5 1M14 3c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-2C11.448 5 11 4.552 11 4c0-.552 .448-1 1-1ZM12 19c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-2C9.448 21 9 20.552 9 20c0-.552 .448-1 1-1Z")
            addPathData("M21 3c.552 0 1 .448 1 1 0 .552-.448 1-1 1-2.83 0-4.6 1.845-8.152 7.53C8.901 18.845 6.836 21 3 21 2.448 21 2 20.552 2 20c0-.552 .448-1 1-1 2.83 0 4.6-1.845 8.152-7.53C15.099 5.155 17.164 3 21 3")
        }
        return _easeInOutControlPoints!!
    }

private var _easeInOutControlPoints: ImageVector? = null
