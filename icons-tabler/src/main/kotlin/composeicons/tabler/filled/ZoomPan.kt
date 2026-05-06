package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ZoomPan: ImageVector
    get() {
        if (_zoomPan != null) return _zoomPan!!
        _zoomPan = tablerFilledIcon(
            name = "ZoomPan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 8c1.436-0 2.761 .769 3.474 2.015 .712 1.246 .702 2.779-.027 4.016l2.26 2.262c.379 .392 .374 1.016-.012 1.402-.386 .386-1.009 .391-1.402 .012L14.031 15.447c-1.237 .729-2.769 .739-4.016 .027C8.769 14.761 8 13.436 8 12l.005-.2C8.112 9.671 9.869 8 12 8")
            addPathData("M11.293 1.293c.391-.39 1.023-.39 1.414 0l2 2c.26 .251 .364 .623 .273 .973-.092 .35-.365 .623-.714 .714-.35 .092-.721-.013-.973-.273L12 3.415 10.707 4.707c-.356 .356-.922 .392-1.32 .083L9.293 4.707c-.39-.39-.39-1.023 0-1.414Z")
            addPathData("M19.293 9.293c.391-.39 1.024-.39 1.414 0l2 2c.39 .391 .39 1.023 0 1.414l-2 2c-.392 .379-1.016 .374-1.402-.012-.386-.386-.391-1.009-.012-1.402L20.585 12 19.293 10.707c-.356-.356-.392-.922-.083-1.32Z")
            addPathData("M3.293 9.293c.251-.26 .623-.364 .973-.273 .35 .092 .623 .365 .714 .714 .092 .35-.013 .721-.273 .973L3.415 12l1.292 1.293c.356 .356 .392 .922 .083 1.32l-.083 .094c-.39 .39-1.023 .39-1.414 0l-2-2c-.39-.391-.39-1.023 0-1.414Z")
            addPathData("M9.293 19.293c.391-.39 1.023-.39 1.414 0L12 20.585l1.294-1.292c.356-.356 .922-.392 1.32-.083l.094 .083c.39 .391 .39 1.024 0 1.414l-2 2c-.391 .39-1.024 .39-1.414 0l-2-2c-.39-.391-.39-1.024 0-1.414")
        }
        return _zoomPan!!
    }

private var _zoomPan: ImageVector? = null
