package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Toolbox: ImageVector
    get() {
        if (_toolbox != null) return _toolbox!!
        _toolbox = phosphorThinIcon(
            name = "Toolbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 68.000 L 172.000 68.000 L 172.000 56.000 C 172.000 44.954 163.046 36.000 152.000 36.000 L 104.000 36.000 C 92.954 36.000 84.000 44.954 84.000 56.000 L 84.000 68.000 L 32.000 68.000 C 25.373 68.000 20.000 73.373 20.000 80.000 L 20.000 192.000 C 20.000 198.627 25.373 204.000 32.000 204.000 L 224.000 204.000 C 230.627 204.000 236.000 198.627 236.000 192.000 L 236.000 80.000 C 236.000 73.373 230.627 68.000 224.000 68.000 ZM 92.000 56.000 C 92.000 49.373 97.373 44.000 104.000 44.000 L 152.000 44.000 C 158.627 44.000 164.000 49.373 164.000 56.000 L 164.000 68.000 L 92.000 68.000 ZM 32.000 76.000 L 224.000 76.000 C 226.209 76.000 228.000 77.791 228.000 80.000 L 228.000 116.000 L 188.000 116.000 L 188.000 104.000 C 188.000 101.791 186.209 100.000 184.000 100.000 C 181.791 100.000 180.000 101.791 180.000 104.000 L 180.000 116.000 L 76.000 116.000 L 76.000 104.000 C 76.000 101.791 74.209 100.000 72.000 100.000 C 69.791 100.000 68.000 101.791 68.000 104.000 L 68.000 116.000 L 28.000 116.000 L 28.000 80.000 C 28.000 77.791 29.791 76.000 32.000 76.000 ZM 224.000 196.000 L 32.000 196.000 C 29.791 196.000 28.000 194.209 28.000 192.000 L 28.000 124.000 L 68.000 124.000 L 68.000 136.000 C 68.000 138.209 69.791 140.000 72.000 140.000 C 74.209 140.000 76.000 138.209 76.000 136.000 L 76.000 124.000 L 180.000 124.000 L 180.000 136.000 C 180.000 138.209 181.791 140.000 184.000 140.000 C 186.209 140.000 188.000 138.209 188.000 136.000 L 188.000 124.000 L 228.000 124.000 L 228.000 192.000 C 228.000 194.209 226.209 196.000 224.000 196.000 Z"),
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
        return _toolbox!!
    }

private var _toolbox: ImageVector? = null
