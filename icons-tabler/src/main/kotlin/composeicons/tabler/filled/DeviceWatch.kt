package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceWatch: ImageVector
    get() {
        if (_deviceWatch != null) return _deviceWatch!!
        _deviceWatch = tablerFilledIcon(
            name = "DeviceWatch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 2c.552 0 1 .448 1 1v2.126c1.726 .445 3 2.01 3 3.874v6c0 1.824-1.234 3.418-3 3.874v2.126c0 .552-.448 1-1 1h-6C8.448 22 8 21.552 8 21v-2.126C6.234 18.418 5 16.824 5 15v-6C5 7.176 6.234 5.582 8 5.126v-2.126C8 2.448 8.448 2 9 2ZM14 19h-4v1h4ZM14 4h-4v1h4Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _deviceWatch!!
    }

private var _deviceWatch: ImageVector? = null
