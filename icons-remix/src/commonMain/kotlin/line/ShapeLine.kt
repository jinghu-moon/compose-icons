package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShapeLine: ImageVector
    get() {
        if (_shapeLine != null) return _shapeLine!!
        _shapeLine = remixIcon(
            name = "ShapeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.829 20.000 C 7.417 21.165 6.306 22.000 5.000 22.000 C 3.343 22.000 2.000 20.657 2.000 19.000 C 2.000 17.694 2.835 16.583 4.000 16.171 L 4.000 7.829 C 2.835 7.417 2.000 6.306 2.000 5.000 C 2.000 3.343 3.343 2.000 5.000 2.000 C 6.306 2.000 7.417 2.835 7.829 4.000 L 16.171 4.000 C 16.583 2.835 17.694 2.000 19.000 2.000 C 20.657 2.000 22.000 3.343 22.000 5.000 C 22.000 6.306 21.165 7.417 20.000 7.829 L 20.000 16.171 C 21.165 16.583 22.000 17.694 22.000 19.000 C 22.000 20.657 20.657 22.000 19.000 22.000 C 17.694 22.000 16.583 21.165 16.171 20.000 L 7.829 20.000 ZM 7.829 18.000 L 16.171 18.000 C 16.472 17.148 17.148 16.472 18.000 16.171 L 18.000 7.829 C 17.148 7.528 16.472 6.852 16.171 6.000 L 7.829 6.000 C 7.528 6.852 6.852 7.528 6.000 7.829 L 6.000 16.171 C 6.852 16.472 7.528 17.148 7.829 18.000 ZM 5.000 6.000 C 5.552 6.000 6.000 5.552 6.000 5.000 C 6.000 4.448 5.552 4.000 5.000 4.000 C 4.448 4.000 4.000 4.448 4.000 5.000 C 4.000 5.552 4.448 6.000 5.000 6.000 ZM 19.000 6.000 C 19.552 6.000 20.000 5.552 20.000 5.000 C 20.000 4.448 19.552 4.000 19.000 4.000 C 18.448 4.000 18.000 4.448 18.000 5.000 C 18.000 5.552 18.448 6.000 19.000 6.000 ZM 19.000 20.000 C 19.552 20.000 20.000 19.552 20.000 19.000 C 20.000 18.448 19.552 18.000 19.000 18.000 C 18.448 18.000 18.000 18.448 18.000 19.000 C 18.000 19.552 18.448 20.000 19.000 20.000 ZM 5.000 20.000 C 5.552 20.000 6.000 19.552 6.000 19.000 C 6.000 18.448 5.552 18.000 5.000 18.000 C 4.448 18.000 4.000 18.448 4.000 19.000 C 4.000 19.552 4.448 20.000 5.000 20.000 Z"),
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
        return _shapeLine!!
    }

private var _shapeLine: ImageVector? = null
