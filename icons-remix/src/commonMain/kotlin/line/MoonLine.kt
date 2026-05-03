package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MoonLine: ImageVector
    get() {
        if (_moonLine != null) return _moonLine!!
        _moonLine = remixIcon(
            name = "MoonLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 7.000 C 10.000 10.866 13.134 14.000 17.000 14.000 C 18.958 14.000 20.729 13.196 22.000 11.899 C 22.000 11.933 22.000 11.967 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 12.033 2.000 12.067 2.000 12.101 2.000 C 10.804 3.271 10.000 5.042 10.000 7.000 ZM 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 15.058 20.000 17.716 18.284 19.062 15.762 C 18.395 15.919 17.704 16.000 17.000 16.000 C 12.029 16.000 8.000 11.971 8.000 7.000 C 8.000 6.296 8.081 5.605 8.238 4.938 C 5.716 6.284 4.000 8.942 4.000 12.000 Z"),
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
        return _moonLine!!
    }

private var _moonLine: ImageVector? = null
