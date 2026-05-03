package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.StarHalfFill: ImageVector
    get() {
        if (_starHalfFill != null) return _starHalfFill!!
        _starHalfFill = remixIcon(
            name = "StarHalfFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.001 15.968 L 16.247 18.345 L 15.299 13.572 L 18.872 10.267 L 14.039 9.694 L 12.001 5.275 L 12.001 15.968 ZM 12.001 18.260 L 4.947 22.208 L 6.522 14.280 L 0.588 8.792 L 8.615 7.840 L 12.001 0.500 L 15.386 7.840 L 23.413 8.792 L 17.479 14.280 L 19.054 22.208 L 12.001 18.260 Z"),
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
        return _starHalfFill!!
    }

private var _starHalfFill: ImageVector? = null
