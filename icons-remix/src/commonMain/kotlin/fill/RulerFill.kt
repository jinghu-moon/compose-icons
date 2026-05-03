package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RulerFill: ImageVector
    get() {
        if (_rulerFill != null) return _rulerFill!!
        _rulerFill = remixIcon(
            name = "RulerFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.929 13.314 L 7.050 15.435 L 8.465 14.021 L 6.343 11.900 L 8.465 9.778 L 11.293 12.607 L 12.707 11.193 L 9.879 8.364 L 12.000 6.243 L 14.121 8.364 L 15.536 6.950 L 13.414 4.829 L 16.243 2.000 C 16.633 1.610 17.266 1.610 17.657 2.000 L 22.607 6.950 C 22.997 7.340 22.997 7.974 22.607 8.364 L 7.757 23.213 C 7.367 23.604 6.734 23.604 6.343 23.213 L 1.393 18.264 C 1.003 17.873 1.003 17.240 1.393 16.849 L 4.929 13.314 Z"),
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
        return _rulerFill!!
    }

private var _rulerFill: ImageVector? = null
