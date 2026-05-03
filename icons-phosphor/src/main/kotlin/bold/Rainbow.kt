package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Rainbow: ImageVector
    get() {
        if (_rainbow != null) return _rainbow!!
        _rainbow = phosphorBoldIcon(
            name = "Rainbow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 256.000 172.000 L 256.000 180.000 C 256.000 186.627 250.627 192.000 244.000 192.000 C 237.373 192.000 232.000 186.627 232.000 180.000 L 232.000 172.000 C 232.000 114.562 185.438 68.000 128.000 68.000 C 70.562 68.000 24.000 114.562 24.000 172.000 L 24.000 180.000 C 24.000 186.627 18.627 192.000 12.000 192.000 C 5.373 192.000 0.000 186.627 0.000 180.000 L 0.000 172.000 C 0.000 101.308 57.308 44.000 128.000 44.000 C 198.692 44.000 256.000 101.308 256.000 172.000 ZM 128.000 140.000 C 108.118 140.000 92.000 156.118 92.000 176.000 L 92.000 180.000 C 92.000 186.627 97.373 192.000 104.000 192.000 C 110.627 192.000 116.000 186.627 116.000 180.000 L 116.000 176.000 C 116.000 169.373 121.373 164.000 128.000 164.000 C 134.627 164.000 140.000 169.373 140.000 176.000 L 140.000 180.000 C 140.000 186.627 145.373 192.000 152.000 192.000 C 158.627 192.000 164.000 186.627 164.000 180.000 L 164.000 176.000 C 164.000 156.118 147.882 140.000 128.000 140.000 ZM 128.000 92.000 C 81.629 92.050 44.050 129.629 44.000 176.000 L 44.000 180.000 C 44.000 186.627 49.373 192.000 56.000 192.000 C 62.627 192.000 68.000 186.627 68.000 180.000 L 68.000 176.000 C 68.000 142.863 94.863 116.000 128.000 116.000 C 161.137 116.000 188.000 142.863 188.000 176.000 L 188.000 180.000 C 188.000 186.627 193.373 192.000 200.000 192.000 C 206.627 192.000 212.000 186.627 212.000 180.000 L 212.000 176.000 C 211.950 129.629 174.371 92.050 128.000 92.000 Z"),
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
        return _rainbow!!
    }

private var _rainbow: ImageVector? = null
