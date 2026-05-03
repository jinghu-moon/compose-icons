package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Shuffle: ImageVector
    get() {
        if (_shuffle != null) return _shuffle!!
        _shuffle = phosphorLightIcon(
            name = "Shuffle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.240 179.760 C 238.580 182.103 238.580 185.897 236.240 188.240 L 212.240 212.240 C 209.876 214.443 206.192 214.378 203.907 212.093 C 201.622 209.808 201.557 206.124 203.760 203.760 L 217.520 190.000 L 200.940 190.000 C 178.327 189.987 157.106 179.075 143.940 160.690 L 102.230 102.290 C 91.336 87.069 73.778 78.027 55.060 78.000 L 32.000 78.000 C 28.686 78.000 26.000 75.314 26.000 72.000 C 26.000 68.686 28.686 66.000 32.000 66.000 L 55.060 66.000 C 77.673 66.013 98.894 76.925 112.060 95.310 L 153.770 153.710 C 164.664 168.931 182.222 177.973 200.940 178.000 L 217.520 178.000 L 203.760 164.240 C 201.557 161.876 201.622 158.192 203.907 155.907 C 206.192 153.622 209.876 153.557 212.240 155.760 ZM 144.180 105.350 C 145.192 106.082 146.411 106.474 147.660 106.470 C 149.600 106.473 151.422 105.538 152.550 103.960 L 153.740 102.290 C 164.640 87.060 182.212 78.018 200.940 78.000 L 217.520 78.000 L 203.760 91.760 C 202.155 93.256 201.494 95.508 202.037 97.634 C 202.580 99.760 204.240 101.420 206.366 101.963 C 208.492 102.506 210.744 101.845 212.240 100.240 L 236.240 76.240 C 238.580 73.897 238.580 70.103 236.240 67.760 L 212.240 43.760 C 209.876 41.557 206.192 41.622 203.907 43.907 C 201.622 46.192 201.557 49.876 203.760 52.240 L 217.520 66.000 L 200.940 66.000 C 178.327 66.013 157.106 76.925 143.940 95.310 L 142.780 97.000 C 140.868 99.694 141.494 103.427 144.180 105.350 ZM 111.820 150.650 C 109.125 148.723 105.378 149.345 103.450 152.040 L 102.260 153.710 C 91.360 168.940 73.788 177.982 55.060 178.000 L 32.000 178.000 C 28.686 178.000 26.000 180.686 26.000 184.000 C 26.000 187.314 28.686 190.000 32.000 190.000 L 55.060 190.000 C 77.673 189.987 98.894 179.075 112.060 160.690 L 113.250 159.020 C 114.171 157.721 114.538 156.109 114.270 154.539 C 114.002 152.969 113.120 151.570 111.820 150.650 Z"),
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
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
