package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CupLine: ImageVector
    get() {
        if (_cupLine != null) return _cupLine!!
        _cupLine = remixIcon(
            name = "CupLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 13.000 L 16.000 5.000 L 6.000 5.000 L 6.000 13.000 C 6.000 14.105 6.895 15.000 8.000 15.000 L 14.000 15.000 C 15.105 15.000 16.000 14.105 16.000 13.000 ZM 5.000 3.000 L 20.000 3.000 C 21.105 3.000 22.000 3.895 22.000 5.000 L 22.000 8.000 C 22.000 9.105 21.105 10.000 20.000 10.000 L 18.000 10.000 L 18.000 13.000 C 18.000 15.209 16.209 17.000 14.000 17.000 L 8.000 17.000 C 5.791 17.000 4.000 15.209 4.000 13.000 L 4.000 4.000 C 4.000 3.448 4.448 3.000 5.000 3.000 ZM 18.000 5.000 L 18.000 8.000 L 20.000 8.000 L 20.000 5.000 L 18.000 5.000 ZM 2.000 19.000 L 20.000 19.000 L 20.000 21.000 L 2.000 21.000 L 2.000 19.000 Z"),
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
        return _cupLine!!
    }

private var _cupLine: ImageVector? = null
