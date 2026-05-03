package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Shape2Line: ImageVector
    get() {
        if (_shape2Line != null) return _shape2Line!!
        _shape2Line = remixIcon(
            name = "Shape2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 16.000 L 22.000 16.000 L 22.000 22.000 L 16.000 22.000 L 16.000 20.000 L 8.000 20.000 L 8.000 22.000 L 2.000 22.000 L 2.000 16.000 L 4.000 16.000 L 4.000 8.000 L 2.000 8.000 L 2.000 2.000 L 8.000 2.000 L 8.000 4.000 L 16.000 4.000 L 16.000 2.000 L 22.000 2.000 L 22.000 8.000 L 20.000 8.000 L 20.000 16.000 ZM 18.000 16.000 L 18.000 8.000 L 16.000 8.000 L 16.000 6.000 L 8.000 6.000 L 8.000 8.000 L 6.000 8.000 L 6.000 16.000 L 8.000 16.000 L 8.000 18.000 L 16.000 18.000 L 16.000 16.000 L 18.000 16.000 ZM 4.000 4.000 L 4.000 6.000 L 6.000 6.000 L 6.000 4.000 L 4.000 4.000 ZM 4.000 18.000 L 4.000 20.000 L 6.000 20.000 L 6.000 18.000 L 4.000 18.000 ZM 18.000 4.000 L 18.000 6.000 L 20.000 6.000 L 20.000 4.000 L 18.000 4.000 ZM 18.000 18.000 L 18.000 20.000 L 20.000 20.000 L 20.000 18.000 L 18.000 18.000 Z"),
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
        return _shape2Line!!
    }

private var _shape2Line: ImageVector? = null
