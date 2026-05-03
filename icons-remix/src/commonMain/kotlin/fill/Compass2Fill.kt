package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Compass2Fill: ImageVector
    get() {
        if (_compass2Fill != null) return _compass2Fill!!
        _compass2Fill = remixIcon(
            name = "Compass2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.328 4.258 L 10.586 12.000 L 12.000 13.414 L 19.742 5.672 C 21.153 7.396 22.000 9.600 22.000 12.000 C 22.000 17.520 17.520 22.000 12.000 22.000 C 6.480 22.000 2.000 17.520 2.000 12.000 C 2.000 6.480 6.480 2.000 12.000 2.000 C 14.400 2.000 16.604 2.847 18.328 4.258 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _compass2Fill!!
    }

private var _compass2Fill: ImageVector? = null
