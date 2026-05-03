package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Scooter: ImageVector
    get() {
        if (_scooter != null) return _scooter!!
        _scooter = phosphorThinIcon(
            name = "Scooter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.000 140.000 C 209.904 139.997 207.814 140.205 205.760 140.620 L 171.760 38.740 C 171.221 37.117 169.710 36.016 168.000 36.000 L 136.000 36.000 C 133.791 36.000 132.000 37.791 132.000 40.000 C 132.000 42.209 133.791 44.000 136.000 44.000 L 165.120 44.000 L 184.120 101.140 L 126.120 172.000 L 76.000 172.000 C 75.967 155.111 62.815 141.155 45.957 140.122 C 29.100 139.089 14.342 151.335 12.247 168.093 C 10.152 184.852 21.442 200.353 38.035 203.502 C 54.628 206.650 70.811 196.361 75.000 180.000 L 128.000 180.000 C 129.197 180.000 130.330 179.464 131.090 178.540 L 187.150 110.110 L 198.150 143.110 C 183.442 150.116 176.345 167.053 181.666 182.451 C 186.987 197.849 203.027 206.792 218.922 203.222 C 234.818 199.653 245.494 184.711 243.721 168.517 C 241.948 152.322 228.291 140.045 212.000 140.000 ZM 44.000 196.000 C 30.745 196.000 20.000 185.255 20.000 172.000 C 20.000 158.745 30.745 148.000 44.000 148.000 C 57.255 148.000 68.000 158.745 68.000 172.000 C 68.000 185.255 57.255 196.000 44.000 196.000 ZM 212.000 196.000 C 198.745 196.000 188.000 185.255 188.000 172.000 C 188.000 158.745 198.745 148.000 212.000 148.000 C 225.255 148.000 236.000 158.745 236.000 172.000 C 236.000 185.255 225.255 196.000 212.000 196.000 Z"),
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
        return _scooter!!
    }

private var _scooter: ImageVector? = null
