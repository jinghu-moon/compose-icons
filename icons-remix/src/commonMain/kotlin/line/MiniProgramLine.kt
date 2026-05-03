package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MiniProgramLine: ImageVector
    get() {
        if (_miniProgramLine != null) return _miniProgramLine!!
        _miniProgramLine = remixIcon(
            name = "MiniProgramLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.001 22.000 C 6.478 22.000 2.001 17.523 2.001 12.000 C 2.001 6.477 6.478 2.000 12.001 2.000 C 17.524 2.000 22.001 6.477 22.001 12.000 C 22.001 17.523 17.524 22.000 12.001 22.000 ZM 12.001 20.000 C 16.419 20.000 20.001 16.418 20.001 12.000 C 20.001 7.582 16.419 4.000 12.001 4.000 C 7.583 4.000 4.001 7.582 4.001 12.000 C 4.001 16.418 7.583 20.000 12.001 20.000 ZM 13.001 14.000 C 13.001 15.933 11.434 17.500 9.501 17.500 C 7.568 17.500 6.001 15.933 6.001 14.000 C 6.001 12.626 6.800 11.396 8.024 10.826 C 8.525 10.593 9.120 10.810 9.353 11.311 C 9.586 11.811 9.369 12.406 8.869 12.639 C 8.344 12.884 8.001 13.411 8.001 14.000 C 8.001 14.829 8.673 15.500 9.501 15.500 C 10.329 15.500 11.001 14.829 11.001 14.000 L 11.001 10.000 C 11.001 8.067 12.568 6.500 14.501 6.500 C 16.434 6.500 18.001 8.067 18.001 10.000 C 18.001 11.374 17.201 12.604 15.978 13.174 C 15.477 13.407 14.882 13.190 14.649 12.690 C 14.416 12.189 14.633 11.594 15.133 11.361 C 15.658 11.116 16.001 10.589 16.001 10.000 C 16.001 9.172 15.329 8.500 14.501 8.500 C 13.672 8.500 13.001 9.172 13.001 10.000 L 13.001 14.000 Z"),
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
        return _miniProgramLine!!
    }

private var _miniProgramLine: ImageVector? = null
