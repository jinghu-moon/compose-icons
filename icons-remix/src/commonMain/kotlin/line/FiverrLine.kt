package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FiverrLine: ImageVector
    get() {
        if (_fiverrLine != null) return _fiverrLine!!
        _fiverrLine = remixIcon(
            name = "FiverrLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 ZM 13.679 7.927 L 12.179 7.927 C 11.622 7.927 11.235 8.270 11.235 8.784 L 11.235 9.256 L 16.207 9.256 L 16.207 17.142 L 13.679 17.142 L 13.679 11.398 L 11.235 11.398 L 11.235 17.142 L 8.707 17.142 L 8.707 11.398 L 7.250 11.398 L 7.250 9.256 L 8.707 9.256 L 8.707 8.612 C 8.707 6.941 9.950 5.784 11.793 5.784 L 13.679 5.784 L 13.679 7.927 Z"),
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
        return _fiverrLine!!
    }

private var _fiverrLine: ImageVector? = null
