package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Invoice: ImageVector
    get() {
        if (_invoice != null) return _invoice!!
        _invoice = phosphorThinIcon(
            name = "Invoice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 28.000 124.000 C 25.791 124.000 24.000 122.209 24.000 120.000 C 24.000 117.791 25.791 116.000 28.000 116.000 L 56.000 116.000 C 62.627 116.000 68.000 110.627 68.000 104.000 C 68.000 97.373 62.627 92.000 56.000 92.000 L 40.000 92.000 C 28.954 92.000 20.000 83.046 20.000 72.000 C 20.000 60.954 28.954 52.000 40.000 52.000 L 44.000 52.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 C 50.209 44.000 52.000 45.791 52.000 48.000 L 52.000 52.000 L 64.000 52.000 C 66.209 52.000 68.000 53.791 68.000 56.000 C 68.000 58.209 66.209 60.000 64.000 60.000 L 40.000 60.000 C 33.373 60.000 28.000 65.373 28.000 72.000 C 28.000 78.627 33.373 84.000 40.000 84.000 L 56.000 84.000 C 67.046 84.000 76.000 92.954 76.000 104.000 C 76.000 115.046 67.046 124.000 56.000 124.000 L 52.000 124.000 L 52.000 128.000 C 52.000 130.209 50.209 132.000 48.000 132.000 C 45.791 132.000 44.000 130.209 44.000 128.000 L 44.000 124.000 ZM 228.000 56.000 L 228.000 192.000 C 228.000 198.627 222.627 204.000 216.000 204.000 L 40.000 204.000 C 33.373 204.000 28.000 198.627 28.000 192.000 L 28.000 152.000 C 28.000 149.791 29.791 148.000 32.000 148.000 C 34.209 148.000 36.000 149.791 36.000 152.000 L 36.000 192.000 C 36.000 194.209 37.791 196.000 40.000 196.000 L 164.000 196.000 L 164.000 156.000 L 80.000 156.000 C 77.791 156.000 76.000 154.209 76.000 152.000 C 76.000 149.791 77.791 148.000 80.000 148.000 L 164.000 148.000 L 164.000 108.000 L 104.000 108.000 C 101.791 108.000 100.000 106.209 100.000 104.000 C 100.000 101.791 101.791 100.000 104.000 100.000 L 220.000 100.000 L 220.000 60.000 L 96.000 60.000 C 93.791 60.000 92.000 58.209 92.000 56.000 C 92.000 53.791 93.791 52.000 96.000 52.000 L 224.000 52.000 C 226.209 52.000 228.000 53.791 228.000 56.000 ZM 172.000 148.000 L 220.000 148.000 L 220.000 108.000 L 172.000 108.000 ZM 220.000 192.000 L 220.000 156.000 L 172.000 156.000 L 172.000 196.000 L 216.000 196.000 C 218.209 196.000 220.000 194.209 220.000 192.000 Z"),
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
        return _invoice!!
    }

private var _invoice: ImageVector? = null
