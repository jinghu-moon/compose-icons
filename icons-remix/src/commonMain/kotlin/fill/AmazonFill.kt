package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AmazonFill: ImageVector
    get() {
        if (_amazonFill != null) return _amazonFill!!
        _amazonFill = remixIcon(
            name = "AmazonFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.997 18.229 C 21.997 18.957 21.592 20.357 20.682 21.126 C 20.500 21.267 20.318 21.187 20.398 20.983 C 20.663 20.335 21.269 18.836 20.985 18.491 C 20.784 18.229 19.954 18.249 19.246 18.309 C 18.923 18.350 18.639 18.370 18.419 18.414 C 18.215 18.431 18.174 18.251 18.378 18.111 C 18.639 17.926 18.923 17.785 19.248 17.683 C 20.398 17.339 21.727 17.546 21.917 17.766 C 21.954 17.808 21.997 17.926 21.997 18.229 ZM 20.075 19.524 C 19.814 19.726 19.530 19.910 19.246 20.073 C 17.124 21.349 14.375 22.017 11.988 22.017 C 8.145 22.017 4.708 20.600 2.100 18.229 C 1.876 18.047 2.061 17.783 2.323 17.926 C 5.132 19.566 8.611 20.558 12.211 20.558 C 14.477 20.558 16.920 20.134 19.246 19.222 C 19.409 19.161 19.591 19.078 19.750 19.021 C 20.117 18.855 20.440 19.263 20.075 19.524 ZM 13.905 8.495 C 13.906 7.453 13.947 6.840 13.602 6.314 C 13.295 5.881 12.769 5.621 12.033 5.662 C 11.235 5.706 10.378 6.229 10.160 7.188 C 10.117 7.407 9.989 7.623 9.723 7.671 L 7.288 7.362 C 7.114 7.320 6.849 7.188 6.936 6.840 C 7.459 4.088 9.811 3.129 12.033 3.000 L 12.556 3.000 C 13.776 3.000 15.344 3.349 16.347 4.264 C 17.564 5.400 17.434 6.926 17.434 8.585 L 17.434 12.511 C 17.434 13.689 17.912 14.211 18.392 14.825 C 18.522 15.044 18.567 15.302 18.348 15.480 C 17.867 15.915 16.954 16.699 16.431 17.134 C 16.257 17.267 15.942 17.281 15.821 17.179 C 15.051 16.534 14.863 16.176 14.386 15.521 C 13.557 16.392 12.859 16.873 12.030 17.134 C 11.507 17.267 10.943 17.350 10.246 17.350 C 8.156 17.350 6.501 16.047 6.501 13.469 C 6.501 11.421 7.591 10.028 9.201 9.369 C 10.810 8.710 13.151 8.499 13.905 8.495 ZM 13.428 13.686 C 13.947 12.814 13.905 12.100 13.905 10.501 C 13.253 10.501 12.599 10.546 12.033 10.679 C 10.989 10.982 10.160 11.640 10.160 13.034 C 10.160 14.124 10.727 14.866 11.685 14.866 C 11.817 14.866 11.933 14.849 12.033 14.821 C 12.703 14.635 13.121 14.299 13.428 13.686 Z"),
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
        return _amazonFill!!
    }

private var _amazonFill: ImageVector? = null
