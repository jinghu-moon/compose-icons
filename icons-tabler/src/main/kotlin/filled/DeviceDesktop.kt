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
                pathData = parseSvgPathData("M 7.000 21.000 C 6.448 21.000 6.000 20.552 6.000 20.000 C 6.000 19.448 6.448 19.000 7.000 19.000 L 8.000 19.000 L 8.000 17.000 L 4.000 17.000 C 2.895 17.000 2.000 16.105 2.000 15.000 L 2.000 5.000 C 2.000 3.895 2.895 3.000 4.000 3.000 L 20.000 3.000 C 21.105 3.000 22.000 3.895 22.000 5.000 L 22.000 15.000 C 22.000 16.105 21.105 17.000 20.000 17.000 L 16.000 17.000 L 16.000 19.000 L 17.000 19.000 C 17.552 19.000 18.000 19.448 18.000 20.000 C 18.000 20.552 17.552 21.000 17.000 21.000 ZM 14.000 17.000 L 10.000 17.000 L 10.000 19.000 L 14.000 19.000 Z"),
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
