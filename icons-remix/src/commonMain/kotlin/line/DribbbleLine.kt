package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DribbbleLine: ImageVector
    get() {
        if (_dribbbleLine != null) return _dribbbleLine!!
        _dribbbleLine = remixIcon(
            name = "DribbbleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.989 11.572 C 19.903 9.945 19.331 8.447 18.416 7.221 C 18.175 7.484 17.878 7.770 17.496 8.092 C 16.588 8.855 15.489 9.543 14.183 10.101 C 14.350 10.451 14.503 10.790 14.638 11.110 L 14.639 11.113 C 14.665 11.174 14.688 11.231 14.732 11.342 C 14.738 11.356 14.743 11.370 14.748 11.382 C 16.262 11.212 17.858 11.275 19.405 11.484 C 19.611 11.512 19.805 11.542 19.989 11.572 ZM 10.604 4.121 C 10.778 4.366 10.960 4.629 11.180 4.954 C 11.793 5.859 12.396 6.814 12.960 7.795 C 13.075 7.994 13.187 8.193 13.296 8.391 C 14.519 7.910 15.530 7.303 16.344 6.625 C 16.673 6.351 16.938 6.093 17.140 5.870 C 15.750 4.703 13.957 4.000 12.000 4.000 C 11.524 4.000 11.058 4.042 10.604 4.121 ZM 4.253 9.998 C 4.831 9.985 5.485 9.949 6.293 9.875 C 7.900 9.728 9.541 9.462 11.155 9.053 C 10.572 8.037 9.939 7.023 9.295 6.054 C 8.985 5.588 8.684 5.150 8.455 4.826 C 6.395 5.846 4.838 7.727 4.253 9.998 ZM 5.784 17.036 C 6.171 16.469 6.681 15.831 7.358 15.137 C 8.812 13.648 10.529 12.488 12.514 11.847 C 12.542 11.839 12.560 11.834 12.576 11.829 C 12.411 11.465 12.256 11.141 12.100 10.834 C 10.264 11.369 8.330 11.703 6.403 11.876 C 5.463 11.961 4.620 11.998 4.000 12.004 C 4.001 13.911 4.669 15.662 5.784 17.036 ZM 15.005 19.417 C 14.900 18.875 14.767 18.271 14.590 17.574 C 14.269 16.311 13.867 15.012 13.373 13.708 C 11.371 14.434 9.776 15.497 8.543 16.765 C 7.949 17.376 7.512 17.954 7.226 18.420 C 8.559 19.413 10.211 20.000 12.000 20.000 C 13.063 20.000 14.077 19.793 15.005 19.417 ZM 16.878 18.341 C 18.407 17.163 19.499 15.444 19.865 13.470 C 19.525 13.387 19.094 13.300 18.620 13.235 C 17.576 13.090 16.501 13.066 15.441 13.202 C 15.893 14.476 16.264 15.733 16.561 16.936 C 16.690 17.461 16.796 17.936 16.878 18.341 ZM 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 Z"),
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
        return _dribbbleLine!!
    }

private var _dribbbleLine: ImageVector? = null
