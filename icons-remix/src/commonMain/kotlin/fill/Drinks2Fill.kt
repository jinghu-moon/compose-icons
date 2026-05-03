package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Drinks2Fill: ImageVector
    get() {
        if (_drinks2Fill != null) return _drinks2Fill!!
        _drinks2Fill = remixIcon(
            name = "Drinks2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.323 2.000 L 4.000 2.000 L 4.000 0.000 L 8.677 0.000 L 10.677 5.000 L 21.000 5.000 L 21.000 7.000 L 18.882 7.000 L 18.055 21.059 C 18.024 21.587 17.587 22.000 17.057 22.000 L 6.943 22.000 C 6.413 22.000 5.976 21.587 5.945 21.059 L 5.118 7.000 L 3.000 7.000 L 3.000 5.000 L 8.523 5.000 L 7.323 2.000 ZM 7.121 7.000 L 7.299 10.025 C 9.971 10.135 11.268 10.630 12.360 11.067 C 13.411 11.488 14.280 11.853 16.587 11.968 L 16.879 7.000 L 7.121 7.000 Z"),
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
        return _drinks2Fill!!
    }

private var _drinks2Fill: ImageVector? = null
