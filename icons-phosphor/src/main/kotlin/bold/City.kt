package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.City: ImageVector
    get() {
        if (_city != null) return _city!!
        _city = phosphorBoldIcon(
            name = "City",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 204.000 L 236.000 204.000 L 236.000 88.000 C 236.000 81.373 230.627 76.000 224.000 76.000 L 152.000 76.000 C 145.373 76.000 140.000 81.373 140.000 88.000 L 140.000 124.000 L 116.000 124.000 L 116.000 40.000 C 116.000 33.373 110.627 28.000 104.000 28.000 L 32.000 28.000 C 25.373 28.000 20.000 33.373 20.000 40.000 L 20.000 204.000 L 16.000 204.000 C 9.373 204.000 4.000 209.373 4.000 216.000 C 4.000 222.627 9.373 228.000 16.000 228.000 L 240.000 228.000 C 246.627 228.000 252.000 222.627 252.000 216.000 C 252.000 209.373 246.627 204.000 240.000 204.000 ZM 164.000 100.000 L 212.000 100.000 L 212.000 204.000 L 164.000 204.000 ZM 140.000 148.000 L 140.000 204.000 L 116.000 204.000 L 116.000 148.000 ZM 44.000 52.000 L 92.000 52.000 L 92.000 204.000 L 44.000 204.000 ZM 80.000 76.000 L 80.000 84.000 C 80.000 90.627 74.627 96.000 68.000 96.000 C 61.373 96.000 56.000 90.627 56.000 84.000 L 56.000 76.000 C 56.000 69.373 61.373 64.000 68.000 64.000 C 74.627 64.000 80.000 69.373 80.000 76.000 ZM 80.000 124.000 L 80.000 132.000 C 80.000 138.627 74.627 144.000 68.000 144.000 C 61.373 144.000 56.000 138.627 56.000 132.000 L 56.000 124.000 C 56.000 117.373 61.373 112.000 68.000 112.000 C 74.627 112.000 80.000 117.373 80.000 124.000 ZM 80.000 172.000 L 80.000 180.000 C 80.000 186.627 74.627 192.000 68.000 192.000 C 61.373 192.000 56.000 186.627 56.000 180.000 L 56.000 172.000 C 56.000 165.373 61.373 160.000 68.000 160.000 C 74.627 160.000 80.000 165.373 80.000 172.000 ZM 176.000 180.000 L 176.000 172.000 C 176.000 165.373 181.373 160.000 188.000 160.000 C 194.627 160.000 200.000 165.373 200.000 172.000 L 200.000 180.000 C 200.000 186.627 194.627 192.000 188.000 192.000 C 181.373 192.000 176.000 186.627 176.000 180.000 ZM 176.000 132.000 L 176.000 124.000 C 176.000 117.373 181.373 112.000 188.000 112.000 C 194.627 112.000 200.000 117.373 200.000 124.000 L 200.000 132.000 C 200.000 138.627 194.627 144.000 188.000 144.000 C 181.373 144.000 176.000 138.627 176.000 132.000 Z"),
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
        return _city!!
    }

private var _city: ImageVector? = null
