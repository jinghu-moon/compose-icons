package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Vault: ImageVector
    get() {
        if (_vault != null) return _vault!!
        _vault = phosphorBoldIcon(
            name = "Vault",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 36.000 L 40.000 36.000 C 28.954 36.000 20.000 44.954 20.000 56.000 L 20.000 192.000 C 20.000 203.046 28.954 212.000 40.000 212.000 L 52.000 212.000 L 52.000 224.000 C 52.000 230.627 57.373 236.000 64.000 236.000 C 70.627 236.000 76.000 230.627 76.000 224.000 L 76.000 212.000 L 180.000 212.000 L 180.000 224.000 C 180.000 230.627 185.373 236.000 192.000 236.000 C 198.627 236.000 204.000 230.627 204.000 224.000 L 204.000 212.000 L 216.000 212.000 C 227.046 212.000 236.000 203.046 236.000 192.000 L 236.000 56.000 C 236.000 44.954 227.046 36.000 216.000 36.000 ZM 44.000 188.000 L 44.000 60.000 L 212.000 60.000 L 212.000 112.000 L 190.320 112.000 C 184.331 90.873 163.681 77.396 141.930 80.419 C 120.180 83.442 103.988 102.040 103.988 124.000 C 103.988 145.960 120.180 164.558 141.930 167.581 C 163.681 170.604 184.331 157.127 190.320 136.000 L 212.000 136.000 L 212.000 188.000 ZM 168.000 124.000 C 168.000 135.046 159.046 144.000 148.000 144.000 C 136.954 144.000 128.000 135.046 128.000 124.000 C 128.000 112.954 136.954 104.000 148.000 104.000 C 159.046 104.000 168.000 112.954 168.000 124.000 Z"),
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
        return _vault!!
    }

private var _vault: ImageVector? = null
