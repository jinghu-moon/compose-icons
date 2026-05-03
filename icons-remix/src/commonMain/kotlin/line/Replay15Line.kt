package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Replay15Line: ImageVector
    get() {
        if (_replay15Line != null) return _replay15Line!!
        _replay15Line = remixIcon(
            name = "Replay15Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 L 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 C 9.250 4.000 6.824 5.387 5.385 7.500 L 8.000 7.500 L 8.000 9.500 L 2.000 9.500 L 2.000 3.500 L 4.000 3.500 L 4.000 5.999 C 5.824 3.571 8.729 2.000 12.000 2.000 ZM 8.500 15.500 L 8.500 8.500 L 10.000 8.500 L 10.000 15.500 L 8.500 15.500 ZM 12.000 8.500 L 16.750 8.500 L 16.750 10.000 L 13.500 10.000 L 13.500 11.250 L 14.875 11.250 C 16.049 11.250 17.000 12.201 17.000 13.375 C 17.000 14.549 16.049 15.500 14.875 15.500 L 12.000 15.500 L 12.000 14.000 L 14.875 14.000 C 15.220 14.000 15.500 13.720 15.500 13.375 C 15.500 13.030 15.220 12.750 14.875 12.750 L 12.000 12.750 L 12.000 8.500 Z"),
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
        return _replay15Line!!
    }

private var _replay15Line: ImageVector? = null
