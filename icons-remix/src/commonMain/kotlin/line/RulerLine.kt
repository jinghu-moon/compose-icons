package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RulerLine: ImageVector
    get() {
        if (_rulerLine != null) return _rulerLine!!
        _rulerLine = remixIcon(
            name = "RulerLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.343 14.728 L 3.515 17.556 L 7.050 21.092 L 20.485 7.657 L 16.950 4.121 L 14.828 6.243 L 16.243 7.657 L 14.828 9.071 L 13.414 7.657 L 11.293 9.778 L 13.414 11.900 L 12.000 13.314 L 9.879 11.193 L 7.757 13.314 L 9.172 14.728 L 7.757 16.142 L 6.343 14.728 ZM 17.657 2.000 L 22.607 6.950 C 22.997 7.340 22.997 7.974 22.607 8.364 L 7.757 23.213 C 7.367 23.604 6.734 23.604 6.343 23.213 L 1.393 18.264 C 1.003 17.873 1.003 17.240 1.393 16.849 L 16.243 2.000 C 16.633 1.610 17.266 1.610 17.657 2.000 Z"),
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
        return _rulerLine!!
    }

private var _rulerLine: ImageVector? = null
