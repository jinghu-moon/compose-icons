package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Barbell: ImageVector
    get() {
        if (_barbell != null) return _barbell!!
        _barbell = phosphorThinIcon(
            name = "Barbell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 248.000 124.000 L 236.000 124.000 L 236.000 88.000 C 236.000 81.373 230.627 76.000 224.000 76.000 L 204.000 76.000 L 204.000 64.000 C 204.000 57.373 198.627 52.000 192.000 52.000 L 168.000 52.000 C 161.373 52.000 156.000 57.373 156.000 64.000 L 156.000 124.000 L 100.000 124.000 L 100.000 64.000 C 100.000 57.373 94.627 52.000 88.000 52.000 L 64.000 52.000 C 57.373 52.000 52.000 57.373 52.000 64.000 L 52.000 76.000 L 32.000 76.000 C 25.373 76.000 20.000 81.373 20.000 88.000 L 20.000 124.000 L 8.000 124.000 C 5.791 124.000 4.000 125.791 4.000 128.000 C 4.000 130.209 5.791 132.000 8.000 132.000 L 20.000 132.000 L 20.000 168.000 C 20.000 174.627 25.373 180.000 32.000 180.000 L 52.000 180.000 L 52.000 192.000 C 52.000 198.627 57.373 204.000 64.000 204.000 L 88.000 204.000 C 94.627 204.000 100.000 198.627 100.000 192.000 L 100.000 132.000 L 156.000 132.000 L 156.000 192.000 C 156.000 198.627 161.373 204.000 168.000 204.000 L 192.000 204.000 C 198.627 204.000 204.000 198.627 204.000 192.000 L 204.000 180.000 L 224.000 180.000 C 230.627 180.000 236.000 174.627 236.000 168.000 L 236.000 132.000 L 248.000 132.000 C 250.209 132.000 252.000 130.209 252.000 128.000 C 252.000 125.791 250.209 124.000 248.000 124.000 ZM 32.000 172.000 C 29.791 172.000 28.000 170.209 28.000 168.000 L 28.000 88.000 C 28.000 85.791 29.791 84.000 32.000 84.000 L 52.000 84.000 L 52.000 172.000 ZM 92.000 192.000 C 92.000 194.209 90.209 196.000 88.000 196.000 L 64.000 196.000 C 61.791 196.000 60.000 194.209 60.000 192.000 L 60.000 64.000 C 60.000 61.791 61.791 60.000 64.000 60.000 L 88.000 60.000 C 90.209 60.000 92.000 61.791 92.000 64.000 ZM 196.000 192.000 C 196.000 194.209 194.209 196.000 192.000 196.000 L 168.000 196.000 C 165.791 196.000 164.000 194.209 164.000 192.000 L 164.000 64.000 C 164.000 61.791 165.791 60.000 168.000 60.000 L 192.000 60.000 C 194.209 60.000 196.000 61.791 196.000 64.000 ZM 228.000 168.000 C 228.000 170.209 226.209 172.000 224.000 172.000 L 204.000 172.000 L 204.000 84.000 L 224.000 84.000 C 226.209 84.000 228.000 85.791 228.000 88.000 Z"),
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
        return _barbell!!
    }

private var _barbell: ImageVector? = null
