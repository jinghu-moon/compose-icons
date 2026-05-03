package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandDribbble: ImageVector
    get() {
        if (_brandDribbble != null) return _brandDribbble!!
        _brandDribbble = tablerFilledIcon(
            name = "BrandDribbble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.384 14.380 C 14.912 15.958 15.266 17.588 15.440 19.243 L 15.504 19.887 L 15.630 21.318 C 12.602 22.497 9.190 22.132 6.480 20.338 L 8.560 18.251 L 8.806 18.011 C 10.599 16.283 12.216 15.136 14.193 14.445 L 14.384 14.380 ZM 20.474 13.597 L 20.888 13.600 L 21.869 13.614 C 21.422 16.351 19.857 18.779 17.550 20.318 L 17.496 19.713 C 17.316 17.656 16.946 15.755 16.333 13.899 C 17.377 13.717 18.536 13.621 19.862 13.601 L 20.473 13.597 ZM 12.605 10.416 C 12.988 11.098 13.339 11.799 13.657 12.514 C 11.381 13.284 9.515 14.567 7.513 16.481 L 7.158 16.825 L 4.922 19.065 C 3.130 17.269 2.087 14.860 2.005 12.324 L 2.000 12.000 L 2.004 11.750 L 3.100 11.750 L 3.567 11.748 C 7.114 11.722 9.923 11.381 12.505 10.453 L 12.605 10.416 ZM 21.993 11.618 L 20.478 11.598 C 18.618 11.595 17.028 11.722 15.613 12.000 C 15.266 11.188 14.878 10.393 14.450 9.620 C 15.843 8.925 17.207 8.023 18.629 6.870 L 19.057 6.516 L 19.873 5.834 C 21.091 7.390 21.822 9.272 21.971 11.243 L 21.993 11.618 ZM 7.330 3.158 L 8.596 4.680 C 9.741 6.078 10.717 7.393 11.545 8.665 C 9.285 9.431 6.806 9.717 3.662 9.746 L 3.100 9.750 L 2.256 9.750 C 2.910 6.920 4.761 4.513 7.330 3.157 ZM 17.000 3.340 C 17.530 3.646 18.026 3.997 18.483 4.386 L 17.458 5.243 C 16.079 6.371 14.770 7.236 13.424 7.892 C 12.534 6.494 11.481 5.056 10.242 3.534 L 9.768 2.960 L 9.283 2.376 C 11.880 1.643 14.663 1.991 17.000 3.340 Z"),
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
        return _brandDribbble!!
    }

private var _brandDribbble: ImageVector? = null
