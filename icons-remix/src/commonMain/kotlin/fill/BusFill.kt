package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BusFill: ImageVector
    get() {
        if (_busFill != null) return _busFill!!
        _busFill = remixIcon(
            name = "BusFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 20.000 L 7.000 20.000 L 7.000 21.000 C 7.000 21.552 6.552 22.000 6.000 22.000 L 5.000 22.000 C 4.448 22.000 4.000 21.552 4.000 21.000 L 4.000 20.000 L 3.000 20.000 L 3.000 12.000 L 2.000 12.000 L 2.000 8.000 L 3.000 8.000 L 3.000 5.000 C 3.000 3.895 3.895 3.000 5.000 3.000 L 19.000 3.000 C 20.105 3.000 21.000 3.895 21.000 5.000 L 21.000 8.000 L 22.000 8.000 L 22.000 12.000 L 21.000 12.000 L 21.000 20.000 L 20.000 20.000 L 20.000 21.000 C 20.000 21.552 19.552 22.000 19.000 22.000 L 18.000 22.000 C 17.448 22.000 17.000 21.552 17.000 21.000 L 17.000 20.000 ZM 5.000 5.000 L 5.000 14.000 L 19.000 14.000 L 19.000 5.000 L 5.000 5.000 ZM 5.000 16.000 L 5.000 18.000 L 9.000 18.000 L 9.000 16.000 L 5.000 16.000 ZM 15.000 16.000 L 15.000 18.000 L 19.000 18.000 L 19.000 16.000 L 15.000 16.000 Z"),
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
        return _busFill!!
    }

private var _busFill: ImageVector? = null
