package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Car: ImageVector
    get() {
        if (_car != null) return _car!!
        _car = tablerFilledIcon(
            name = "Car",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 5.000 C 14.259 5.000 14.508 5.100 14.694 5.280 L 14.781 5.375 L 18.480 10.000 L 19.000 10.000 C 20.589 10.000 21.902 11.238 21.995 12.824 L 22.000 13.000 L 22.000 17.000 C 22.000 17.552 21.552 18.000 21.000 18.000 L 19.829 18.000 C 19.405 19.198 18.271 20.000 17.000 20.000 C 15.729 20.000 14.595 19.198 14.171 18.000 L 9.829 18.000 C 9.405 19.198 8.271 20.000 7.000 20.000 C 5.729 20.000 4.595 19.198 4.171 18.000 L 3.000 18.000 C 2.448 18.000 2.000 17.552 2.000 17.000 L 2.000 11.000 L 2.007 10.883 L 2.015 10.827 L 2.032 10.749 L 2.044 10.713 L 2.058 10.663 L 4.072 5.629 C 4.224 5.249 4.591 5.000 5.000 5.000 ZM 7.000 16.000 C 6.448 16.000 6.000 16.448 6.000 17.000 C 6.000 17.552 6.448 18.000 7.000 18.000 C 7.552 18.000 8.000 17.552 8.000 17.000 C 8.000 16.448 7.552 16.000 7.000 16.000M 17.000 16.000 C 16.448 16.000 16.000 16.448 16.000 17.000 C 16.000 17.552 16.448 18.000 17.000 18.000 C 17.552 18.000 18.000 17.552 18.000 17.000 C 18.000 16.448 17.552 16.000 17.000 16.000M 11.000 7.000 L 5.676 7.000 L 4.476 10.000 L 11.000 10.000 ZM 13.520 7.000 L 13.000 7.000 L 13.000 10.000 L 15.920 10.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _car!!
    }

private var _car: ImageVector? = null
