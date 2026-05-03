package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PlanetFill: ImageVector
    get() {
        if (_planetFill != null) return _planetFill!!
        _planetFill = remixIcon(
            name = "PlanetFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.322 5.966 C 5.424 5.854 5.528 5.744 5.636 5.636 C 6.119 5.153 6.644 4.736 7.199 4.385 C 6.885 4.299 6.603 4.247 6.355 4.229 C 5.783 4.186 5.532 4.322 5.426 4.428 C 5.319 4.535 5.183 4.786 5.226 5.358 C 5.240 5.542 5.272 5.745 5.322 5.966 ZM 20.726 14.211 C 20.787 14.334 20.846 14.456 20.903 14.577 C 21.379 15.598 21.694 16.594 21.762 17.490 C 21.829 18.382 21.656 19.311 20.982 19.985 C 20.308 20.659 19.379 20.832 18.487 20.765 C 17.707 20.706 16.850 20.459 15.967 20.081 L 15.964 20.083 C 15.811 20.017 15.657 19.948 15.502 19.875 C 13.469 18.912 11.144 17.221 8.960 15.037 C 6.779 12.856 5.088 10.532 4.125 8.501 C 4.052 8.346 3.982 8.191 3.916 8.038 L 3.917 8.036 C 3.538 7.151 3.291 6.291 3.232 5.509 C 3.164 4.617 3.337 3.688 4.011 3.014 C 4.685 2.340 5.614 2.167 6.506 2.234 C 7.402 2.302 8.398 2.617 9.419 3.093 C 9.543 3.151 9.667 3.211 9.792 3.274 C 12.762 2.525 16.040 3.312 18.364 5.636 C 20.688 7.960 21.476 11.240 20.726 14.211 ZM 19.613 16.804 C 19.263 17.358 18.847 17.881 18.364 18.364 C 18.257 18.471 18.148 18.575 18.037 18.675 C 18.255 18.725 18.456 18.757 18.638 18.770 C 19.210 18.813 19.461 18.677 19.568 18.571 C 19.675 18.464 19.810 18.213 19.767 17.641 C 19.749 17.395 19.698 17.115 19.613 16.804 ZM 5.636 18.364 C 3.372 16.100 2.567 12.931 3.219 10.022 C 4.301 12.003 5.924 14.122 7.899 16.098 C 9.876 18.075 11.997 19.698 13.979 20.781 C 11.071 21.434 7.900 20.628 5.636 18.364 Z"),
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
        return _planetFill!!
    }

private var _planetFill: ImageVector? = null
