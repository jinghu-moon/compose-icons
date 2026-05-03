package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Biohazard: ImageVector
    get() {
        if (_biohazard != null) return _biohazard!!
        _biohazard = tablerFilledIcon(
            name = "Biohazard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.410 2.072 C 18.082 3.743 18.668 6.215 17.924 8.459 L 17.873 8.596 L 18.096 8.640 Q 18.421 8.712 18.741 8.820 L 19.059 8.937 L 19.309 9.042 C 21.464 10.012 22.881 12.109 22.990 14.525 L 22.990 14.742 C 22.989 15.570 22.317 16.241 21.489 16.240 C 20.660 16.240 19.989 15.567 19.990 14.739 L 19.992 14.594 C 19.944 13.551 19.398 12.594 18.524 12.022 C 17.650 11.450 16.555 11.334 15.580 11.708 L 15.489 11.745 L 15.493 11.783 L 15.500 12.000 C 15.500 13.278 14.804 14.455 13.683 15.070 L 13.523 15.152 L 13.537 15.262 C 13.619 15.773 13.822 16.259 14.132 16.678 L 14.272 16.853 C 14.843 17.524 15.663 17.934 16.542 17.989 L 16.745 17.995 C 17.573 17.995 18.245 18.667 18.245 19.495 C 18.245 20.323 17.573 20.995 16.745 20.995 C 15.010 20.995 13.352 20.274 12.170 19.004 L 11.993 18.805 L 11.915 18.897 C 10.899 20.033 9.506 20.763 7.994 20.951 L 7.721 20.979 L 7.462 20.995 L 7.245 20.995 C 6.417 20.994 5.746 20.322 5.747 19.493 C 5.747 18.665 6.420 17.994 7.248 17.995 L 7.393 17.997 C 8.965 17.925 10.260 16.737 10.467 15.177 L 10.470 15.147 L 10.309 15.064 C 9.250 14.479 8.568 13.389 8.505 12.181 L 8.500 11.986 L 8.506 11.795 L 8.509 11.752 L 8.434 11.720 C 7.663 11.417 6.805 11.420 6.036 11.728 L 5.845 11.812 C 4.715 12.352 3.995 13.493 3.995 14.745 C 3.995 15.573 3.323 16.245 2.495 16.245 C 1.667 16.245 0.995 15.573 0.995 14.745 C 0.995 11.762 3.104 9.194 6.031 8.615 L 6.108 8.601 L 6.058 8.458 L 5.978 8.198 L 5.912 7.948 C 5.432 5.929 5.982 3.803 7.382 2.270 L 7.545 2.098 C 7.913 1.701 8.466 1.533 8.992 1.658 C 9.518 1.783 9.937 2.182 10.087 2.702 C 10.237 3.222 10.095 3.782 9.716 4.168 L 9.579 4.311 C 8.977 4.977 8.677 5.862 8.750 6.756 C 8.823 7.651 9.263 8.475 9.965 9.034 L 10.049 9.096 L 10.099 9.062 C 10.600 8.737 11.176 8.546 11.772 8.507 L 12.000 8.500 C 12.683 8.500 13.336 8.697 13.894 9.056 L 13.942 9.089 L 14.009 9.041 C 14.546 8.616 14.935 8.032 15.120 7.372 L 15.170 7.172 C 15.385 6.165 15.111 5.116 14.430 4.344 L 14.289 4.194 C 13.899 3.818 13.742 3.260 13.879 2.735 C 14.016 2.211 14.426 1.801 14.950 1.664 C 15.474 1.526 16.032 1.682 16.409 2.072"),
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
        return _biohazard!!
    }

private var _biohazard: ImageVector? = null
