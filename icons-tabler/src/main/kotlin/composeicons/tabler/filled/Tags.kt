package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Tags: ImageVector
    get() {
        if (_tags != null) return _tags!!
        _tags = tablerFilledIcon(
            name = "Tags",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.172 5c.796 0 1.559 .316 2.121 .879l5.71 5.71c1.331 1.332 1.331 3.49 0 4.822l-3.592 3.592c-1.332 1.331-3.49 1.331-4.822 0L2.879 14.293C2.316 13.731 2 12.968 2 12.172v-4.172C2 6.343 3.343 5 5 5ZM7 9h-.01c-.552 .003-.998 .453-.995 1.005 .003 .552 .453 .998 1.005 .995 .552 0 1-.448 1-1C8 9.448 7.552 9 7 9")
            addPathData("M14.293 5.293c.391-.39 1.023-.39 1.414 0l4.593 4.592c2.272 2.273 2.272 5.957 0 8.23l-1.592 1.592c-.392 .379-1.016 .374-1.402-.012-.386-.386-.391-1.009-.012-1.402l1.592-1.592c1.492-1.492 1.492-3.91 0-5.402L14.294 6.707c-.39-.39-.39-1.023 0-1.414")
        }
        return _tags!!
    }

private var _tags: ImageVector? = null
