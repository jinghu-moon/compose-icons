package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Hash: ImageVector
    get() {
        if (_hash != null) return _hash!!
        _hash = phosphorThinIcon(
            name = "Hash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 92.000 L 170.610 92.000 L 179.940 40.720 C 180.338 38.544 178.896 36.458 176.720 36.060 C 174.544 35.662 172.458 37.104 172.060 39.280 L 162.480 92.000 L 106.610 92.000 L 115.940 40.720 C 116.338 38.544 114.896 36.458 112.720 36.060 C 110.544 35.662 108.458 37.104 108.060 39.280 L 98.480 92.000 L 48.000 92.000 C 45.791 92.000 44.000 93.791 44.000 96.000 C 44.000 98.209 45.791 100.000 48.000 100.000 L 97.000 100.000 L 86.840 156.000 L 32.000 156.000 C 29.791 156.000 28.000 157.791 28.000 160.000 C 28.000 162.209 29.791 164.000 32.000 164.000 L 85.390 164.000 L 76.060 215.280 C 75.665 217.453 77.107 219.535 79.280 219.930 C 79.517 219.977 79.758 220.001 80.000 220.000 C 81.937 220.002 83.596 218.616 83.940 216.710 L 93.520 164.000 L 149.390 164.000 L 140.060 215.280 C 139.665 217.453 141.107 219.535 143.280 219.930 C 143.517 219.977 143.758 220.001 144.000 220.000 C 145.937 220.002 147.596 218.616 147.940 216.710 L 157.520 164.000 L 208.000 164.000 C 210.209 164.000 212.000 162.209 212.000 160.000 C 212.000 157.791 210.209 156.000 208.000 156.000 L 159.000 156.000 L 169.190 100.000 L 224.000 100.000 C 226.209 100.000 228.000 98.209 228.000 96.000 C 228.000 93.791 226.209 92.000 224.000 92.000 ZM 150.840 156.000 L 95.000 156.000 L 105.190 100.000 L 161.000 100.000 Z"),
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
        return _hash!!
    }

private var _hash: ImageVector? = null
