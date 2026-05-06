package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceGamepad: ImageVector
    get() {
        if (_deviceGamepad != null) return _deviceGamepad!!
        _deviceGamepad = tablerFilledIcon(
            name = "DeviceGamepad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 5c1.657 0 3 1.343 3 3v8c0 1.657-1.343 3-3 3h-16C2.343 19 1 17.657 1 16v-8C1 6.343 2.343 5 4 5ZM8 9l-.117 .007C7.38 9.066 7 9.493 7 10v1h-1c-.552 0-1 .448-1 1l.007 .117c.059 .503 .486 .883 .993 .883h1v1c0 .552 .448 1 1 1l.117-.007C8.62 14.934 9 14.507 9 14v-1h1c.552 0 1-.448 1-1l-.007-.117C10.934 11.38 10.507 11 10 11h-1v-1C9 9.448 8.552 9 8 9M18 12c-.552 0-1 .448-1 1v.01c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.01c0-.552-.448-1-1-1M15 10c-.552 0-1 .448-1 1v.01c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.01c0-.552-.448-1-1-1"),
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
        return _deviceGamepad!!
    }

private var _deviceGamepad: ImageVector? = null
