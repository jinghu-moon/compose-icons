package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TennisBall: ImageVector
    get() {
        if (_tennisBall != null) return _tennisBall!!
        _tennisBall = phosphorLightIcon(
            name = "TennisBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.160 55.880 C 170.989 26.705 127.116 17.976 89.000 33.763 C 50.883 49.550 26.030 86.744 26.030 128.000 C 26.030 169.256 50.883 206.450 89.000 222.237 C 127.116 238.024 170.989 229.295 200.160 200.120 C 219.434 181.071 230.281 155.099 230.281 128.000 C 230.281 100.901 219.434 74.929 200.160 55.880 ZM 64.330 64.360 C 79.636 49.038 99.974 39.777 121.580 38.290 C 120.090 59.885 110.808 80.205 95.460 95.470 C 80.182 110.816 59.853 120.094 38.250 121.580 C 39.746 99.982 49.010 79.657 64.330 64.360 ZM 38.200 133.630 C 63.026 132.160 86.444 121.614 104.000 104.000 C 121.624 86.479 132.188 63.087 133.680 38.280 C 178.967 41.021 215.087 77.125 217.850 122.410 C 166.549 125.619 125.651 166.500 122.420 217.800 C 77.100 215.081 40.946 178.949 38.200 133.630 ZM 191.670 191.630 C 176.362 206.948 156.025 216.205 134.420 217.690 C 137.620 173.069 173.127 137.583 217.750 134.410 C 216.256 156.011 206.992 176.341 191.670 191.640 Z"),
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
        return _tennisBall!!
    }

private var _tennisBall: ImageVector? = null
