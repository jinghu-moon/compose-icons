package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileTsx: ImageVector
    get() {
        if (_fileTsx != null) return _fileTsx!!
        _fileTsx = phosphorDuotoneIcon(
            name = "FileTsx",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 88.000 L 152.000 88.000 L 152.000 32.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 214.510 156.650 L 197.830 180.000 L 214.510 203.350 C 216.842 206.938 215.937 211.726 212.457 214.216 C 208.976 216.706 204.153 216.016 201.510 212.650 L 188.000 193.760 L 174.510 212.650 C 172.906 215.118 170.076 216.506 167.143 216.263 C 164.210 216.021 161.646 214.187 160.470 211.489 C 159.293 208.791 159.692 205.665 161.510 203.350 L 178.170 180.000 L 161.490 156.650 C 159.158 153.062 160.063 148.274 163.543 145.784 C 167.024 143.294 171.847 143.984 174.490 147.350 L 188.000 166.240 L 201.490 147.350 C 204.133 143.984 208.956 143.294 212.437 145.784 C 215.917 148.274 216.822 153.062 214.490 156.650 ZM 123.600 171.310 C 119.600 170.150 115.460 168.960 113.150 167.470 C 111.900 166.650 111.920 166.470 112.040 165.570 C 112.070 164.094 112.816 162.725 114.040 161.900 C 118.640 158.780 129.380 160.170 133.870 161.340 C 138.145 162.480 142.535 159.940 143.675 155.665 C 144.815 151.390 142.275 147.000 138.000 145.860 C 135.880 145.310 117.000 140.640 105.160 148.620 C 100.094 152.020 96.797 157.492 96.160 163.560 C 94.160 179.450 109.810 183.980 119.160 186.680 C 131.220 190.170 132.280 191.600 131.940 194.270 C 131.630 196.680 130.680 197.600 129.800 198.200 C 125.200 201.260 114.630 199.760 110.250 198.550 C 105.984 197.376 101.574 199.884 100.400 204.150 C 99.226 208.416 101.734 212.826 106.000 214.000 C 110.955 215.308 116.056 215.980 121.180 216.000 C 127.000 216.000 133.480 215.000 138.670 211.540 C 143.857 208.093 147.229 202.506 147.860 196.310 C 150.000 179.000 133.490 174.170 123.600 171.310 ZM 80.000 144.000 L 40.000 144.000 C 35.582 144.000 32.000 147.582 32.000 152.000 C 32.000 156.418 35.582 160.000 40.000 160.000 L 52.000 160.000 L 52.000 208.000 C 52.000 212.418 55.582 216.000 60.000 216.000 C 64.418 216.000 68.000 212.418 68.000 208.000 L 68.000 160.000 L 80.000 160.000 C 84.418 160.000 88.000 156.418 88.000 152.000 C 88.000 147.582 84.418 144.000 80.000 144.000 ZM 216.000 88.000 L 216.000 112.000 C 216.000 116.418 212.418 120.000 208.000 120.000 C 203.582 120.000 200.000 116.418 200.000 112.000 L 200.000 96.000 L 152.000 96.000 C 147.582 96.000 144.000 92.418 144.000 88.000 L 144.000 40.000 L 56.000 40.000 L 56.000 112.000 C 56.000 116.418 52.418 120.000 48.000 120.000 C 43.582 120.000 40.000 116.418 40.000 112.000 L 40.000 40.000 C 40.000 31.163 47.163 24.000 56.000 24.000 L 152.000 24.000 C 154.122 23.998 156.158 24.840 157.660 26.340 L 213.660 82.340 C 215.160 83.842 216.002 85.878 216.000 88.000 ZM 188.690 80.000 L 160.000 51.310 L 160.000 80.000 Z"),
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
        return _fileTsx!!
    }

private var _fileTsx: ImageVector? = null
