package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AncientGateLine: ImageVector
    get() {
        if (_ancientGateLine != null) return _ancientGateLine!!
        _ancientGateLine = remixIcon(
            name = "AncientGateLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.964 3.000 L 17.036 3.000 C 17.284 4.722 18.760 6.000 20.500 6.000 C 20.832 6.000 21.163 5.953 21.481 5.860 C 21.297 7.644 19.794 9.000 18.000 9.000 L 6.000 9.000 C 4.206 9.000 2.703 7.644 2.518 5.860 C 2.837 5.953 3.168 6.000 3.500 6.000 C 5.240 6.000 6.716 4.722 6.964 3.000 ZM 16.899 6.658 C 16.339 6.172 15.902 5.620 15.588 5.000 L 8.412 5.000 C 8.098 5.620 7.661 6.172 7.101 6.658 C 6.959 6.780 6.814 6.894 6.667 7.000 L 17.333 7.000 C 17.185 6.894 17.041 6.780 16.899 6.658 ZM 21.500 11.500 C 22.038 11.500 22.542 11.359 22.979 11.111 C 22.993 11.239 23.000 11.369 23.000 11.500 C 23.000 12.897 22.183 14.102 21.000 14.664 L 21.000 21.000 L 14.000 21.000 L 14.000 19.000 C 14.000 17.895 13.105 17.000 12.000 17.000 C 10.895 17.000 10.000 17.895 10.000 19.000 L 10.000 21.000 L 3.000 21.000 L 3.000 14.664 C 1.818 14.102 1.000 12.897 1.000 11.500 C 1.000 11.369 1.007 11.239 1.021 11.111 C 1.458 11.359 1.962 11.500 2.500 11.500 C 3.610 11.500 4.580 10.897 5.099 10.000 L 18.901 10.000 C 19.420 10.897 20.390 11.500 21.500 11.500 ZM 18.963 12.810 C 18.576 12.581 18.230 12.311 17.925 12.000 L 6.075 12.000 C 5.770 12.311 5.424 12.581 5.037 12.810 C 4.834 12.929 4.627 13.033 4.415 13.122 L 5.000 13.400 L 5.000 19.000 L 8.000 19.000 C 8.000 17.895 8.391 16.953 9.172 16.172 C 9.953 15.391 10.895 15.000 12.000 15.000 C 13.105 15.000 14.047 15.391 14.828 16.172 C 15.609 16.953 16.000 17.895 16.000 19.000 L 19.000 19.000 L 19.000 13.400 L 19.585 13.122 C 19.373 13.033 19.166 12.929 18.963 12.810 Z"),
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
        return _ancientGateLine!!
    }

private var _ancientGateLine: ImageVector? = null
