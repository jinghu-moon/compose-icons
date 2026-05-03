package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CloudLightning: ImageVector
    get() {
        if (_cloudLightning != null) return _cloudLightning!!
        _cloudLightning = phosphorThinIcon(
            name = "CloudLightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 156.000 20.000 C 124.918 20.002 97.327 39.899 87.510 69.390 C 69.516 64.963 50.581 71.289 38.862 85.642 C 27.142 99.996 24.731 119.813 32.668 136.558 C 40.604 153.303 57.470 163.984 76.000 164.000 L 120.940 164.000 L 100.570 197.940 C 99.828 199.176 99.808 200.716 100.518 201.970 C 101.228 203.225 102.558 204.000 104.000 204.000 L 136.940 204.000 L 116.570 237.940 C 115.432 239.834 116.046 242.292 117.940 243.430 C 119.834 244.568 122.292 243.954 123.430 242.060 L 147.430 202.060 C 148.172 200.824 148.192 199.284 147.482 198.030 C 146.772 196.775 145.442 196.000 144.000 196.000 L 111.060 196.000 L 130.260 164.000 L 156.000 164.000 C 195.764 164.000 228.000 131.764 228.000 92.000 C 228.000 52.235 195.764 20.000 156.000 20.000 ZM 156.000 156.000 L 76.000 156.000 C 60.577 155.988 46.535 147.110 39.910 133.183 C 33.284 119.255 35.256 102.760 44.978 90.787 C 54.700 78.813 70.439 73.496 85.430 77.120 C 84.687 80.629 84.209 84.189 84.000 87.770 C 83.873 89.979 85.561 91.873 87.770 92.000 C 89.979 92.127 91.873 90.439 92.000 88.230 C 94.021 53.398 123.546 26.588 158.411 27.927 C 193.276 29.266 220.658 58.261 220.001 93.146 C 219.344 128.030 190.891 155.974 156.000 156.000 Z"),
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
        return _cloudLightning!!
    }

private var _cloudLightning: ImageVector? = null
