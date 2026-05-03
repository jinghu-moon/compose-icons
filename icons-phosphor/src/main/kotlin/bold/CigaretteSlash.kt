package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CigaretteSlash: ImageVector
    get() {
        if (_cigaretteSlash != null) return _cigaretteSlash!!
        _cigaretteSlash = phosphorBoldIcon(
            name = "CigaretteSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 201.670 55.890 C 209.200 43.180 208.790 36.260 206.740 34.790 C 201.182 31.792 198.899 24.999 201.518 19.253 C 204.137 13.506 210.761 10.773 216.670 13.000 C 223.290 16.082 228.302 21.817 230.470 28.790 C 234.070 39.710 231.330 52.960 222.330 68.170 C 214.800 80.870 215.210 87.800 217.260 89.270 C 223.106 92.118 225.619 99.105 222.928 105.024 C 220.236 110.944 213.319 113.643 207.330 111.110 C 200.717 108.017 195.709 102.287 193.530 95.320 C 189.930 84.340 192.670 71.090 201.670 55.890 ZM 145.530 95.270 C 147.709 102.237 152.717 107.967 159.330 111.060 C 165.319 113.593 172.236 110.894 174.928 104.974 C 177.619 99.055 175.106 92.068 169.260 89.220 C 167.260 87.750 166.800 80.820 174.330 68.120 C 183.330 52.910 186.070 39.660 182.470 28.740 C 180.290 21.785 175.280 16.071 168.670 13.000 C 162.681 10.467 155.764 13.166 153.072 19.086 C 150.381 25.005 152.894 31.992 158.740 34.840 C 160.740 36.310 161.200 43.230 153.670 55.940 C 144.670 71.090 141.930 84.340 145.530 95.270 ZM 216.880 207.930 C 219.825 211.093 220.841 215.595 219.541 219.716 C 218.241 223.838 214.825 226.942 210.599 227.843 C 206.372 228.744 201.988 227.303 199.120 224.070 L 173.600 196.000 L 32.000 196.000 C 20.954 196.000 12.000 187.046 12.000 176.000 L 12.000 144.000 C 12.000 132.954 20.954 124.000 32.000 124.000 L 108.150 124.000 L 39.150 48.070 C 36.035 44.941 34.890 40.354 36.169 36.129 C 37.447 31.903 40.943 28.720 45.270 27.843 C 49.597 26.966 54.057 28.536 56.880 31.930 ZM 36.000 172.000 L 76.000 172.000 L 76.000 148.000 L 36.000 148.000 ZM 151.780 172.000 L 130.000 148.000 L 100.000 148.000 L 100.000 172.000 ZM 224.000 124.000 L 189.330 124.000 C 182.703 124.000 177.330 129.373 177.330 136.000 C 177.330 142.627 182.703 148.000 189.330 148.000 L 220.000 148.000 L 220.000 182.940 C 220.000 189.567 225.373 194.940 232.000 194.940 C 238.627 194.940 244.000 189.567 244.000 182.940 L 244.000 144.000 C 244.000 132.954 235.046 124.000 224.000 124.000 Z"),
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
        return _cigaretteSlash!!
    }

private var _cigaretteSlash: ImageVector? = null
