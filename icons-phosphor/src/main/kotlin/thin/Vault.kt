package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Vault: ImageVector
    get() {
        if (_vault != null) return _vault!!
        _vault = phosphorThinIcon(
            name = "Vault",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 44.000 L 40.000 44.000 C 33.373 44.000 28.000 49.373 28.000 56.000 L 28.000 192.000 C 28.000 198.627 33.373 204.000 40.000 204.000 L 60.000 204.000 L 60.000 224.000 C 60.000 226.209 61.791 228.000 64.000 228.000 C 66.209 228.000 68.000 226.209 68.000 224.000 L 68.000 204.000 L 188.000 204.000 L 188.000 224.000 C 188.000 226.209 189.791 228.000 192.000 228.000 C 194.209 228.000 196.000 226.209 196.000 224.000 L 196.000 204.000 L 216.000 204.000 C 222.627 204.000 228.000 198.627 228.000 192.000 L 228.000 56.000 C 228.000 49.373 222.627 44.000 216.000 44.000 ZM 216.000 196.000 L 40.000 196.000 C 37.791 196.000 36.000 194.209 36.000 192.000 L 36.000 56.000 C 36.000 53.791 37.791 52.000 40.000 52.000 L 216.000 52.000 C 218.209 52.000 220.000 53.791 220.000 56.000 L 220.000 124.000 L 195.810 124.000 C 193.672 100.575 173.488 82.975 149.990 84.046 C 126.492 85.116 107.992 104.478 107.992 128.000 C 107.992 151.522 126.492 170.884 149.990 171.954 C 173.488 173.025 193.672 155.425 195.810 132.000 L 220.000 132.000 L 220.000 192.000 C 220.000 194.209 218.209 196.000 216.000 196.000 ZM 163.300 124.000 C 161.352 118.490 155.717 115.185 149.957 116.173 C 144.197 117.161 139.986 122.156 139.986 128.000 C 139.986 133.844 144.197 138.839 149.957 139.827 C 155.717 140.815 161.352 137.510 163.300 132.000 L 187.770 132.000 C 185.647 150.986 169.064 165.007 149.990 163.944 C 130.915 162.881 115.993 147.104 115.993 128.000 C 115.993 108.896 130.915 93.119 149.990 92.056 C 169.064 90.993 185.647 105.014 187.770 124.000 Z"),
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
        return _vault!!
    }

private var _vault: ImageVector? = null
