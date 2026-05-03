package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Css3Line: ImageVector
    get() {
        if (_css3Line != null) return _css3Line!!
        _css3Line = remixIcon(
            name = "Css3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.800 14.000 L 4.840 14.000 L 4.295 16.725 L 10.039 18.879 L 17.267 16.470 L 18.360 11.000 L 3.400 11.000 L 3.800 9.000 L 18.760 9.000 L 19.560 5.000 L 4.600 5.000 L 5.000 3.000 L 22.000 3.000 L 19.000 18.000 L 10.000 21.000 L 2.000 18.000 L 2.800 14.000 Z"),
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
        return _css3Line!!
    }

private var _css3Line: ImageVector? = null
