package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Certificate: ImageVector
    get() {
        if (_certificate != null) return _certificate!!
        _certificate = phosphorBoldIcon(
            name = "Certificate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 140.000 C 128.000 146.627 122.627 152.000 116.000 152.000 L 72.000 152.000 C 65.373 152.000 60.000 146.627 60.000 140.000 C 60.000 133.373 65.373 128.000 72.000 128.000 L 116.000 128.000 C 122.627 128.000 128.000 133.373 128.000 140.000 ZM 116.000 88.000 L 72.000 88.000 C 65.373 88.000 60.000 93.373 60.000 100.000 C 60.000 106.627 65.373 112.000 72.000 112.000 L 116.000 112.000 C 122.627 112.000 128.000 106.627 128.000 100.000 C 128.000 93.373 122.627 88.000 116.000 88.000 ZM 236.000 167.140 L 236.000 228.000 C 236.000 232.277 233.723 236.230 230.025 238.377 C 226.326 240.524 221.764 240.541 218.050 238.420 L 196.000 225.820 L 174.000 238.420 C 170.283 240.566 165.703 240.563 161.988 238.413 C 158.273 236.263 155.990 232.292 156.000 228.000 L 156.000 204.000 L 40.000 204.000 C 28.954 204.000 20.000 195.046 20.000 184.000 L 20.000 56.000 C 20.000 44.954 28.954 36.000 40.000 36.000 L 216.000 36.000 C 227.046 36.000 236.000 44.954 236.000 56.000 L 236.000 88.860 C 257.335 110.592 257.335 145.408 236.000 167.140 ZM 196.000 160.000 C 213.673 160.000 228.000 145.673 228.000 128.000 C 228.000 110.327 213.673 96.000 196.000 96.000 C 178.327 96.000 164.000 110.327 164.000 128.000 C 164.000 145.673 178.327 160.000 196.000 160.000 ZM 156.000 180.000 L 156.000 167.140 C 138.195 148.894 134.961 120.924 148.133 99.096 C 161.305 77.268 187.558 67.092 212.000 74.340 L 212.000 60.000 L 44.000 60.000 L 44.000 180.000 ZM 212.000 207.320 L 212.000 181.660 C 201.561 184.780 190.439 184.780 180.000 181.660 L 180.000 207.320 L 190.050 201.580 C 193.737 199.475 198.263 199.475 201.950 201.580 Z"),
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
