package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Analyze: ImageVector
    get() {
        if (_analyze != null) return _analyze!!
        _analyze = tablerFilledIcon(
            name = "Analyze",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.990 12.862 C 5.364 15.561 7.251 17.808 9.844 18.644 C 12.437 19.480 15.281 18.758 17.161 16.786 C 17.074 16.584 17.021 16.369 17.005 16.149 L 17.000 16.000 L 17.005 15.850 C 17.066 15.036 17.615 14.342 18.393 14.094 C 19.170 13.846 20.020 14.096 20.540 14.724 C 21.060 15.353 21.147 16.234 20.758 16.952 C 20.370 17.669 19.585 18.079 18.774 17.987 C 16.403 20.611 12.727 21.623 9.347 20.584 C 5.967 19.544 3.496 16.640 3.010 13.137 C 2.953 12.600 3.332 12.115 3.867 12.040 C 4.402 11.966 4.899 12.330 4.990 12.862 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 12.000 8.000 C 14.183 8.000 15.963 9.750 15.999 11.933 C 16.036 14.116 14.315 15.925 12.133 15.998 C 9.951 16.071 8.114 14.380 8.005 12.200 L 8.000 12.000 L 8.005 11.800 C 8.112 9.671 9.869 8.000 12.000 8.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 13.142 3.090 C 17.211 3.615 20.425 6.798 20.990 10.862 C 21.049 11.400 20.670 11.887 20.134 11.961 C 19.598 12.036 19.100 11.671 19.010 11.138 C 18.569 7.967 16.060 5.483 12.885 5.074 C 10.644 4.782 8.398 5.576 6.837 7.210 C 7.152 7.940 7.005 8.786 6.462 9.367 C 5.920 9.948 5.085 10.153 4.336 9.889 C 3.586 9.624 3.064 8.942 3.006 8.149 L 3.000 8.000 L 3.005 7.850 C 3.046 7.309 3.305 6.807 3.723 6.460 C 4.140 6.114 4.681 5.952 5.221 6.012 C 7.222 3.797 10.182 2.705 13.142 3.090 Z"),
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
        return _analyze!!
    }

private var _analyze: ImageVector? = null
