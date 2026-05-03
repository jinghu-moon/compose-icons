package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DiscountPercentLine: ImageVector
    get() {
        if (_discountPercentLine != null) return _discountPercentLine!!
        _discountPercentLine = remixIcon(
            name = "DiscountPercentLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.054 2.094 C 11.176 1.139 12.825 1.139 13.946 2.094 L 15.294 3.243 C 15.454 3.379 15.653 3.462 15.863 3.479 L 17.629 3.619 C 19.097 3.737 20.263 4.903 20.381 6.371 L 20.521 8.137 C 20.538 8.347 20.621 8.546 20.757 8.706 L 21.906 10.054 C 22.861 11.175 22.861 12.824 21.906 13.946 L 20.757 15.293 C 20.621 15.454 20.538 15.653 20.521 15.863 L 20.381 17.628 C 20.263 19.097 19.097 20.263 17.629 20.380 L 15.863 20.521 C 15.653 20.538 15.454 20.620 15.294 20.757 L 13.946 21.905 C 12.825 22.861 11.176 22.861 10.054 21.905 L 8.706 20.757 C 8.546 20.620 8.347 20.538 8.137 20.521 L 6.372 20.380 C 4.903 20.263 3.737 19.097 3.620 17.628 L 3.479 15.863 C 3.462 15.653 3.380 15.454 3.243 15.294 L 2.095 13.946 C 1.139 12.824 1.139 11.175 2.095 10.054 L 3.243 8.706 C 3.380 8.546 3.462 8.347 3.479 8.137 L 3.620 6.371 C 3.737 4.903 4.903 3.737 6.372 3.619 L 8.137 3.479 C 8.347 3.462 8.546 3.379 8.706 3.243 L 10.054 2.094 ZM 12.649 3.616 C 12.275 3.298 11.725 3.298 11.352 3.616 L 10.004 4.765 C 9.523 5.175 8.926 5.422 8.296 5.472 L 6.531 5.613 C 6.041 5.652 5.653 6.041 5.614 6.530 L 5.473 8.296 C 5.423 8.925 5.175 9.523 4.766 10.003 L 3.617 11.351 C 3.298 11.725 3.298 12.275 3.617 12.648 L 4.766 13.996 C 5.175 14.477 5.423 15.074 5.473 15.703 L 5.614 17.469 C 5.653 17.958 6.041 18.347 6.531 18.386 L 8.296 18.527 C 8.926 18.577 9.523 18.825 10.004 19.234 L 11.352 20.383 C 11.725 20.702 12.275 20.702 12.649 20.383 L 13.997 19.234 C 14.477 18.825 15.075 18.577 15.704 18.527 L 17.469 18.386 C 17.959 18.347 18.348 17.958 18.387 17.469 L 18.528 15.703 C 18.578 15.074 18.825 14.477 19.235 13.996 L 20.384 12.648 C 20.702 12.275 20.702 11.725 20.384 11.351 L 19.235 10.003 C 18.825 9.523 18.578 8.925 18.528 8.296 L 18.387 6.530 C 18.348 6.041 17.959 5.652 17.469 5.613 L 15.704 5.472 C 15.075 5.422 14.477 5.175 13.997 4.765 L 12.649 3.616 ZM 14.828 7.757 L 16.243 9.171 L 9.172 16.243 L 7.757 14.828 L 14.828 7.757 ZM 10.232 10.232 C 9.646 10.818 8.697 10.818 8.111 10.232 C 7.525 9.646 7.525 8.697 8.111 8.111 C 8.697 7.525 9.646 7.525 10.232 8.111 C 10.818 8.697 10.818 9.646 10.232 10.232 ZM 13.768 15.889 C 14.354 16.475 15.303 16.475 15.889 15.889 C 16.475 15.303 16.475 14.353 15.889 13.768 C 15.303 13.182 14.354 13.182 13.768 13.768 C 13.182 14.353 13.182 15.303 13.768 15.889 Z"),
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
        return _discountPercentLine!!
    }

private var _discountPercentLine: ImageVector? = null
