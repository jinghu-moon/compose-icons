package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PencilRulerLine: ImageVector
    get() {
        if (_pencilRulerLine != null) return _pencilRulerLine!!
        _pencilRulerLine = remixIcon(
            name = "PencilRulerLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 8.000 L 5.000 20.000 L 9.000 20.000 L 9.000 8.000 L 5.000 8.000 ZM 3.000 7.000 L 7.000 2.000 L 11.000 7.000 L 11.000 22.000 L 3.000 22.000 L 3.000 7.000 ZM 19.000 16.000 L 19.000 14.000 L 16.000 14.000 L 16.000 12.000 L 19.000 12.000 L 19.000 10.000 L 17.000 10.000 L 17.000 8.000 L 19.000 8.000 L 19.000 6.000 L 15.000 6.000 L 15.000 20.000 L 19.000 20.000 L 19.000 18.000 L 17.000 18.000 L 17.000 16.000 L 19.000 16.000 ZM 14.000 4.000 L 20.000 4.000 C 20.552 4.000 21.000 4.448 21.000 5.000 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 L 14.000 22.000 C 13.448 22.000 13.000 21.552 13.000 21.000 L 13.000 5.000 C 13.000 4.448 13.448 4.000 14.000 4.000 Z"),
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
        return _pencilRulerLine!!
    }

private var _pencilRulerLine: ImageVector? = null
