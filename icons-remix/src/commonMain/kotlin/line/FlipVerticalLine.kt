package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FlipVerticalLine: ImageVector
    get() {
        if (_flipVerticalLine != null) return _flipVerticalLine!!
        _flipVerticalLine = remixIcon(
            name = "FlipVerticalLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.000 11.000 L 2.000 11.000 L 2.000 13.000 L 22.000 13.000 L 22.000 11.000 ZM 18.000 2.000 C 19.105 2.000 20.000 2.895 20.000 4.000 L 20.000 7.000 C 20.000 8.105 19.105 9.000 18.000 9.000 L 6.000 9.000 C 4.895 9.000 4.000 8.105 4.000 7.000 L 4.000 4.000 C 4.000 2.895 4.895 2.000 6.000 2.000 L 18.000 2.000 ZM 18.000 20.000 L 6.000 20.000 L 6.000 17.000 L 18.000 17.000 L 18.000 20.000 ZM 20.000 17.000 C 20.000 15.895 19.105 15.000 18.000 15.000 L 6.000 15.000 C 4.895 15.000 4.000 15.895 4.000 17.000 L 4.000 20.000 C 4.000 21.105 4.895 22.000 6.000 22.000 L 18.000 22.000 C 19.105 22.000 20.000 21.105 20.000 20.000 L 20.000 17.000 Z"),
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
        return _flipVerticalLine!!
    }

private var _flipVerticalLine: ImageVector? = null
