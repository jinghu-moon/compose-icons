package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandGrabbing: ImageVector
    get() {
        if (_handGrabbing != null) return _handGrabbing!!
        _handGrabbing = phosphorThinIcon(
            name = "HandGrabbing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 188.000 84.000 C 182.058 83.995 176.328 86.205 171.930 90.200 C 171.154 79.979 163.971 71.379 154.052 68.794 C 144.133 66.209 133.667 70.208 128.000 78.750 C 122.150 69.931 111.213 65.984 101.080 69.036 C 90.946 72.087 84.007 81.417 84.000 92.000 L 84.000 116.000 L 68.000 116.000 C 54.745 116.000 44.000 126.745 44.000 140.000 L 44.000 152.000 C 44.000 198.392 81.608 236.000 128.000 236.000 C 174.392 236.000 212.000 198.392 212.000 152.000 L 212.000 108.000 C 212.000 94.745 201.255 84.000 188.000 84.000 ZM 204.000 152.000 C 204.000 193.974 169.974 228.000 128.000 228.000 C 86.026 228.000 52.000 193.974 52.000 152.000 L 52.000 140.000 C 52.000 131.163 59.163 124.000 68.000 124.000 L 84.000 124.000 L 84.000 152.000 C 84.000 154.209 85.791 156.000 88.000 156.000 C 90.209 156.000 92.000 154.209 92.000 152.000 L 92.000 92.000 C 92.000 83.163 99.163 76.000 108.000 76.000 C 116.837 76.000 124.000 83.163 124.000 92.000 L 124.000 120.000 C 124.000 122.209 125.791 124.000 128.000 124.000 C 130.209 124.000 132.000 122.209 132.000 120.000 L 132.000 92.000 C 132.000 83.163 139.163 76.000 148.000 76.000 C 156.837 76.000 164.000 83.163 164.000 92.000 L 164.000 120.000 C 164.000 122.209 165.791 124.000 168.000 124.000 C 170.209 124.000 172.000 122.209 172.000 120.000 L 172.000 108.000 C 172.000 99.163 179.163 92.000 188.000 92.000 C 196.837 92.000 204.000 99.163 204.000 108.000 Z"),
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
        return _handGrabbing!!
    }

private var _handGrabbing: ImageVector? = null
