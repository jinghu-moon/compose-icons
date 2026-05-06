package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceDesktop: ImageVector
    get() {
        if (_deviceDesktop != null) return _deviceDesktop!!
        _deviceDesktop = tablerFilledIcon(
            name = "DeviceDesktop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 21C6.448 21 6 20.552 6 20c0-.552 .448-1 1-1h1v-2h-4C2.895 17 2 16.105 2 15v-10C2 3.895 2.895 3 4 3h16c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-4v2h1c.552 0 1 .448 1 1 0 .552-.448 1-1 1ZM14 17h-4v2h4Z"),
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
        return _deviceDesktop!!
    }

private var _deviceDesktop: ImageVector? = null
