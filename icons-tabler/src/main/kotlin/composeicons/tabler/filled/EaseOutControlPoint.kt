package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.EaseOutControlPoint: ImageVector
    get() {
        if (_easeOutControlPoint != null) return _easeOutControlPoint!!
        _easeOutControlPoint = tablerFilledIcon(
            name = "EaseOutControlPoint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 4c.552 0 1 .448 1 1 0 .552-.448 1-1 1-1.097 0-2.317 .361-3.64 1.068-2.373 1.265-4.958 3.562-7.607 6.59C8.246 15.392 6.827 17.201 5.503 19.078c-.341 .481-.675 .966-1.003 1.456l-.455 .69q-.132 .204-.196 .306c-.293 .468-.91 .611-1.378 .318-.468-.293-.611-.91-.318-1.378l.286-.445 .173-.264c.411-.619 .831-1.232 1.26-1.839C5.235 15.989 6.696 14.127 8.248 12.342 11.043 9.147 13.792 6.704 16.419 5.302 18.011 4.454 19.541 4 21 4M5 2c1.306 0 2.418 .835 2.83 2h1.17c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-1.171C7.321 7.439 5.813 8.268 4.326 7.925 2.838 7.583 1.845 6.178 2.017 4.662 2.19 3.145 3.474 2 5 2")
            addPathData("M14 4c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-2C11.448 6 11 5.552 11 5c0-.552 .448-1 1-1Z")
        }
        return _easeOutControlPoint!!
    }

private var _easeOutControlPoint: ImageVector? = null
