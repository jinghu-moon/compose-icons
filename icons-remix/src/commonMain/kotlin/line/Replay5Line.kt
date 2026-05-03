package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Replay5Line: ImageVector
    get() {
        if (_replay5Line != null) return _replay5Line!!
        _replay5Line = remixIcon(
            name = "Replay5Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 L 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 C 9.250 4.000 6.824 5.387 5.385 7.500 L 8.000 7.500 L 8.000 9.500 L 2.000 9.500 L 2.000 3.500 L 4.000 3.500 L 4.000 5.999 C 5.824 3.571 8.729 2.000 12.000 2.000 ZM 9.500 8.500 L 14.500 8.500 L 14.500 10.000 L 11.000 10.000 L 11.000 11.250 L 12.625 11.250 C 13.799 11.250 14.750 12.201 14.750 13.375 C 14.750 14.549 13.799 15.500 12.625 15.500 L 9.500 15.500 L 9.500 14.000 L 12.625 14.000 C 12.970 14.000 13.250 13.720 13.250 13.375 C 13.250 13.030 12.970 12.750 12.625 12.750 L 9.500 12.750 L 9.500 8.500 Z"),
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
        return _replay5Line!!
    }

private var _replay5Line: ImageVector? = null
