package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Filter2Line: ImageVector
    get() {
        if (_filter2Line != null) return _filter2Line!!
        _filter2Line = remixIcon(
            name = "Filter2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 14.000 L 14.000 20.000 L 10.000 22.000 L 10.000 14.000 L 4.000 5.000 L 4.000 3.000 L 20.000 3.000 L 20.000 5.000 L 14.000 14.000 ZM 6.404 5.000 L 12.000 13.394 L 17.596 5.000 L 6.404 5.000 Z"),
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
        return _filter2Line!!
    }

private var _filter2Line: ImageVector? = null
