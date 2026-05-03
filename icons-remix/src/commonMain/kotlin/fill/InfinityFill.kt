package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.InfinityFill: ImageVector
    get() {
        if (_infinityFill != null) return _infinityFill!!
        _infinityFill = remixIcon(
            name = "InfinityFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 12.000 C 3.000 13.933 4.567 15.500 6.500 15.500 C 7.703 15.500 8.520 15.066 9.199 14.387 C 9.821 13.764 10.321 12.947 10.855 12.000 C 10.321 11.053 9.821 10.236 9.199 9.613 C 8.520 8.934 7.703 8.500 6.500 8.500 C 4.567 8.500 3.000 10.067 3.000 12.000 ZM 6.500 17.500 C 3.462 17.500 1.000 15.038 1.000 12.000 C 1.000 8.962 3.462 6.500 6.500 6.500 C 8.297 6.500 9.605 7.191 10.613 8.199 C 11.149 8.734 11.600 9.362 12.000 10.002 C 12.400 9.362 12.851 8.734 13.387 8.199 C 14.395 7.191 15.703 6.500 17.500 6.500 C 20.538 6.500 23.000 8.962 23.000 12.000 C 23.000 15.038 20.538 17.500 17.500 17.500 C 15.703 17.500 14.395 16.809 13.387 15.801 C 12.851 15.266 12.400 14.638 12.000 13.998 C 11.600 14.638 11.149 15.266 10.613 15.801 C 9.605 16.809 8.297 17.500 6.500 17.500 ZM 13.145 12.000 C 13.679 12.947 14.179 13.764 14.801 14.387 C 15.480 15.066 16.296 15.500 17.500 15.500 C 19.433 15.500 21.000 13.933 21.000 12.000 C 21.000 10.067 19.433 8.500 17.500 8.500 C 16.296 8.500 15.480 8.934 14.801 9.613 C 14.179 10.236 13.679 11.053 13.145 12.000 Z"),
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
        return _infinityFill!!
    }

private var _infinityFill: ImageVector? = null
