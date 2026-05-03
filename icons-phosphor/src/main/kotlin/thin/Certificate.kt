package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Certificate: ImageVector
    get() {
        if (_certificate != null) return _certificate!!
        _certificate = phosphorThinIcon(
            name = "Certificate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 124.000 136.000 C 124.000 138.209 122.209 140.000 120.000 140.000 L 72.000 140.000 C 69.791 140.000 68.000 138.209 68.000 136.000 C 68.000 133.791 69.791 132.000 72.000 132.000 L 120.000 132.000 C 122.209 132.000 124.000 133.791 124.000 136.000 ZM 120.000 100.000 L 72.000 100.000 C 69.791 100.000 68.000 101.791 68.000 104.000 C 68.000 106.209 69.791 108.000 72.000 108.000 L 120.000 108.000 C 122.209 108.000 124.000 106.209 124.000 104.000 C 124.000 101.791 122.209 100.000 120.000 100.000 ZM 228.000 159.740 L 228.000 224.000 C 228.002 225.430 227.241 226.753 226.003 227.469 C 224.765 228.184 223.239 228.185 222.000 227.470 L 196.000 212.610 L 170.000 227.470 C 168.761 228.185 167.235 228.184 165.997 227.469 C 164.759 226.753 163.998 225.430 164.000 224.000 L 164.000 196.000 L 40.000 196.000 C 33.373 196.000 28.000 190.627 28.000 184.000 L 28.000 56.000 C 28.000 49.373 33.373 44.000 40.000 44.000 L 216.000 44.000 C 222.627 44.000 228.000 49.373 228.000 56.000 L 228.000 88.260 C 238.179 97.351 243.999 110.352 243.999 124.000 C 243.999 137.648 238.179 150.648 228.000 159.740 ZM 196.000 84.000 C 173.909 84.000 156.000 101.909 156.000 124.000 C 156.000 146.091 173.909 164.000 196.000 164.000 C 218.091 164.000 236.000 146.091 236.000 124.000 C 236.000 101.909 218.091 84.000 196.000 84.000 ZM 164.000 188.000 L 164.000 159.740 C 145.832 143.302 142.960 115.820 157.336 95.981 C 171.712 76.142 198.722 70.314 220.000 82.460 L 220.000 56.000 C 220.000 53.791 218.209 52.000 216.000 52.000 L 40.000 52.000 C 37.791 52.000 36.000 53.791 36.000 56.000 L 36.000 184.000 C 36.000 186.209 37.791 188.000 40.000 188.000 ZM 220.000 165.540 C 205.159 174.154 186.841 174.154 172.000 165.540 L 172.000 217.110 L 194.000 204.530 C 195.238 203.815 196.762 203.815 198.000 204.530 L 220.000 217.110 Z"),
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
        return _certificate!!
    }

private var _certificate: ImageVector? = null
