package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MegaphoneLine: ImageVector
    get() {
        if (_megaphoneLine != null) return _megaphoneLine!!
        _megaphoneLine = remixIcon(
            name = "MegaphoneLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 17.000 C 9.000 17.000 16.000 18.000 19.000 21.000 L 20.000 21.000 C 20.552 21.000 21.000 20.552 21.000 20.000 L 21.000 13.937 C 21.863 13.715 22.500 12.932 22.500 12.000 C 22.500 11.068 21.863 10.285 21.000 10.063 L 21.000 4.000 C 21.000 3.448 20.552 3.000 20.000 3.000 L 19.000 3.000 C 16.000 6.000 9.000 7.000 9.000 7.000 L 5.000 7.000 C 3.895 7.000 3.000 7.895 3.000 9.000 L 3.000 15.000 C 3.000 16.105 3.895 17.000 5.000 17.000 L 6.000 17.000 L 7.000 22.000 L 9.000 22.000 L 9.000 17.000 ZM 11.000 8.661 C 11.683 8.515 12.528 8.312 13.439 8.044 C 15.118 7.550 17.250 6.773 19.000 5.575 L 19.000 18.425 C 17.250 17.227 15.118 16.450 13.439 15.956 C 12.528 15.688 11.683 15.485 11.000 15.339 L 11.000 8.661 ZM 5.000 9.000 L 9.000 9.000 L 9.000 15.000 L 5.000 15.000 L 5.000 9.000 Z"),
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
        return _megaphoneLine!!
    }

private var _megaphoneLine: ImageVector? = null
