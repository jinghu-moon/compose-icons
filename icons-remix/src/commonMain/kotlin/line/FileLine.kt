package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileLine: ImageVector
    get() {
        if (_fileLine != null) return _fileLine!!
        _fileLine = remixIcon(
            name = "FileLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 2.003 L 9.000 2.000 L 19.998 2.000 C 20.551 2.000 21.000 2.455 21.000 2.992 L 21.000 21.008 C 21.000 21.556 20.555 22.000 20.007 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.550 3.000 20.993 L 3.000 8.000 L 9.000 2.003 ZM 5.829 8.000 L 9.000 8.000 L 9.000 4.831 L 5.829 8.000 ZM 11.000 4.000 L 11.000 9.000 C 11.000 9.552 10.552 10.000 10.000 10.000 L 5.000 10.000 L 5.000 20.000 L 19.000 20.000 L 19.000 4.000 L 11.000 4.000 Z"),
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
        return _fileLine!!
    }

private var _fileLine: ImageVector? = null
