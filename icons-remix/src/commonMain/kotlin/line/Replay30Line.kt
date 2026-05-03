package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Replay30Line: ImageVector
    get() {
        if (_replay30Line != null) return _replay30Line!!
        _replay30Line = remixIcon(
            name = "Replay30Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.000 12.000 C 22.000 6.477 17.523 2.000 12.000 2.000 C 8.729 2.000 5.824 3.571 4.000 5.999 L 4.000 3.500 L 2.000 3.500 L 2.000 9.500 L 6.750 9.500 L 6.750 10.000 L 9.375 10.000 C 9.720 10.000 10.000 10.280 10.000 10.625 C 10.000 10.970 9.720 11.250 9.375 11.250 L 7.500 11.250 L 7.500 12.750 L 9.375 12.750 C 9.720 12.750 10.000 13.030 10.000 13.375 C 10.000 13.720 9.720 14.000 9.375 14.000 L 6.750 14.000 L 6.750 15.500 L 9.375 15.500 C 10.548 15.500 11.500 14.549 11.500 13.375 C 11.500 12.851 11.310 12.371 10.995 12.000 C 11.310 11.629 11.500 11.149 11.500 10.625 C 11.500 9.451 10.548 8.500 9.375 8.500 L 8.000 8.500 L 8.000 7.500 L 5.385 7.500 C 6.824 5.387 9.250 4.000 12.000 4.000 C 16.418 4.000 20.000 7.582 20.000 12.000 C 20.000 16.418 16.418 20.000 12.000 20.000 C 7.582 20.000 4.000 16.418 4.000 12.000 L 2.000 12.000 C 2.000 17.523 6.477 22.000 12.000 22.000 C 17.523 22.000 22.000 17.523 22.000 12.000 ZM 12.500 10.750 C 12.500 9.369 13.619 8.250 15.000 8.250 C 16.381 8.250 17.500 9.369 17.500 10.750 L 17.500 13.250 C 17.500 14.631 16.381 15.750 15.000 15.750 C 13.619 15.750 12.500 14.631 12.500 13.250 L 12.500 10.750 ZM 15.000 9.750 C 14.448 9.750 14.000 10.198 14.000 10.750 L 14.000 13.250 C 14.000 13.802 14.448 14.250 15.000 14.250 C 15.552 14.250 16.000 13.802 16.000 13.250 L 16.000 10.750 C 16.000 10.198 15.552 9.750 15.000 9.750 Z"),
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
        return _replay30Line!!
    }

private var _replay30Line: ImageVector? = null
