package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowGoBackLine: ImageVector
    get() {
        if (_arrowGoBackLine != null) return _arrowGoBackLine!!
        _arrowGoBackLine = remixIcon(
            name = "ArrowGoBackLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.828 7.000 L 8.364 9.535 L 6.950 10.949 L 2.000 6.000 L 6.950 1.050 L 8.364 2.464 L 5.828 5.000 L 13.000 5.000 C 17.418 5.000 21.000 8.581 21.000 13.000 C 21.000 17.418 17.418 21.000 13.000 21.000 L 4.000 21.000 L 4.000 19.000 L 13.000 19.000 C 16.314 19.000 19.000 16.313 19.000 13.000 C 19.000 9.686 16.314 7.000 13.000 7.000 L 5.828 7.000 Z"),
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
        return _arrowGoBackLine!!
    }

private var _arrowGoBackLine: ImageVector? = null
