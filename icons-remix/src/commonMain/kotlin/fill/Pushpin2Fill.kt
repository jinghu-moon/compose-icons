package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Pushpin2Fill: ImageVector
    get() {
        if (_pushpin2Fill != null) return _pushpin2Fill!!
        _pushpin2Fill = remixIcon(
            name = "Pushpin2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 3.000 L 18.000 5.000 L 17.000 5.000 L 17.000 11.000 L 19.000 14.000 L 19.000 16.000 L 13.000 16.000 L 13.000 23.000 L 11.000 23.000 L 11.000 16.000 L 5.000 16.000 L 5.000 14.000 L 7.000 11.000 L 7.000 5.000 L 6.000 5.000 L 6.000 3.000 L 18.000 3.000 Z"),
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
        return _pushpin2Fill!!
    }

private var _pushpin2Fill: ImageVector? = null
