package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FridgeLine: ImageVector
    get() {
        if (_fridgeLine != null) return _fridgeLine!!
        _fridgeLine = remixIcon(
            name = "FridgeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.998 1.000 C 19.550 1.000 19.998 1.448 19.998 2.000 L 19.998 22.000 C 19.998 22.552 19.550 23.000 18.998 23.000 L 4.998 23.000 C 4.446 23.000 3.998 22.552 3.998 22.000 L 3.998 2.000 C 3.998 1.448 4.446 1.000 4.998 1.000 L 18.998 1.000 ZM 17.998 12.000 L 5.998 12.000 L 5.998 21.000 L 17.998 21.000 L 17.998 12.000 ZM 9.998 14.000 L 9.998 18.000 L 7.998 18.000 L 7.998 14.000 L 9.998 14.000 ZM 17.998 3.000 L 5.998 3.000 L 5.998 10.000 L 17.998 10.000 L 17.998 3.000 ZM 9.998 5.000 L 9.998 8.000 L 7.998 8.000 L 7.998 5.000 L 9.998 5.000 Z"),
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
        return _fridgeLine!!
    }

private var _fridgeLine: ImageVector? = null
