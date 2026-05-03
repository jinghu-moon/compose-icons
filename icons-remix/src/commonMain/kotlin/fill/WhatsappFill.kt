package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WhatsappFill: ImageVector
    get() {
        if (_whatsappFill != null) return _whatsappFill!!
        _whatsappFill = remixIcon(
            name = "WhatsappFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.001 2.000 C 17.524 2.000 22.001 6.477 22.001 12.000 C 22.001 17.523 17.524 22.000 12.001 22.000 C 10.167 22.000 8.449 21.506 6.971 20.645 L 2.005 22.000 L 3.357 17.031 C 2.495 15.554 2.001 13.835 2.001 12.000 C 2.001 6.477 6.478 2.000 12.001 2.000 ZM 8.593 7.300 L 8.392 7.308 C 8.263 7.317 8.136 7.349 8.021 7.408 C 7.934 7.452 7.853 7.517 7.727 7.636 C 7.608 7.749 7.539 7.847 7.466 7.942 C 7.096 8.423 6.897 9.014 6.901 9.621 C 6.903 10.112 7.030 10.588 7.232 11.034 C 7.640 11.936 8.313 12.891 9.202 13.776 C 9.415 13.988 9.625 14.203 9.850 14.402 C 10.954 15.374 12.269 16.074 13.691 16.448 C 13.691 16.448 14.251 16.534 14.259 16.535 C 14.444 16.545 14.630 16.531 14.815 16.522 C 15.107 16.507 15.391 16.428 15.648 16.291 C 15.814 16.203 15.892 16.159 16.031 16.071 C 16.031 16.071 16.074 16.043 16.156 15.981 C 16.291 15.881 16.374 15.810 16.487 15.693 C 16.569 15.607 16.641 15.506 16.696 15.391 C 16.774 15.228 16.853 14.917 16.884 14.658 C 16.908 14.460 16.900 14.352 16.898 14.285 C 16.894 14.178 16.805 14.067 16.707 14.020 L 16.126 13.759 C 16.126 13.759 15.256 13.380 14.724 13.138 C 14.669 13.112 14.608 13.101 14.548 13.097 C 14.414 13.089 14.265 13.124 14.170 13.224 C 14.165 13.222 14.098 13.279 13.375 14.156 C 13.335 14.203 13.241 14.307 13.080 14.297 C 13.055 14.295 13.031 14.292 13.007 14.286 C 12.942 14.269 12.878 14.246 12.816 14.219 C 12.692 14.167 12.649 14.147 12.564 14.111 C 11.987 13.858 11.457 13.521 10.989 13.108 C 10.863 12.997 10.746 12.878 10.626 12.762 C 10.206 12.354 9.862 11.921 9.606 11.494 C 9.592 11.470 9.570 11.437 9.547 11.399 C 9.505 11.331 9.459 11.250 9.445 11.194 C 9.407 11.047 9.506 10.929 9.506 10.929 C 9.506 10.929 9.749 10.663 9.862 10.518 C 9.971 10.379 10.065 10.243 10.125 10.146 C 10.243 9.956 10.280 9.761 10.218 9.610 C 9.938 8.926 9.648 8.245 9.350 7.569 C 9.291 7.435 9.116 7.338 8.957 7.320 C 8.903 7.314 8.849 7.308 8.795 7.304 C 8.661 7.297 8.526 7.299 8.392 7.308 L 8.593 7.300 Z"),
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
        return _whatsappFill!!
    }

private var _whatsappFill: ImageVector? = null
