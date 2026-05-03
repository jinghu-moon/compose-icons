package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DiscountPercentFill: ImageVector
    get() {
        if (_discountPercentFill != null) return _discountPercentFill!!
        _discountPercentFill = remixIcon(
            name = "DiscountPercentFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.946 2.094 C 12.825 1.139 11.176 1.139 10.054 2.094 L 8.706 3.243 C 8.546 3.379 8.347 3.462 8.137 3.479 L 6.372 3.619 C 4.903 3.737 3.737 4.903 3.620 6.371 L 3.479 8.137 C 3.462 8.347 3.380 8.546 3.243 8.706 L 2.095 10.054 C 1.139 11.175 1.139 12.824 2.095 13.946 L 3.243 15.294 C 3.380 15.454 3.462 15.653 3.479 15.863 L 3.620 17.628 C 3.737 19.097 4.903 20.263 6.372 20.380 L 8.137 20.521 C 8.347 20.538 8.546 20.620 8.706 20.757 L 10.054 21.905 C 11.176 22.861 12.825 22.861 13.946 21.905 L 15.294 20.757 C 15.454 20.620 15.653 20.538 15.863 20.521 L 17.629 20.380 C 19.097 20.263 20.263 19.097 20.381 17.628 L 20.521 15.863 C 20.538 15.653 20.621 15.454 20.757 15.293 L 21.906 13.946 C 22.861 12.824 22.861 11.175 21.906 10.054 L 20.757 8.706 C 20.621 8.546 20.538 8.347 20.521 8.137 L 20.381 6.371 C 20.263 4.903 19.097 3.737 17.629 3.619 L 15.863 3.479 C 15.653 3.462 15.454 3.379 15.294 3.243 L 13.946 2.094 ZM 14.828 7.757 L 16.243 9.171 L 9.172 16.243 L 7.757 14.828 L 14.828 7.757 ZM 10.232 10.232 C 9.646 10.818 8.697 10.818 8.111 10.232 C 7.525 9.646 7.525 8.697 8.111 8.111 C 8.697 7.525 9.646 7.525 10.232 8.111 C 10.818 8.697 10.818 9.646 10.232 10.232 ZM 13.768 15.889 C 13.182 15.303 13.182 14.353 13.768 13.768 C 14.354 13.182 15.303 13.182 15.889 13.768 C 16.475 14.353 16.475 15.303 15.889 15.889 C 15.303 16.475 14.354 16.475 13.768 15.889 Z"),
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
        return _discountPercentFill!!
    }

private var _discountPercentFill: ImageVector? = null
