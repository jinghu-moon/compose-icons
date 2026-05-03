package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BreadFill: ImageVector
    get() {
        if (_breadFill != null) return _breadFill!!
        _breadFill = remixIcon(
            name = "BreadFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 1.000 7.000 C 1.000 4.791 2.791 3.000 5.000 3.000 L 7.000 3.000 C 4.791 3.000 3.000 4.791 3.000 7.000 C 3.000 8.482 3.805 9.773 5.000 10.465 L 5.000 19.000 C 5.000 20.657 6.343 22.000 8.000 22.000 L 6.000 22.000 C 4.343 22.000 3.000 20.657 3.000 19.000 L 3.000 10.465 C 1.805 9.773 1.000 8.482 1.000 7.000 ZM 8.000 22.000 L 8.000 20.000 C 7.448 20.000 7.000 19.552 7.000 19.000 L 7.000 9.122 L 6.333 8.886 C 5.555 8.611 5.000 7.869 5.000 7.000 C 5.000 5.895 5.895 5.000 7.000 5.000 L 7.000 3.000 L 19.000 3.000 C 21.209 3.000 23.000 4.791 23.000 7.000 C 23.000 8.482 22.195 9.773 21.000 10.465 L 21.000 19.000 C 21.000 20.657 19.657 22.000 18.000 22.000 L 8.000 22.000 Z"),
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
        return _breadFill!!
    }

private var _breadFill: ImageVector? = null
