package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Sunset: ImageVector
    get() {
        if (_sunset != null) return _sunset!!
        _sunset = tablerFilledIcon(
            name = "Sunset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 16c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-1C2.448 18 2 17.552 2 17c0-.552 .448-1 1-1Z")
            addPathData("M21 16c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-1c-.552 0-1-.448-1-1 0-.552 .448-1 1-1Z")
            addPathData("M6.307 9.893l.7 .7c.379 .392 .374 1.016-.012 1.402-.386 .386-1.009 .391-1.402 .012l-.7-.7c-.379-.392-.374-1.016 .012-1.402 .386-.386 1.009-.391 1.402-.012")
            addPathData("M19.107 9.893c.39 .391 .39 1.024 0 1.414l-.7 .7c-.392 .379-1.016 .374-1.402-.012-.386-.386-.391-1.009-.012-1.402l.7-.7c.39-.39 1.023-.39 1.414 0")
            addPathData("M12 2c.552 0 1 .448 1 1v3.584L14.293 5.293c.356-.356 .922-.392 1.32-.083l.094 .083c.39 .39 .39 1.023 0 1.414l-3 3c-.2 .205-.481 .312-.767 .293l-.124-.017-.127-.032-.104-.04-.115-.063c-.054-.033-.104-.071-.151-.114L8.293 6.707C7.914 6.315 7.919 5.691 8.305 5.305c.386-.386 1.009-.391 1.402-.012L11 6.585v-3.585c0-.552 .448-1 1-1")
            addPathData("M3 20h18c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-18C2.448 22 2 21.552 2 21c0-.552 .448-1 1-1")
            addPathData("M12 12c1.687-0 3.261 .85 4.185 2.262 .924 1.412 1.074 3.194 .398 4.74h-9.166c-.676-1.546-.526-3.329 .398-4.74C8.739 12.85 10.313 12 12 12")
        }
        return _sunset!!
    }

private var _sunset: ImageVector? = null
