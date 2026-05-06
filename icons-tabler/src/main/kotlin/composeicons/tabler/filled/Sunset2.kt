package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Sunset2: ImageVector
    get() {
        if (_sunset2 != null) return _sunset2!!
        _sunset2 = tablerFilledIcon(
            name = "Sunset2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-1C2.448 14 2 13.552 2 13c0-.552 .448-1 1-1Z")
            addPathData("M21 12c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-1c-.552 0-1-.448-1-1 0-.552 .448-1 1-1Z")
            addPathData("M6.307 5.893l.7 .7c.379 .392 .374 1.016-.012 1.402-.386 .386-1.009 .391-1.402 .012L4.893 7.307C4.514 6.915 4.519 6.291 4.905 5.905c.386-.386 1.009-.391 1.402-.012")
            addPathData("M19.107 5.893c.39 .39 .39 1.023 0 1.414l-.7 .7c-.392 .379-1.016 .374-1.402-.012-.386-.386-.391-1.009-.012-1.402l.7-.7c.39-.39 1.023-.39 1.414 0")
            addPathData("M12 3c.552 0 1 .448 1 1v1c0 .552-.448 1-1 1C11.448 6 11 5.552 11 5v-1c0-.552 .448-1 1-1")
            addPathData("M3 16h18c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-18C2.448 18 2 17.552 2 17c0-.552 .448-1 1-1")
            addPathData("M12 8c1.687-0 3.261 .85 4.185 2.262 .924 1.412 1.074 3.194 .398 4.74h-9.166c-.676-1.546-.526-3.329 .398-4.74C8.739 8.85 10.313 8 12 8")
            addPathData("M12 19c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-5C6.448 21 6 20.552 6 20c0-.552 .448-1 1-1Z")
            addPathData("M17 19c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-1c-.552 0-1-.448-1-1 0-.552 .448-1 1-1Z")
        }
        return _sunset2!!
    }

private var _sunset2: ImageVector? = null
