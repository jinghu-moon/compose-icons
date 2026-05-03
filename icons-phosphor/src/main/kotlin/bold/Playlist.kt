package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Playlist: ImageVector
    get() {
        if (_playlist != null) return _playlist!!
        _playlist = phosphorBoldIcon(
            name = "Playlist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 28.000 64.000 C 28.000 57.373 33.373 52.000 40.000 52.000 L 216.000 52.000 C 222.627 52.000 228.000 57.373 228.000 64.000 C 228.000 70.627 222.627 76.000 216.000 76.000 L 40.000 76.000 C 33.373 76.000 28.000 70.627 28.000 64.000 ZM 40.000 140.000 L 156.000 140.000 C 162.627 140.000 168.000 134.627 168.000 128.000 C 168.000 121.373 162.627 116.000 156.000 116.000 L 40.000 116.000 C 33.373 116.000 28.000 121.373 28.000 128.000 C 28.000 134.627 33.373 140.000 40.000 140.000 ZM 108.000 180.000 L 40.000 180.000 C 33.373 180.000 28.000 185.373 28.000 192.000 C 28.000 198.627 33.373 204.000 40.000 204.000 L 108.000 204.000 C 114.627 204.000 120.000 198.627 120.000 192.000 C 120.000 185.373 114.627 180.000 108.000 180.000 ZM 251.490 127.450 C 249.566 133.778 242.884 137.357 236.550 135.450 L 212.000 128.130 L 212.000 192.000 C 212.000 207.681 201.850 221.559 186.905 226.310 C 171.961 231.060 155.660 225.590 146.606 212.786 C 137.553 199.982 137.828 182.791 147.288 170.284 C 156.748 157.777 173.215 152.833 188.000 158.060 L 188.000 112.000 C 188.001 108.207 189.795 104.638 192.839 102.374 C 195.883 100.111 199.817 99.420 203.450 100.510 L 243.450 112.510 C 249.795 114.417 253.393 121.104 251.490 127.450 ZM 188.000 192.000 C 188.000 185.373 182.627 180.000 176.000 180.000 C 169.373 180.000 164.000 185.373 164.000 192.000 C 164.000 198.627 169.373 204.000 176.000 204.000 C 182.627 204.000 188.000 198.627 188.000 192.000 Z"),
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
        return _playlist!!
    }

private var _playlist: ImageVector? = null
