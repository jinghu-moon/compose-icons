package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ShareFat: ImageVector
    get() {
        if (_shareFat != null) return _shareFat!!
        _shareFat = phosphorFillIcon(
            name = "ShareFat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 237.660 117.660 L 157.660 197.660 C 155.372 199.951 151.929 200.636 148.938 199.397 C 145.947 198.158 143.997 195.238 144.000 192.000 L 144.000 152.230 C 86.900 155.470 47.750 192.500 36.760 204.230 L 36.760 204.230 C 33.220 208.010 27.655 209.093 22.957 206.916 C 18.258 204.740 15.485 199.794 16.080 194.650 C 19.790 162.390 37.460 131.360 65.840 107.280 C 89.410 87.280 118.060 74.590 144.000 72.370 L 144.000 32.000 C 143.997 28.762 145.947 25.842 148.938 24.603 C 151.929 23.364 155.372 24.049 157.660 26.340 L 237.660 106.340 C 239.162 107.841 240.006 109.877 240.006 112.000 C 240.006 114.123 239.162 116.159 237.660 117.660 Z"),
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
        return _shareFat!!
    }

private var _shareFat: ImageVector? = null
