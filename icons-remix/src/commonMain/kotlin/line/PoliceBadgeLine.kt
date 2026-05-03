package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PoliceBadgeLine: ImageVector
    get() {
        if (_policeBadgeLine != null) return _policeBadgeLine!!
        _policeBadgeLine = remixIcon(
            name = "PoliceBadgeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.475 4.935 C 16.980 4.910 17.437 4.845 17.826 4.767 L 19.558 6.747 C 19.168 7.566 18.946 8.349 18.863 9.124 C 18.739 10.281 18.952 11.267 19.108 11.987 L 19.115 12.020 C 19.277 12.764 19.383 13.254 19.368 13.829 C 19.353 14.370 19.221 15.085 18.711 16.106 C 17.611 18.307 15.016 18.772 12.996 19.781 C 12.670 19.945 12.333 20.131 12.000 20.350 C 11.667 20.131 11.330 19.944 11.004 19.781 C 8.984 18.772 6.390 18.307 5.289 16.105 C 4.779 15.085 4.647 14.370 4.632 13.829 C 4.616 13.253 4.723 12.764 4.885 12.020 L 4.892 11.987 C 5.048 11.268 5.261 10.281 5.137 9.124 C 5.054 8.349 4.832 7.566 4.442 6.747 L 6.174 4.767 C 6.563 4.845 7.020 4.910 7.525 4.935 C 8.790 4.998 10.402 4.810 12.000 3.918 C 13.598 4.810 15.210 4.998 16.475 4.935 ZM 21.087 11.674 C 20.764 10.195 20.461 8.808 22.000 6.500 L 18.500 2.500 C 18.500 2.500 15.000 4.000 12.000 1.500 C 9.000 4.000 5.500 2.500 5.500 2.500 L 2.000 6.500 C 3.539 8.808 3.236 10.195 2.913 11.674 C 2.607 13.078 2.282 14.564 3.500 17.000 C 5.077 20.154 8.208 20.510 10.443 21.745 C 11.042 22.077 11.577 22.471 12.000 23.000 C 12.423 22.471 12.958 22.077 13.558 21.745 C 15.792 20.510 18.923 20.154 20.500 17.000 C 21.718 14.564 21.393 13.078 21.087 11.674 ZM 14.378 12.773 L 14.939 16.045 L 12.000 14.500 L 9.061 16.045 L 9.622 12.773 L 7.245 10.455 L 10.530 9.977 L 12.000 7.000 L 13.469 9.977 L 16.755 10.455 L 14.378 12.773 Z"),
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
        return _policeBadgeLine!!
    }

private var _policeBadgeLine: ImageVector? = null
