package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NotePencil: ImageVector
    get() {
        if (_notePencil != null) return _notePencil!!
        _notePencil = phosphorBoldIcon(
            name = "NotePencil",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.490 55.510 L 200.490 23.510 C 198.238 21.251 195.180 19.981 191.990 19.981 C 188.800 19.981 185.742 21.251 183.490 23.510 L 87.490 119.510 C 85.247 121.766 83.992 124.819 84.000 128.000 L 84.000 160.000 C 84.000 166.627 89.373 172.000 96.000 172.000 L 128.000 172.000 C 131.184 172.003 134.238 170.740 136.490 168.490 L 232.490 72.490 C 234.743 70.239 236.009 67.185 236.009 64.000 C 236.009 60.815 234.743 57.761 232.490 55.510 ZM 192.000 49.000 L 207.000 64.000 L 196.000 75.000 L 181.000 60.000 ZM 123.000 148.000 L 108.000 148.000 L 108.000 133.000 L 164.000 77.000 L 179.000 92.000 ZM 228.000 140.570 L 228.000 208.000 C 228.000 219.046 219.046 228.000 208.000 228.000 L 48.000 228.000 C 36.954 228.000 28.000 219.046 28.000 208.000 L 28.000 48.000 C 28.000 36.954 36.954 28.000 48.000 28.000 L 115.430 28.000 C 122.057 28.000 127.430 33.373 127.430 40.000 C 127.430 46.627 122.057 52.000 115.430 52.000 L 52.000 52.000 L 52.000 204.000 L 204.000 204.000 L 204.000 140.570 C 204.000 133.943 209.373 128.570 216.000 128.570 C 222.627 128.570 228.000 133.943 228.000 140.570 Z"),
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
        return _notePencil!!
    }

private var _notePencil: ImageVector? = null
