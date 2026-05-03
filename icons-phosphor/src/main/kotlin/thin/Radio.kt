package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Radio: ImageVector
    get() {
        if (_radio != null) return _radio!!
        _radio = phosphorThinIcon(
            name = "Radio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 100.000 168.000 C 100.000 170.209 98.209 172.000 96.000 172.000 L 64.000 172.000 C 61.791 172.000 60.000 170.209 60.000 168.000 C 60.000 165.791 61.791 164.000 64.000 164.000 L 96.000 164.000 C 98.209 164.000 100.000 165.791 100.000 168.000 ZM 96.000 132.000 L 64.000 132.000 C 61.791 132.000 60.000 133.791 60.000 136.000 C 60.000 138.209 61.791 140.000 64.000 140.000 L 96.000 140.000 C 98.209 140.000 100.000 138.209 100.000 136.000 C 100.000 133.791 98.209 132.000 96.000 132.000 ZM 228.000 80.000 L 228.000 192.000 C 228.000 198.627 222.627 204.000 216.000 204.000 L 40.000 204.000 C 33.373 204.000 28.000 198.627 28.000 192.000 L 28.000 72.000 C 28.009 70.242 29.166 68.696 30.850 68.190 L 190.850 20.190 C 192.945 19.614 195.117 20.815 195.742 22.896 C 196.367 24.978 195.216 27.177 193.150 27.850 L 59.250 68.000 L 216.000 68.000 C 222.627 68.000 228.000 73.373 228.000 80.000 ZM 220.000 80.000 C 220.000 77.791 218.209 76.000 216.000 76.000 L 36.000 76.000 L 36.000 192.000 C 36.000 194.209 37.791 196.000 40.000 196.000 L 216.000 196.000 C 218.209 196.000 220.000 194.209 220.000 192.000 ZM 196.000 136.000 C 196.000 155.882 179.882 172.000 160.000 172.000 C 140.118 172.000 124.000 155.882 124.000 136.000 C 124.000 116.118 140.118 100.000 160.000 100.000 C 179.882 100.000 196.000 116.118 196.000 136.000 ZM 188.000 136.000 C 188.000 120.536 175.464 108.000 160.000 108.000 C 144.536 108.000 132.000 120.536 132.000 136.000 C 132.000 151.464 144.536 164.000 160.000 164.000 C 175.464 164.000 188.000 151.464 188.000 136.000 ZM 96.000 100.000 L 64.000 100.000 C 61.791 100.000 60.000 101.791 60.000 104.000 C 60.000 106.209 61.791 108.000 64.000 108.000 L 96.000 108.000 C 98.209 108.000 100.000 106.209 100.000 104.000 C 100.000 101.791 98.209 100.000 96.000 100.000 Z"),
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
        return _radio!!
    }

private var _radio: ImageVector? = null
