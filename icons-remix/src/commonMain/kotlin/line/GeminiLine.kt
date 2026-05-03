package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GeminiLine: ImageVector
    get() {
        if (_geminiLine != null) return _geminiLine!!
        _geminiLine = remixIcon(
            name = "GeminiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.124 1.091 L 12.875 1.091 L 12.927 1.945 C 13.223 6.851 17.149 10.777 22.055 11.073 L 22.909 11.125 L 22.909 12.876 L 22.055 12.927 C 17.149 13.223 13.223 17.150 12.927 22.055 L 12.875 22.910 L 11.124 22.910 L 11.073 22.055 C 10.777 17.150 6.850 13.223 1.945 12.927 L 1.091 12.876 L 1.091 11.125 L 1.945 11.073 C 6.850 10.777 10.777 6.851 11.073 1.945 L 11.124 1.091 ZM 12.000 5.850 C 10.830 8.615 8.615 10.830 5.850 12.000 C 8.615 13.170 10.830 15.385 12.000 18.150 C 13.170 15.385 15.385 13.170 18.150 12.000 C 15.385 10.830 13.170 8.615 12.000 5.850 Z"),
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
        return _geminiLine!!
    }

private var _geminiLine: ImageVector? = null
