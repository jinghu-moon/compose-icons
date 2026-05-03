package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Hurricane: ImageVector
    get() {
        if (_hurricane != null) return _hurricane!!
        _hurricane = phosphorThinIcon(
            name = "Hurricane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 100.000 C 112.536 100.000 100.000 112.536 100.000 128.000 C 100.000 143.464 112.536 156.000 128.000 156.000 C 143.464 156.000 156.000 143.464 156.000 128.000 C 156.000 112.536 143.464 100.000 128.000 100.000 ZM 128.000 148.000 C 116.954 148.000 108.000 139.046 108.000 128.000 C 108.000 116.954 116.954 108.000 128.000 108.000 C 139.046 108.000 148.000 116.954 148.000 128.000 C 148.000 139.046 139.046 148.000 128.000 148.000 ZM 153.490 47.940 L 163.870 9.000 C 164.229 7.654 163.861 6.218 162.900 5.210 C 161.939 4.201 160.522 3.766 159.160 4.060 C 138.840 9.052 119.477 17.342 101.840 28.600 C 64.000 53.000 44.000 87.320 44.000 128.000 C 44.016 164.571 67.671 196.938 102.510 208.060 L 92.130 247.000 C 91.771 248.346 92.139 249.782 93.100 250.790 C 94.061 251.799 95.478 252.234 96.840 251.940 C 117.161 246.947 136.525 238.654 154.160 227.390 C 192.000 203.000 212.000 168.680 212.000 128.000 C 211.984 91.429 188.329 59.062 153.490 47.940 ZM 150.000 220.510 C 134.972 230.028 118.684 237.390 101.610 242.380 L 111.220 206.380 C 111.494 205.354 111.349 204.260 110.817 203.341 C 110.284 202.422 109.407 201.752 108.380 201.480 C 75.121 192.571 51.995 162.431 52.000 128.000 C 52.000 89.710 70.160 58.590 106.000 35.490 C 121.028 25.972 137.316 18.610 154.390 13.620 L 144.780 49.620 C 144.506 50.646 144.651 51.740 145.183 52.659 C 145.716 53.578 146.593 54.248 147.620 54.520 C 180.879 63.429 204.005 93.569 204.000 128.000 C 204.000 166.290 185.840 197.410 150.000 220.510 Z"),
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
        return _hurricane!!
    }

private var _hurricane: ImageVector? = null
