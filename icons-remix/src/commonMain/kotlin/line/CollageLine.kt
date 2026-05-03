package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CollageLine: ImageVector
    get() {
        if (_collageLine != null) return _collageLine!!
        _collageLine = remixIcon(
            name = "CollageLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 3.107 C 20.552 3.107 21.000 3.554 21.000 4.107 L 21.000 20.107 C 21.000 20.659 20.552 21.107 20.000 21.107 L 4.000 21.107 C 3.448 21.107 3.000 20.659 3.000 20.107 L 3.000 4.107 C 3.000 3.554 3.448 3.107 4.000 3.107 L 20.000 3.107 ZM 11.189 13.265 L 5.000 14.356 L 5.000 19.107 L 12.218 19.107 L 11.189 13.265 ZM 19.000 5.107 L 11.781 5.107 L 14.249 19.107 L 19.000 19.107 L 19.000 5.107 ZM 9.750 5.107 L 5.000 5.107 L 5.000 12.325 L 10.842 11.295 L 9.750 5.107 Z"),
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
        return _collageLine!!
    }

private var _collageLine: ImageVector? = null
