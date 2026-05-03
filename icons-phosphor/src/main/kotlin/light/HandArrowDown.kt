package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandArrowDown: ImageVector
    get() {
        if (_handArrowDown != null) return _handArrowDown!!
        _handArrowDown = phosphorLightIcon(
            name = "HandArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 229.120 142.650 C 223.567 138.373 216.335 136.938 209.570 138.770 L 164.330 149.170 C 167.340 141.183 166.239 132.228 161.383 125.208 C 156.527 118.189 148.535 114.000 140.000 114.000 L 89.940 114.000 C 81.979 113.977 74.341 117.143 68.730 122.790 L 45.520 146.000 L 16.000 146.000 C 8.268 146.000 2.000 152.268 2.000 160.000 L 2.000 200.000 C 2.000 207.732 8.268 214.000 16.000 214.000 L 120.000 214.000 C 120.492 214.000 120.983 213.940 121.460 213.820 L 185.460 197.820 C 185.763 197.740 186.060 197.639 186.350 197.520 L 225.170 181.000 L 225.500 180.850 C 232.478 177.365 237.166 170.529 237.902 162.764 C 238.638 155.000 235.319 147.404 229.120 142.670 ZM 14.000 200.000 L 14.000 160.000 C 14.000 158.895 14.895 158.000 16.000 158.000 L 42.000 158.000 L 42.000 202.000 L 16.000 202.000 C 14.895 202.000 14.000 201.105 14.000 200.000 ZM 220.280 170.000 L 182.080 186.270 L 119.260 202.000 L 54.000 202.000 L 54.000 154.490 L 77.210 131.270 C 80.579 127.883 85.163 125.986 89.940 126.000 L 140.000 126.000 C 147.732 126.000 154.000 132.268 154.000 140.000 C 154.000 147.732 147.732 154.000 140.000 154.000 L 112.000 154.000 C 108.686 154.000 106.000 156.686 106.000 160.000 C 106.000 163.314 108.686 166.000 112.000 166.000 L 144.000 166.000 C 144.451 166.001 144.900 165.950 145.340 165.850 L 212.340 150.440 L 212.580 150.380 C 217.802 148.956 223.258 151.696 225.235 156.734 C 227.213 161.773 225.076 167.492 220.280 170.000 ZM 155.760 76.240 C 153.557 73.876 153.622 70.192 155.907 67.907 C 158.192 65.622 161.876 65.557 164.240 67.760 L 186.000 89.510 L 186.000 24.000 C 186.000 20.686 188.686 18.000 192.000 18.000 C 195.314 18.000 198.000 20.686 198.000 24.000 L 198.000 89.510 L 219.760 67.760 C 222.124 65.557 225.808 65.622 228.093 67.907 C 230.378 70.192 230.443 73.876 228.240 76.240 L 196.240 108.240 C 193.897 110.580 190.103 110.580 187.760 108.240 Z"),
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
        return _handArrowDown!!
    }

private var _handArrowDown: ImageVector? = null
