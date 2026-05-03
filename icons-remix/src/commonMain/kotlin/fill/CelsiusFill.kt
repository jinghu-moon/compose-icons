package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CelsiusFill: ImageVector
    get() {
        if (_celsiusFill != null) return _celsiusFill!!
        _celsiusFill = remixIcon(
            name = "CelsiusFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.500 10.000 C 2.567 10.000 1.000 8.433 1.000 6.500 C 1.000 4.567 2.567 3.000 4.500 3.000 C 6.433 3.000 8.000 4.567 8.000 6.500 C 8.000 8.433 6.433 10.000 4.500 10.000 ZM 4.500 8.000 C 5.328 8.000 6.000 7.328 6.000 6.500 C 6.000 5.672 5.328 5.000 4.500 5.000 C 3.672 5.000 3.000 5.672 3.000 6.500 C 3.000 7.328 3.672 8.000 4.500 8.000 ZM 22.000 10.000 L 20.000 10.000 C 20.000 7.791 18.209 6.000 16.000 6.000 C 13.791 6.000 12.000 7.791 12.000 10.000 L 12.000 15.000 C 12.000 17.209 13.791 19.000 16.000 19.000 C 18.209 19.000 20.000 17.209 20.000 15.000 L 22.000 15.000 C 22.000 18.314 19.314 21.000 16.000 21.000 C 12.686 21.000 10.000 18.314 10.000 15.000 L 10.000 10.000 C 10.000 6.686 12.686 4.000 16.000 4.000 C 19.314 4.000 22.000 6.686 22.000 10.000 Z"),
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
        return _celsiusFill!!
    }

private var _celsiusFill: ImageVector? = null
