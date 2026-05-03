package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FlaskLine: ImageVector
    get() {
        if (_flaskLine != null) return _flaskLine!!
        _flaskLine = remixIcon(
            name = "FlaskLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.999 2.000 L 15.999 4.000 L 14.999 4.000 L 14.999 7.243 C 14.999 8.401 15.251 9.544 15.736 10.595 L 20.017 19.871 C 20.364 20.624 20.036 21.515 19.284 21.862 C 19.087 21.953 18.872 22.000 18.655 22.000 L 5.344 22.000 C 4.515 22.000 3.844 21.328 3.844 20.500 C 3.844 20.283 3.891 20.069 3.982 19.871 L 8.263 10.595 C 8.748 9.544 8.999 8.401 8.999 7.243 L 8.999 4.000 L 7.999 4.000 L 7.999 2.000 L 15.999 2.000 ZM 13.387 10.001 L 10.611 10.001 C 10.507 10.364 10.382 10.722 10.237 11.072 L 10.079 11.434 L 6.124 20.000 L 17.873 20.000 L 13.920 11.434 C 13.705 10.969 13.528 10.490 13.387 10.001 ZM 10.999 7.243 C 10.999 7.496 10.990 7.749 10.971 8.001 L 13.028 8.001 C 13.019 7.880 13.012 7.759 13.007 7.637 L 12.999 7.243 L 12.999 4.000 L 10.999 4.000 L 10.999 7.243 Z"),
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
        return _flaskLine!!
    }

private var _flaskLine: ImageVector? = null
