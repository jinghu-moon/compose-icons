package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CoreosFill: ImageVector
    get() {
        if (_coreosFill != null) return _coreosFill!!
        _coreosFill = remixIcon(
            name = "CoreosFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 ZM 8.329 12.304 C 8.289 13.155 8.366 14.002 8.447 14.848 C 8.452 14.909 8.474 14.922 8.527 14.929 C 8.933 14.982 9.340 15.030 9.749 15.056 C 10.713 15.116 11.677 15.194 12.645 15.140 C 13.194 15.109 13.745 15.092 14.292 15.045 C 15.073 14.977 15.852 14.889 16.622 14.733 C 17.581 14.539 18.530 14.308 19.424 13.888 C 19.829 13.698 20.214 13.473 20.537 13.152 C 20.774 12.917 20.945 12.644 20.947 12.293 C 20.949 11.979 20.933 11.665 20.902 11.352 C 20.828 10.606 20.675 9.877 20.420 9.172 C 19.837 7.554 18.912 6.183 17.596 5.103 C 16.458 4.168 15.175 3.540 13.744 3.239 C 13.245 3.134 12.738 3.095 12.230 3.059 C 11.657 3.018 11.166 3.180 10.742 3.573 C 10.247 4.030 9.905 4.597 9.620 5.206 C 8.953 6.633 8.647 8.160 8.454 9.714 C 8.348 10.571 8.288 11.435 8.329 12.304 ZM 11.899 7.274 C 12.858 7.305 13.669 7.598 14.393 8.130 C 15.288 8.788 15.863 9.658 16.107 10.742 C 16.175 11.046 16.204 11.354 16.210 11.664 C 16.215 11.873 16.101 12.026 15.948 12.154 C 15.641 12.412 15.277 12.555 14.898 12.661 C 14.157 12.869 13.402 12.988 12.633 13.028 C 12.133 13.054 11.633 13.063 11.133 13.038 C 10.941 13.028 10.748 13.014 10.556 13.006 C 10.496 13.004 10.476 12.986 10.472 12.925 C 10.449 12.491 10.415 12.057 10.422 11.623 C 10.438 10.597 10.516 9.578 10.819 8.589 C 10.920 8.260 11.042 7.940 11.240 7.653 C 11.412 7.403 11.618 7.216 11.899 7.274 Z"),
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
        return _coreosFill!!
    }

private var _coreosFill: ImageVector? = null
