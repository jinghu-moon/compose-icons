package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Vault: ImageVector
    get() {
        if (_vault != null) return _vault!!
        _vault = phosphorFillIcon(
            name = "Vault",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 192.000 C 24.000 200.837 31.163 208.000 40.000 208.000 L 56.000 208.000 L 56.000 224.000 C 56.000 228.418 59.582 232.000 64.000 232.000 C 68.418 232.000 72.000 228.418 72.000 224.000 L 72.000 208.000 L 184.000 208.000 L 184.000 224.000 C 184.000 228.418 187.582 232.000 192.000 232.000 C 196.418 232.000 200.000 228.418 200.000 224.000 L 200.000 208.000 L 216.000 208.000 C 224.837 208.000 232.000 200.837 232.000 192.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 208.000 136.000 L 179.090 136.000 C 175.018 153.866 158.175 165.823 139.965 163.774 C 121.755 161.725 107.990 146.325 107.990 128.000 C 107.990 109.675 121.755 94.275 139.965 92.226 C 158.175 90.177 175.018 102.134 179.090 120.000 L 208.000 120.000 C 212.418 120.000 216.000 123.582 216.000 128.000 C 216.000 132.418 212.418 136.000 208.000 136.000 ZM 164.000 128.000 C 164.000 139.046 155.046 148.000 144.000 148.000 C 132.954 148.000 124.000 139.046 124.000 128.000 C 124.000 116.954 132.954 108.000 144.000 108.000 C 155.046 108.000 164.000 116.954 164.000 128.000 Z"),
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
