package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.StoreLine: ImageVector
    get() {
        if (_storeLine != null) return _storeLine!!
        _storeLine = remixIcon(
            name = "StoreLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 11.646 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 L 3.000 11.646 C 2.378 10.941 2.000 10.014 2.000 9.000 L 2.000 3.000 C 2.000 2.448 2.448 2.000 3.000 2.000 L 21.000 2.000 C 21.552 2.000 22.000 2.448 22.000 3.000 L 22.000 9.000 C 22.000 10.014 21.622 10.941 21.000 11.646 ZM 19.000 12.874 C 18.680 12.956 18.345 13.000 18.000 13.000 C 16.805 13.000 15.733 12.476 15.000 11.646 C 14.267 12.476 13.195 13.000 12.000 13.000 C 10.805 13.000 9.733 12.476 9.000 11.646 C 8.267 12.476 7.195 13.000 6.000 13.000 C 5.655 13.000 5.320 12.956 5.000 12.874 L 5.000 20.000 L 19.000 20.000 L 19.000 12.874 ZM 14.000 9.000 C 14.000 8.448 14.448 8.000 15.000 8.000 C 15.552 8.000 16.000 8.448 16.000 9.000 C 16.000 10.105 16.895 11.000 18.000 11.000 C 19.105 11.000 20.000 10.105 20.000 9.000 L 20.000 4.000 L 4.000 4.000 L 4.000 9.000 C 4.000 10.105 4.895 11.000 6.000 11.000 C 7.105 11.000 8.000 10.105 8.000 9.000 C 8.000 8.448 8.448 8.000 9.000 8.000 C 9.552 8.000 10.000 8.448 10.000 9.000 C 10.000 10.105 10.895 11.000 12.000 11.000 C 13.105 11.000 14.000 10.105 14.000 9.000 Z"),
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
        return _storeLine!!
    }

private var _storeLine: ImageVector? = null
