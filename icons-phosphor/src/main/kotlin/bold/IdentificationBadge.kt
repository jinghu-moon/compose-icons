package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.IdentificationBadge: ImageVector
    get() {
        if (_identificationBadge != null) return _identificationBadge!!
        _identificationBadge = phosphorBoldIcon(
            name = "IdentificationBadge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 20.000 L 56.000 20.000 C 44.954 20.000 36.000 28.954 36.000 40.000 L 36.000 216.000 C 36.000 227.046 44.954 236.000 56.000 236.000 L 200.000 236.000 C 211.046 236.000 220.000 227.046 220.000 216.000 L 220.000 40.000 C 220.000 28.954 211.046 20.000 200.000 20.000 ZM 196.000 212.000 L 60.000 212.000 L 60.000 44.000 L 196.000 44.000 ZM 84.000 68.000 C 84.000 61.373 89.373 56.000 96.000 56.000 L 160.000 56.000 C 166.627 56.000 172.000 61.373 172.000 68.000 C 172.000 74.627 166.627 80.000 160.000 80.000 L 96.000 80.000 C 89.373 80.000 84.000 74.627 84.000 68.000 ZM 92.800 195.370 C 101.883 185.572 114.639 180.004 128.000 180.004 C 141.361 180.004 154.117 185.572 163.200 195.370 C 167.707 200.230 175.300 200.517 180.160 196.010 C 185.020 191.503 185.307 183.910 180.800 179.050 C 175.270 173.109 168.775 168.146 161.590 164.370 C 176.670 146.541 175.195 120.037 158.231 103.991 C 141.267 87.944 114.723 87.944 97.759 103.991 C 80.795 120.037 79.320 146.541 94.400 164.370 C 87.220 168.148 80.729 173.111 75.200 179.050 C 70.693 183.910 70.980 191.503 75.840 196.010 C 80.700 200.517 88.293 200.230 92.800 195.370 ZM 128.000 116.000 C 139.046 116.000 148.000 124.954 148.000 136.000 C 148.000 147.046 139.046 156.000 128.000 156.000 C 116.954 156.000 108.000 147.046 108.000 136.000 C 108.000 124.954 116.954 116.000 128.000 116.000 Z"),
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
        return _identificationBadge!!
    }

private var _identificationBadge: ImageVector? = null
