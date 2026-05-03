package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BnbFill: ImageVector
    get() {
        if (_bnbFill != null) return _bnbFill!!
        _bnbFill = remixIcon(
            name = "BnbFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.167 4.367 L 12.000 1.000 L 17.833 4.367 L 15.689 5.611 L 12.000 3.488 L 8.312 5.611 L 6.167 4.367 ZM 17.833 8.613 L 15.689 7.369 L 12.000 9.492 L 8.312 7.369 L 6.167 8.613 L 6.167 11.100 L 9.856 13.223 L 9.856 17.469 L 12.000 18.713 L 14.144 17.469 L 14.144 13.223 L 17.833 11.100 L 17.833 8.613 ZM 17.833 15.347 L 17.833 12.859 L 15.689 14.103 L 15.689 16.590 L 17.833 15.347 ZM 19.355 16.226 L 15.667 18.349 L 15.667 20.836 L 21.500 17.469 L 21.500 10.736 L 19.355 11.980 L 19.355 16.226 ZM 17.211 6.490 L 19.355 7.734 L 19.355 10.221 L 21.500 8.977 L 21.500 6.490 L 19.355 5.246 L 17.211 6.490 ZM 9.856 19.249 L 9.856 21.737 L 12.000 22.981 L 14.144 21.737 L 14.144 19.249 L 12.000 20.493 L 9.856 19.249 ZM 6.167 15.347 L 8.312 16.590 L 8.312 14.103 L 6.167 12.859 L 6.167 15.347 ZM 9.856 6.490 L 12.000 7.734 L 14.144 6.490 L 12.000 5.246 L 9.856 6.490 ZM 4.644 7.734 L 6.789 6.490 L 4.644 5.246 L 2.500 6.490 L 2.500 8.977 L 4.644 10.221 L 4.644 7.734 ZM 4.644 11.980 L 2.500 10.736 L 2.500 17.469 L 8.333 20.836 L 8.333 18.349 L 4.644 16.226 L 4.644 11.980 Z"),
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
        return _bnbFill!!
    }

private var _bnbFill: ImageVector? = null
