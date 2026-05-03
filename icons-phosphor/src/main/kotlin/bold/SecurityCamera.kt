package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SecurityCamera: ImageVector
    get() {
        if (_securityCamera != null) return _securityCamera!!
        _securityCamera = phosphorBoldIcon(
            name = "SecurityCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 244.000 132.000 C 237.373 132.000 232.000 137.373 232.000 144.000 L 232.000 156.000 L 197.000 156.000 L 182.650 141.660 L 230.170 94.140 C 237.978 86.330 237.978 73.670 230.170 65.860 L 174.170 9.860 C 170.418 6.098 165.323 3.984 160.010 3.984 C 154.697 3.984 149.602 6.098 145.850 9.860 L 6.420 150.470 C 0.144 156.767 -1.725 166.224 1.684 174.435 C 5.093 182.646 13.109 187.999 22.000 188.000 L 55.700 188.000 L 81.840 214.140 C 85.591 217.892 90.679 220.001 95.985 220.001 C 101.291 220.001 106.379 217.892 110.130 214.140 L 165.640 158.630 L 181.160 174.140 C 184.904 177.907 190.000 180.017 195.310 180.000 L 232.000 180.000 L 232.000 192.000 C 232.000 198.627 237.373 204.000 244.000 204.000 C 250.627 204.000 256.000 198.627 256.000 192.000 L 256.000 144.000 C 256.000 137.373 250.627 132.000 244.000 132.000 ZM 160.000 29.670 L 175.000 44.670 L 55.710 164.000 L 26.810 164.000 ZM 96.000 194.340 L 77.650 176.000 L 192.000 61.660 L 210.340 80.000 L 157.170 133.170 L 157.170 133.170 Z"),
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
        return _securityCamera!!
    }

private var _securityCamera: ImageVector? = null
