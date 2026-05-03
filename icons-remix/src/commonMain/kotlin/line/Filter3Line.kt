package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Filter3Line: ImageVector
    get() {
        if (_filter3Line != null) return _filter3Line!!
        _filter3Line = remixIcon(
            name = "Filter3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 18.000 L 14.000 18.000 L 14.000 16.000 L 10.000 16.000 L 10.000 18.000 ZM 3.000 6.000 L 3.000 8.000 L 21.000 8.000 L 21.000 6.000 L 3.000 6.000 ZM 6.000 13.000 L 18.000 13.000 L 18.000 11.000 L 6.000 11.000 L 6.000 13.000 Z"),
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
        return _filter3Line!!
    }

private var _filter3Line: ImageVector? = null
