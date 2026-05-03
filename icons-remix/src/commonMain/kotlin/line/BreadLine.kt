package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BreadLine: ImageVector
    get() {
        if (_breadLine != null) return _breadLine!!
        _breadLine = remixIcon(
            name = "BreadLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 3.000 C 2.791 3.000 1.000 4.791 1.000 7.000 C 1.000 8.482 1.805 9.773 3.000 10.465 L 3.000 19.000 C 3.000 20.657 4.343 22.000 6.000 22.000 L 18.000 22.000 C 19.657 22.000 21.000 20.657 21.000 19.000 L 21.000 10.465 C 22.195 9.773 23.000 8.482 23.000 7.000 C 23.000 4.791 21.209 3.000 19.000 3.000 L 5.000 3.000 ZM 7.000 20.000 C 6.448 20.000 6.000 19.552 6.000 19.000 L 6.000 9.122 L 5.333 8.886 C 4.555 8.611 4.000 7.869 4.000 7.000 C 4.000 5.895 4.895 5.000 6.000 5.000 L 19.000 5.000 C 20.105 5.000 21.000 5.895 21.000 7.000 C 21.000 7.869 20.445 8.611 19.667 8.886 L 19.000 9.122 L 19.000 19.000 C 19.000 19.552 18.552 20.000 18.000 20.000 L 7.000 20.000 Z"),
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
        return _breadLine!!
    }

private var _breadLine: ImageVector? = null
