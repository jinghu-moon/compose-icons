package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HeavyShowersFill: ImageVector
    get() {
        if (_heavyShowersFill != null) return _heavyShowersFill!!
        _heavyShowersFill = remixIcon(
            name = "HeavyShowersFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 18.000 L 13.000 23.000 L 11.000 23.000 L 11.000 18.000 L 9.000 18.000 L 9.000 21.000 L 7.000 21.000 L 7.000 17.748 C 3.550 16.860 1.000 13.728 1.000 10.000 C 1.000 5.582 4.582 2.000 9.000 2.000 C 12.395 2.000 15.296 4.115 16.458 7.099 C 16.795 7.034 17.144 7.000 17.500 7.000 C 20.538 7.000 23.000 9.462 23.000 12.500 C 23.000 15.538 20.538 18.000 17.500 18.000 L 17.000 18.000 L 17.000 21.000 L 15.000 21.000 L 15.000 18.000 L 13.000 18.000 Z"),
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
        return _heavyShowersFill!!
    }

private var _heavyShowersFill: ImageVector? = null
