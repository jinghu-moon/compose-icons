package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceGamepad2: ImageVector
    get() {
        if (_deviceGamepad2 != null) return _deviceGamepad2!!
        _deviceGamepad2 = tablerFilledIcon(
            name = "DeviceGamepad2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.500 4.000 C 18.500 4.000 21.039 6.215 21.445 9.187 L 22.977 17.070 C 23.257 18.510 22.553 19.962 21.250 20.634 C 19.946 21.306 18.355 21.037 17.345 19.973 L 13.569 15.999 L 10.429 16.000 L 6.710 19.916 C 5.698 20.982 4.102 21.250 2.797 20.573 C 1.492 19.896 0.792 18.438 1.081 16.996 L 2.715 8.823 C 3.276 6.018 5.739 3.999 8.600 4.000 ZM 8.000 7.000 C 7.448 7.000 7.000 7.448 7.000 8.000 L 7.000 9.000 L 6.000 9.000 C 5.448 9.000 5.000 9.448 5.000 10.000 C 5.000 10.552 5.448 11.000 6.000 11.000 L 7.000 11.000 L 7.000 12.000 C 7.000 12.552 7.448 13.000 8.000 13.000 C 8.552 13.000 9.000 12.552 9.000 12.000 L 9.000 11.000 L 10.000 11.000 C 10.552 11.000 11.000 10.552 11.000 10.000 C 11.000 9.448 10.552 9.000 10.000 9.000 L 9.000 9.000 L 9.000 8.000 C 9.000 7.448 8.552 7.000 8.000 7.000M 18.000 9.000 L 14.000 9.000 C 13.448 9.000 13.000 9.448 13.000 10.000 C 13.000 10.552 13.448 11.000 14.000 11.000 L 18.000 11.000 C 18.552 11.000 19.000 10.552 19.000 10.000 C 19.000 9.448 18.552 9.000 18.000 9.000"),
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
        return _deviceGamepad2!!
    }

private var _deviceGamepad2: ImageVector? = null
