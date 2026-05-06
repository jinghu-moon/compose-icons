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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10 7c0 3.866 3.134 7 7 7 1.958 0 3.729-.804 5-2.101C22 11.933 22 11.967 22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c.033 0 .067 0 .101 0C10.804 3.271 10 5.042 10 7ZM4 12c0 4.418 3.582 8 8 8 3.058 0 5.716-1.716 7.062-4.238C18.395 15.919 17.704 16 17 16 12.029 16 8 11.971 8 7 8 6.296 8.081 5.605 8.238 4.938 5.716 6.284 4 8.942 4 12Z"),
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
        return _moonLine!!
    }

private var _moonLine: ImageVector? = null
