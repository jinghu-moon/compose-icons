package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PinterestFill: ImageVector
    get() {
        if (_pinterestFill != null) return _pinterestFill!!
        _pinterestFill = remixIcon(
            name = "PinterestFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.372 2.094 C 8.425 1.413 3.734 4.485 2.381 9.293 C 1.027 14.100 3.427 19.169 8.003 21.169 C 7.943 20.401 7.997 19.628 8.165 18.876 C 8.350 18.037 9.461 13.413 9.461 13.413 C 9.240 12.917 9.129 12.379 9.137 11.836 C 9.137 10.351 9.994 9.243 11.060 9.243 C 11.447 9.237 11.818 9.400 12.076 9.690 C 12.333 9.979 12.453 10.367 12.402 10.751 C 12.402 11.651 11.824 13.013 11.523 14.290 C 11.401 14.766 11.513 15.270 11.824 15.650 C 12.134 16.030 12.607 16.239 13.097 16.214 C 14.994 16.214 16.267 13.783 16.267 10.913 C 16.267 8.712 14.810 7.065 12.124 7.065 C 10.826 7.015 9.564 7.500 8.632 8.405 C 7.701 9.311 7.181 10.559 7.194 11.859 C 7.166 12.572 7.396 13.272 7.842 13.829 C 8.014 13.956 8.080 14.182 8.004 14.383 C 7.958 14.567 7.842 15.006 7.796 15.167 C 7.776 15.278 7.706 15.373 7.605 15.423 C 7.505 15.473 7.387 15.472 7.287 15.421 C 5.902 14.867 5.250 13.344 5.250 11.605 C 5.250 8.758 7.634 5.350 12.404 5.350 C 16.200 5.350 18.723 8.127 18.723 11.097 C 18.723 15.006 16.547 17.945 13.330 17.945 C 12.353 17.976 11.427 17.506 10.876 16.699 C 10.876 16.699 10.297 19.015 10.184 19.453 C 9.951 20.210 9.608 20.928 9.165 21.584 C 10.088 21.864 11.047 22.004 12.011 22.000 C 14.664 22.002 17.208 20.948 19.083 19.072 C 20.958 17.196 22.010 14.650 22.007 11.998 C 22.004 7.003 18.318 2.776 13.372 2.094 Z"),
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
        return _pinterestFill!!
    }

private var _pinterestFill: ImageVector? = null
