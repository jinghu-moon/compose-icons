package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LampPendant: ImageVector
    get() {
        if (_lampPendant != null) return _lampPendant!!
        _lampPendant = phosphorBoldIcon(
            name = "LampPendant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 180.000 72.280 L 180.000 72.000 C 180.000 60.954 171.046 52.000 160.000 52.000 L 140.000 52.000 L 140.000 16.000 C 140.000 9.373 134.627 4.000 128.000 4.000 C 121.373 4.000 116.000 9.373 116.000 16.000 L 116.000 52.000 L 96.000 52.000 C 84.954 52.000 76.000 60.954 76.000 72.000 L 76.000 72.280 C 36.710 91.904 11.919 132.082 12.000 176.000 C 12.000 182.627 17.373 188.000 24.000 188.000 L 84.190 188.000 C 86.299 210.620 105.282 227.915 128.000 227.915 C 150.718 227.915 169.701 210.620 171.810 188.000 L 232.000 188.000 C 238.627 188.000 244.000 182.627 244.000 176.000 C 244.081 132.082 219.290 91.904 180.000 72.280 ZM 128.000 204.000 C 118.495 204.002 110.301 197.313 108.400 188.000 L 147.600 188.000 C 145.699 197.313 137.505 204.002 128.000 204.000 ZM 36.780 164.000 C 41.002 131.445 62.296 103.626 92.620 91.050 C 97.081 89.189 99.990 84.833 100.000 80.000 L 100.000 76.000 L 156.000 76.000 L 156.000 80.000 C 155.998 84.844 158.909 89.215 163.380 91.080 C 193.718 103.665 215.015 131.506 219.220 164.080 Z"),
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
        return _lampPendant!!
    }

private var _lampPendant: ImageVector? = null
