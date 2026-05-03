package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ZhihuFill: ImageVector
    get() {
        if (_zhihuFill != null) return _zhihuFill!!
        _zhihuFill = remixIcon(
            name = "ZhihuFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.373 18.896 L 14.826 18.897 L 15.304 20.534 L 17.909 18.897 L 20.979 18.897 L 20.979 5.395 L 13.373 5.395 L 13.373 18.896 ZM 14.919 6.860 L 19.434 6.860 L 19.434 17.431 L 17.702 17.431 L 15.972 18.518 L 15.657 17.434 L 14.919 17.431 L 14.919 6.861 L 14.919 6.860 ZM 12.090 11.573 L 8.846 11.573 C 8.954 9.891 8.982 8.371 8.982 7.013 L 12.154 7.013 C 12.154 7.013 12.276 5.613 11.622 5.629 L 6.135 5.629 C 6.352 4.815 6.623 3.974 6.949 3.105 C 6.949 3.105 5.456 3.105 4.948 4.444 C 4.738 4.996 4.129 7.121 3.045 9.292 C 3.410 9.252 4.618 9.219 5.329 7.914 C 5.460 7.548 5.485 7.500 5.647 7.012 L 7.437 7.012 C 7.437 7.663 7.363 11.163 7.332 11.570 L 4.092 11.570 C 3.364 11.570 3.128 13.036 3.128 13.036 L 7.193 13.036 C 6.921 16.131 5.456 18.739 2.801 20.800 C 4.071 21.163 5.337 20.743 5.963 20.186 C 5.963 20.186 7.388 18.889 8.169 15.888 L 11.514 19.918 C 11.514 19.918 12.005 18.250 11.438 17.437 C 10.967 16.883 9.698 15.385 9.157 14.842 L 8.250 15.562 C 8.520 14.694 8.683 13.852 8.738 13.038 L 12.560 13.038 C 12.560 13.038 12.555 11.572 12.090 11.572 L 12.090 11.573 Z"),
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
        return _zhihuFill!!
    }

private var _zhihuFill: ImageVector? = null
